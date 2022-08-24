package com.VoidCallerZ.uc.blocks.compressor.iron;

import com.VoidCallerZ.uc.recipe.CompressorItemRecipe;
import com.VoidCallerZ.uc.registration.BlockRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.wrapper.CombinedInvWrapper;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.util.Optional;

public class IronCompressorBlockEntity extends BlockEntity implements MenuProvider
{
    private final ItemStackHandler inputItemHandler = new ItemStackHandler(1)
    {
        @Override
        protected void onContentsChanged(int slot)
        {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack)
        {
            if (stack.is(BlockRegistration.COMPRESSOR_VALID_ITEMS))
            {
                return true;
            }
            return false;
        }
    };

    private final ItemStackHandler outputItemHandler = new ItemStackHandler(1)
    {
        @Override
        protected void onContentsChanged(int slot)
        {
            setChanged();
        }
    };

    private final IItemHandler combinedItemHandler = new CombinedInvWrapper(inputItemHandler, outputItemHandler)
    {
        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack)
        {
            if (slot == 0 && stack.is(BlockRegistration.COMPRESSOR_VALID_ITEMS))
            {
                return true;
            }
            return false;
        }
    };

    private LazyOptional<IItemHandler> lazyInputItemHandler = LazyOptional.empty();
    private LazyOptional<IItemHandler> lazyOutputItemHandler = LazyOptional.empty();
    private LazyOptional<IItemHandler> lazyCombinedItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 100;

    protected NonNullList<ItemStack> items = NonNullList.withSize(3, ItemStack.EMPTY);

    public IronCompressorBlockEntity(BlockPos pWorldPosition, BlockState pBlockState)
    {
        super(BlockRegistration.IRON_COMPRESSOR_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
        this.data = new ContainerData()
        {
            @Override
            public int get(int index)
            {
                switch (index)
                {
                    case 0: return IronCompressorBlockEntity.this.progress;
                    case 1: return IronCompressorBlockEntity.this.maxProgress;
                    default: return 0;
                }
            }

            @Override
            public void set(int index, int value)
            {
                switch (index)
                {
                    case 0: IronCompressorBlockEntity.this.progress = value; break;
                    case 1: IronCompressorBlockEntity.this.maxProgress = value; break;
                }
            }

            @Override
            public int getCount()
            {
                return 2;
            }
        };
    }

    @Override
    public Component getDisplayName()
    {
        return Component.literal("Iron Compressor - Tier I");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer)
    {
        return new IronCompressorBlockMenu(pContainerId, pInventory, this, this.data);
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @javax.annotation.Nullable Direction side)
    {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
        {
            if (side == null)
            {
                return lazyCombinedItemHandler.cast();
            }
            else if (side == Direction.UP)
            {
                return lazyInputItemHandler.cast();
            }
            else if (side == Direction.DOWN)
            {
                return lazyOutputItemHandler.cast();
            }
        }

        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad()
    {
        super.onLoad();
        lazyInputItemHandler = LazyOptional.of(() -> inputItemHandler);
        lazyOutputItemHandler = LazyOptional.of(() -> outputItemHandler);
        lazyCombinedItemHandler = LazyOptional.of(() -> combinedItemHandler);
    }

    @Override
    public void invalidateCaps()
    {
        super.invalidateCaps();
        lazyInputItemHandler.invalidate();
        lazyOutputItemHandler.invalidate();
        lazyCombinedItemHandler.invalidate();
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag tag)
    {
        tag.put("inventory", inputItemHandler.serializeNBT());
        tag.putInt("compressor.progress", progress);
        super.saveAdditional(tag);
    }

    @Override
    public void load(CompoundTag nbt)
    {
        super.load(nbt);
        inputItemHandler.deserializeNBT(nbt.getCompound("inventory"));
        progress = nbt.getInt("compressor.progress");
    }

    public void drops()
    {
        SimpleContainer inventory = new SimpleContainer(combinedItemHandler.getSlots());
        for (int i = 0; i < combinedItemHandler.getSlots(); i++)
        {
            inventory.setItem(i, combinedItemHandler.getStackInSlot(i));
        }
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, IronCompressorBlockEntity blockEntity)
    {
        if (hasRecipe(blockEntity) && hasCorrectAmountOfInputItems(blockEntity))
        {
            blockEntity.progress++;
            setChanged(level, pos, state);
            if (blockEntity.progress > blockEntity.maxProgress)
            {
                craftItem(blockEntity);
            }
        }
        else
        {
            blockEntity.resetProgress();
            setChanged(level, pos, state);
        }
    }

    private static boolean hasRecipe(IronCompressorBlockEntity entity)
    {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.combinedItemHandler.getSlots());
        for (int i = 0; i < entity.combinedItemHandler.getSlots(); i++)
        {
            inventory.setItem(i, entity.combinedItemHandler.getStackInSlot(i));
        }
        Optional<CompressorItemRecipe> match = level.getRecipeManager().getRecipeFor(CompressorItemRecipe.Type.INSTANCE, inventory, level);
        return match.isPresent() && canInsertAmountIntoOutputSlot(inventory) && canInsertItemIntoOutputSlot(inventory, match.get().getResultItem());
    }

    private static boolean hasCorrectAmountOfInputItems(IronCompressorBlockEntity entity)
    {
        return entity.inputItemHandler.getStackInSlot(0).getCount() >= 9;
    }

    private static void craftItem(IronCompressorBlockEntity entity)
    {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.inputItemHandler.getSlots());
        for (int i = 0; i < entity.inputItemHandler.getSlots(); i++)
        {
            inventory.setItem(i, entity.inputItemHandler.getStackInSlot(i));
        }
        Optional<CompressorItemRecipe> match = level.getRecipeManager().getRecipeFor(CompressorItemRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent())
        {
            entity.inputItemHandler.extractItem(0, 9, false);
            entity.outputItemHandler.setStackInSlot(0, new ItemStack(match.get().getResultItem().getItem(), entity.outputItemHandler.getStackInSlot(0).getCount() + match.get().getResultItem().getCount()));

            entity.resetProgress();
        }
    }

    private void resetProgress()
    {
        this.progress = 0;
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory, ItemStack output)
    {
        return inventory.getItem(1).getItem() == output.getItem() || inventory.getItem(1).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleContainer inventory)
    {
        return inventory.getItem(1).getMaxStackSize() > inventory.getItem(1).getCount();
    }

}
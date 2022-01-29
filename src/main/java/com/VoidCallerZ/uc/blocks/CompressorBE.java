package com.VoidCallerZ.uc.blocks;

import com.VoidCallerZ.uc.setup.Registration;
import com.VoidCallerZ.uc.varia.CustomEnergyStorage;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class CompressorBE extends BlockEntity
{
    private static int INGOTS_PER_BLOCK = 9;
    public static final int ENERGY_CAPACITY = 10000;
    public static final int ENERGY_RECEIVE = 200;
    public static final int ENERGY_COMPRESS_TICK = 500;

    private final ItemStackHandler itemHandler = createHandler();
    private final LazyOptional<IItemHandler> handler = LazyOptional.of(() -> itemHandler);

    private final CustomEnergyStorage energy = createEnergyStorage();
    private final LazyOptional<IEnergyStorage> energyHandler = LazyOptional.of(() -> energy);

    private int compressingCounter = 0;

    public CompressorBE(BlockPos pos, BlockState state)
    {
        super(Registration.COMPRESSOR_BE.get(), pos, state);
    }

    @Override
    public void setRemoved()
    {
        super.setRemoved();
        handler.invalidate();
        energyHandler.invalidate();
    }

    public void tickServer()
    {
        ItemStack inputSlot = itemHandler.getStackInSlot(0);
        ItemStack outputSlot = itemHandler.getStackInSlot(1);
        if(inputSlot.getCount() >= INGOTS_PER_BLOCK)
        {
            if (("compressed_" + inputSlot.getItem()).equals(outputSlot.getItem().toString()) || ("compressed_" + inputSlot.getItem() + "_gem").equals(outputSlot.getItem().toString()))
            {
                itemHandler.extractItem(0, INGOTS_PER_BLOCK, false);
                setChanged();
                compressBlocks(inputSlot, true);
            }
            else if (outputSlot.isEmpty())
            {
                itemHandler.extractItem(0, INGOTS_PER_BLOCK, false);
                setChanged();
                compressBlocks(inputSlot, false);
            }
        }
    }

    private void compressBlocks(ItemStack stack, boolean canContinue)
    {
        if(energy.getEnergyStored() >= ENERGY_COMPRESS_TICK)
        {
            ItemStack item = itemHandler.getStackInSlot(1);
            if (canContinue)
            {
                energy.consumeEnergy(ENERGY_COMPRESS_TICK);
                item = item.copy();
                item.grow(1);
                itemHandler.setStackInSlot(1, item);
            }
            else
            {
                if (stack.is(Items.IRON_INGOT))
                {
                    itemHandler.setStackInSlot(1, Registration.COMPRESSED_IRON_INGOT.get().getDefaultInstance());
                }
                else if (stack.is(Items.GOLD_INGOT))
                {
                    itemHandler.setStackInSlot(1, Registration.COMPRESSED_GOLD_INGOT.get().getDefaultInstance());
                }
                else if (stack.is(Items.COPPER_INGOT))
                {
                    itemHandler.setStackInSlot(1, Registration.COMPRESSED_COPPER_INGOT.get().getDefaultInstance());
                }
                else
                {
                    itemHandler.setStackInSlot(1, Registration.COMPRESSED_DIAMOND_GEM.get().getDefaultInstance());
                }
            }
        }
    }

    private ItemStackHandler createHandler()
    {
        return new ItemStackHandler(2) {

            @Override
            protected void onContentsChanged(int slot) {
                // To make sure the TE persists when the chunk is saved later we need to
                // mark it dirty every time the item handler changes
                setChanged();
            }

            @Override
            public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
                if (slot == 0)
                {
                    return compressorValid(stack);
                }
                return false;
            }

            @Nonnull
            @Override
            public ItemStack insertItem(int slot, @Nonnull ItemStack stack, boolean simulate) {
                if (!compressorValid(stack)) {
                    return stack;
                }
                return super.insertItem(slot, stack, simulate);
            }
        };
    }

    private ItemStackHandler createOutputHandler()
    {
        return new ItemStackHandler(1)
        {
            @Override
            protected void onContentsChanged(int slot)
            {
                setChanged();
            }
        };
    }

    private CustomEnergyStorage createEnergyStorage()
    {
        return new CustomEnergyStorage(ENERGY_CAPACITY, ENERGY_RECEIVE)
        {
            @Override
            protected void onEnergyChanged()
            {
                setChanged();
            }
        };
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        tag.put("Inventory", itemHandler.serializeNBT());
        tag.put("Energy", energy.serializeNBT());
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        if (tag.contains("Inventory")) {
            itemHandler.deserializeNBT(tag.getCompound("Inventory"));
        }
        if (tag.contains("Energy")) {
            energy.deserializeNBT(tag.get("Energy"));
        }
        super.load(tag);
    }

    @NotNull
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side)
    {
        if(cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
        {
            return handler.cast();
        }
        if(cap == CapabilityEnergy.ENERGY)
        {
            return energyHandler.cast();
        }
        return super.getCapability(cap, side);
    }

    public static boolean compressorValid(ItemStack stack)
    {
        return stack.is(Registration.COMPRESSOR_VALID_ITEMS);
    }
}

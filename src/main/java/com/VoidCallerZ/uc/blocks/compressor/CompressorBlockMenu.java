package com.VoidCallerZ.uc.blocks.compressor;

import com.VoidCallerZ.uc.registration.BlockRegistration;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public abstract class CompressorBlockMenu extends AbstractContainerMenu
{
    public final CompressorBlockEntity blockEntity;
    public final Level level;
    public final ContainerData data;

    public CompressorBlockMenu(MenuType<?> menuType, int containerId, Inventory inventory, BlockEntity entity)
    {
        this(menuType, containerId, inventory, entity, new SimpleContainerData(2));
    }

    public CompressorBlockMenu(MenuType<?> block, int containerId, Inventory inventory, BlockEntity entity, ContainerData data)
    {
        super(block, containerId);
        checkContainerSize(inventory, 2);
        blockEntity = ((CompressorBlockEntity) entity);
        this.level = inventory.player.level;
        this.data = data;

        addPlayerInventory(inventory);
        addPlayerHotbar(inventory);

        this.blockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(handler ->
        {
            this.addSlot(new SlotItemHandler(handler, 0, 80, 28));
            this.addSlot(new SlotItemHandler(handler, 1, 80, 59));
        });

        addDataSlots(data);
    }

    public boolean isCrafting()
    {
        return this.blockEntity.progress > 0;
        //return data.get(0) > 0;
    }

    public int getScaledProgress()
    {
//        int progress = this.data.get(0);
//        int maxProgress = this.data.get(1);
        int progress = this.blockEntity.progress;
        int maxProgress = this.blockEntity.maxProgress;
        int progressArrowSize = 26;

        return maxProgress != 0 && progress != 0 ? progress * progressArrowSize / maxProgress : 0;
    }

    //CREDIT TO THIS AREA GOES TO: diesieben07 | https://github.com/diesieben07/SevenCommons
    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;

    private static final int TE_INVENTORY_SLOT_COUNT = 2;

    @Override
    public ItemStack quickMoveStack(Player playerIn, int index) {
        Slot sourceSlot = slots.get(index);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;  //EMPTY_ITEM
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        // Check if the slot clicked is one of the vanilla container slots
        if (sourceStack.is(BlockRegistration.COMPRESSOR_VALID_ITEMS) && index < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT)
        {
            // This is a vanilla container slot so merge the stack into the tile inventory
            if (!moveItemStackTo(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT, false))
            {
                return ItemStack.EMPTY;  // EMPTY_ITEM
            }
        }
        else if (sourceStack.is(BlockRegistration.COMPRESSOR_VALID_ITEMS) && index < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT)
        {
            // This is a TE slot so merge the stack into the players inventory
            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false))
            {
                return ItemStack.EMPTY;
            }
        }
        else if (index == 37)
        {
            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false))
            {
                return ItemStack.EMPTY;
            }
        }
        else
        {
            return ItemStack.EMPTY;
        }
        // If stack size == 0 (the entire stack was moved) set slot contents to null
        if (sourceStack.getCount() == 0) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(playerIn, sourceStack);
        return copyOfSourceStack;
    }

    @Override
    public boolean stillValid(Player player)
    {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()), player, blockEntity.getBlockState().getBlock());
    }

    private void addPlayerInventory(Inventory inventory)
    {
        for (int i = 0; i < 3; i++)
        {
            for (int l = 0; l < 9; l++)
            {
                this.addSlot(new Slot(inventory, l + i * 9 + 9, 8 + l * 18, 86 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory inventory)
    {
        for (int i = 0; i < 9; i++)
        {
            this.addSlot(new Slot(inventory, i, 8 + i * 18, 144));
        }
    }
}

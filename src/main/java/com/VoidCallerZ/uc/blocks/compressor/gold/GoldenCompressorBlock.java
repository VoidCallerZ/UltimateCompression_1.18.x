package com.VoidCallerZ.uc.blocks.compressor.gold;

import com.VoidCallerZ.uc.blocks.compressor.CompressorBlock;
import com.VoidCallerZ.uc.registration.BlockRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.Nullable;

public class GoldenCompressorBlock extends CompressorBlock
{
    public GoldenCompressorBlock(Properties properties)
    {
        super(properties);
    }

    public BlockEntity newBlockEntity(BlockPos pos, BlockState state)
    {
        return new GoldenCompressorBlockEntity(pos, state);
    }

    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType)
    {
        return createTickerHelper(blockEntityType, BlockRegistration.GOLDEN_COMPRESSOR_BLOCK_ENTITY.get(), GoldenCompressorBlockEntity::tick);
    }

    @Override
    protected void openContainer(Level level, BlockPos pos, Player player)
    {
        BlockEntity entity = level.getBlockEntity(pos);
        if (entity instanceof GoldenCompressorBlockEntity)
        {
            NetworkHooks.openGui(((ServerPlayer) player), (GoldenCompressorBlockEntity) entity, pos);
        }
        else
        {
            throw new IllegalStateException("Our container provider is missing");
        }
    }
}

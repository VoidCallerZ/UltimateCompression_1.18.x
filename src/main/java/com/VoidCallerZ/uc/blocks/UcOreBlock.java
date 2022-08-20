package com.VoidCallerZ.uc.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class UcOreBlock extends Block
{
    private final int xpMinRange;
    private final int xpRange;

    public UcOreBlock(Properties properties)
    {
        super(properties);
        this.xpMinRange = 0;
        this.xpRange = 0;
    }

    public UcOreBlock(Properties properties, int xpRange)
    {
        super(properties);
        this.xpMinRange = 0;
        this.xpRange = xpRange;
    }

    public UcOreBlock(Properties properties, int xpMinRange, int xpRange)
    {
        super(properties);
        this.xpMinRange = xpMinRange;
        this.xpRange = xpRange;
    }

    @Override
    public int getExpDrop(BlockState state, LevelReader world, RandomSource randomSource, BlockPos pos, int fortuneLevel, int silkTouchLevel)
    {
        return silkTouchLevel == 0 ? randomSource.nextInt(xpMinRange, xpRange) : 0;
    }
}

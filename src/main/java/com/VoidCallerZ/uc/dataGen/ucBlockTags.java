package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.setup.registration.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ucBlockTags extends BlockTagsProvider
{
    public ucBlockTags(DataGenerator generator, ExistingFileHelper helper)
    {
        super(generator, UltimateCompression.MODID, helper);
    }

    @Override
    protected void addTags()
    {
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(Registration.COMPRESSED_ACACIA_LOG.get())
                .add(Registration.COMPRESSED_ACACIA_PLANKS.get())
                .add(Registration.COMPRESSED_BIRCH_LOG.get())
                .add(Registration.COMPRESSED_BIRCH_PLANKS.get())
                .add(Registration.COMPRESSED_DARK_OAK_LOG.get())
                .add(Registration.COMPRESSED_DARK_OAK_PLANKS.get())
                .add(Registration.COMPRESSED_JUNGLE_LOG.get())
                .add(Registration.COMPRESSED_JUNGLE_PLANKS.get())
                .add(Registration.COMPRESSED_OAK_LOG.get())
                .add(Registration.COMPRESSED_OAK_PLANKS.get())
                .add(Registration.COMPRESSED_SPRUCE_LOG.get())
                .add(Registration.COMPRESSED_SPRUCE_PLANKS.get())
                .add(Registration.COMPRESSED_CRIMSON_STEM.get())
                .add(Registration.COMPRESSED_CRIMSON_PLANKS.get())
                .add(Registration.COMPRESSED_WARPED_STEM.get())
                .add(Registration.COMPRESSED_WARPED_PLANKS.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.ULTIMATE_POWERGEN.get())
                .add(Registration.COMPRESSOR.get())
                .add(Registration.COMPRESSOR.get())
                .add(Registration.COMPRESSED_IRON_ORE.get())
                .add(Registration.COMPRESSED_GOLD_ORE.get())
                .add(Registration.COMPRESSED_DIAMOND_ORE.get())
                .add(Registration.COMPRESSED_COPPER_ORE.get())
                .add(Registration.COMPRESSED_COAL_ORE.get())
                .add(Registration.COMPRESSED_EMERALD_ORE.get())
                .add(Registration.COMPRESSED_LAPIS_ORE.get())
                .add(Registration.COMPRESSED_REDSTONE_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_IRON_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_GOLD_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_COPPER_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_COAL_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get())
                .add(Registration.COMPRESSED_IRON_BLOCK.get())
                .add(Registration.COMPRESSED_GOLD_BLOCK.get())
                .add(Registration.COMPRESSED_DIAMOND_BLOCK.get())
                .add(Registration.COMPRESSED_COPPER_BLOCK.get())
                .add(Registration.COMPRESSED_COAL_BLOCK.get())
                .add(Registration.COMPRESSED_EMERALD_BLOCK.get())
                .add(Registration.COMPRESSED_LAPIS_BLOCK.get())
                .add(Registration.COMPRESSED_REDSTONE_BLOCK.get())
                .add(Registration.COMPRESSED_NETHERITE_BLOCK.get())
                .add(Registration.COMPRESSED_RAW_IRON_BLOCK.get())
                .add(Registration.COMPRESSED_RAW_COPPER_BLOCK.get())
                .add(Registration.COMPRESSED_NETHER_GOLD_ORE.get())
                .add(Registration.COMPRESSED_NETHER_QUARTZ_ORE.get())
                .add(Registration.COMPRESSED_NETHER_QUARTZ_BLOCK.get())
                .add(Registration.COMPRESSED_BASALT.get())
                .add(Registration.COMPRESSED_BLACKSTONE.get())
                .add(Registration.COMPRESSED_GLOWSTONE.get())
                .add(Registration.COMPRESSED_MAGMA.get())
                .add(Registration.COMPRESSED_ANDESITE.get())
                .add(Registration.COMPRESSED_CALCITE.get())
                .add(Registration.COMPRESSED_COBBLED_DEEPSLATE.get())
                .add(Registration.COMPRESSED_COBBLESTONE.get())
                .add(Registration.COMPRESSED_DEEPSLATE.get())
                .add(Registration.COMPRESSED_DIORITE.get())
                .add(Registration.COMPRESSED_GRANITE.get())
                .add(Registration.COMPRESSED_MOSSY_COBBLESTONE.get())
                .add(Registration.COMPRESSED_NETHERRACK.get())
                .add(Registration.COMPRESSED_STONE.get())
                .add(Registration.COMPRESSED_TUFF.get())
                .add(Registration.COMPRESSED_POLISHED_ANDESITE.get())
                .add(Registration.COMPRESSED_POLISHED_BASALT.get())
                .add(Registration.COMPRESSED_POLISHED_BLACKSTONE.get())
                .add(Registration.COMPRESSED_POLISHED_BLACKSTONE_BRICKS.get())
                .add(Registration.COMPRESSED_POLISHED_DEEPSLATE.get())
                .add(Registration.COMPRESSED_POLISHED_DIORITE.get())
                .add(Registration.COMPRESSED_POLISHED_GRANITE.get())
                .add(Registration.COMPRESSED_SMOOTH_BASALT.get())
                .add(Registration.COMPRESSED_SMOOTH_STONE.get())
                .add(Registration.COMPRESSED_CHISELED_STONE_BRICKS.get())
                .add(Registration.COMPRESSED_CRACKED_STONE_BRICKS.get())
                .add(Registration.COMPRESSED_MOSSY_STONE_BRICKS.get())
                .add(Registration.COMPRESSED_STONE_BRICKS.get());

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(Registration.COMPRESSED_GRAVEL.get())
                .add(Registration.COMPRESSED_DIRT.get())
                .add(Registration.COMPRESSED_RED_SAND.get())
                .add(Registration.COMPRESSED_SAND.get())
                .add(Registration.COMPRESSED_SOUL_SAND.get())
                .add(Registration.COMPRESSED_SOUL_SOIL.get())
                .add(Registration.COMPRESSED_CLAY.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(Registration.COMPRESSED_IRON_ORE.get())
                .add(Registration.COMPRESSED_COPPER_ORE.get())
                .add(Registration.COMPRESSED_IRON_BLOCK.get())
                .add(Registration.COMPRESSED_COPPER_BLOCK.get())
                .add(Registration.COMPRESSED_COAL_BLOCK.get())
                .add(Registration.COMPRESSED_COAL_ORE.get())
                .add(Registration.COMPRESSED_RAW_IRON_BLOCK.get())
                .add(Registration.COMPRESSED_RAW_COPPER_BLOCK.get())
                .add(Registration.COMPRESSED_NETHER_GOLD_ORE.get())
                .add(Registration.COMPRESSED_NETHER_QUARTZ_ORE.get())
                .add(Registration.COMPRESSED_NETHER_QUARTZ_BLOCK.get())
                .add(Registration.COMPRESSED_BASALT.get())
                .add(Registration.COMPRESSED_BLACKSTONE.get())
                .add(Registration.COMPRESSED_GLOWSTONE.get())
                .add(Registration.COMPRESSED_MAGMA.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.ULTIMATE_POWERGEN.get())
                .add(Registration.COMPRESSOR.get())
                .add(Registration.COMPRESSED_GOLD_ORE.get())
                .add(Registration.COMPRESSED_DIAMOND_ORE.get())
                .add(Registration.COMPRESSED_EMERALD_ORE.get())
                .add(Registration.COMPRESSED_LAPIS_ORE.get())
                .add(Registration.COMPRESSED_REDSTONE_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_IRON_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_GOLD_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_COPPER_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_COAL_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get())
                .add(Registration.COMPRESSED_GOLD_BLOCK.get())
                .add(Registration.COMPRESSED_DIAMOND_BLOCK.get())
                .add(Registration.COMPRESSED_EMERALD_BLOCK.get())
                .add(Registration.COMPRESSED_LAPIS_BLOCK.get())
                .add(Registration.COMPRESSED_REDSTONE_BLOCK.get())
                .add(Registration.COMPRESSED_NETHERITE_BLOCK.get())
                .add(Registration.COMPRESSED_RAW_GOLD_BLOCK.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.COMPRESSED_IRON_ORE.get())
                .add(Registration.COMPRESSED_GOLD_ORE.get())
                .add(Registration.COMPRESSED_DIAMOND_ORE.get())
                .add(Registration.COMPRESSED_COPPER_ORE.get())
                .add(Registration.COMPRESSED_COAL_ORE.get())
                .add(Registration.COMPRESSED_EMERALD_ORE.get())
                .add(Registration.COMPRESSED_LAPIS_ORE.get())
                .add(Registration.COMPRESSED_REDSTONE_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_IRON_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_GOLD_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_COPPER_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_COAL_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get())
                .add(Registration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get());
        tag(Tags.Blocks.STORAGE_BLOCKS)
                .add(Registration.COMPRESSED_IRON_BLOCK.get())
                .add(Registration.COMPRESSED_GOLD_BLOCK.get())
                .add(Registration.COMPRESSED_DIAMOND_BLOCK.get())
                .add(Registration.COMPRESSED_GOLD_BLOCK.get())
                .add(Registration.COMPRESSED_RAW_IRON_BLOCK.get())
                .add(Registration.COMPRESSED_RAW_GOLD_BLOCK.get())
                .add(Registration.COMPRESSED_RAW_COPPER_BLOCK.get())
                .add(Registration.COMPRESSED_ACACIA_LOG.get())
                .add(Registration.COMPRESSED_ACACIA_PLANKS.get())
                .add(Registration.COMPRESSED_BIRCH_LOG.get())
                .add(Registration.COMPRESSED_BIRCH_PLANKS.get())
                .add(Registration.COMPRESSED_DARK_OAK_LOG.get())
                .add(Registration.COMPRESSED_DARK_OAK_PLANKS.get())
                .add(Registration.COMPRESSED_JUNGLE_LOG.get())
                .add(Registration.COMPRESSED_JUNGLE_PLANKS.get())
                .add(Registration.COMPRESSED_OAK_LOG.get())
                .add(Registration.COMPRESSED_OAK_PLANKS.get())
                .add(Registration.COMPRESSED_SPRUCE_LOG.get())
                .add(Registration.COMPRESSED_SPRUCE_PLANKS.get())
                .add(Registration.COMPRESSED_CRIMSON_STEM.get())
                .add(Registration.COMPRESSED_CRIMSON_PLANKS.get())
                .add(Registration.COMPRESSED_WARPED_STEM.get())
                .add(Registration.COMPRESSED_WARPED_PLANKS.get());

        /*tag(Registration.COMPRESSED_ORE)
                .add(Registration.COMPRESSED_IRON_ORE.get())
                .add(Registration.COMPRESSED_GOLD_ORE.get())
                .add(Registration.COMPRESSED_DIAMOND_ORE.get())
                .add(Registration.COMPRESSED_COPPER_ORE.get());*/
    }

    @Override
    public String getName()
    {
        return "UC Tags";
    }
}

package com.VoidCallerZ.uc.dataGen;

import com.VoidCallerZ.uc.UltimateCompression;
import com.VoidCallerZ.uc.registration.BlockRegistration;
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
                .add(BlockRegistration.COMPRESSED_ACACIA_LOG.get())
                .add(BlockRegistration.COMPRESSED_ACACIA_PLANKS.get())
                .add(BlockRegistration.COMPRESSED_BIRCH_LOG.get())
                .add(BlockRegistration.COMPRESSED_BIRCH_PLANKS.get())
                .add(BlockRegistration.COMPRESSED_DARK_OAK_LOG.get())
                .add(BlockRegistration.COMPRESSED_DARK_OAK_PLANKS.get())
                .add(BlockRegistration.COMPRESSED_JUNGLE_LOG.get())
                .add(BlockRegistration.COMPRESSED_JUNGLE_PLANKS.get())
                .add(BlockRegistration.COMPRESSED_OAK_LOG.get())
                .add(BlockRegistration.COMPRESSED_OAK_PLANKS.get())
                .add(BlockRegistration.COMPRESSED_SPRUCE_LOG.get())
                .add(BlockRegistration.COMPRESSED_SPRUCE_PLANKS.get())
                .add(BlockRegistration.COMPRESSED_CRIMSON_STEM.get())
                .add(BlockRegistration.COMPRESSED_CRIMSON_PLANKS.get())
                .add(BlockRegistration.COMPRESSED_WARPED_STEM.get())
                .add(BlockRegistration.COMPRESSED_WARPED_PLANKS.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockRegistration.IRON_COMPRESSOR.get())
                .add(BlockRegistration.GOLDEN_COMPRESSOR.get())
                .add(BlockRegistration.DIAMOND_COMPRESSOR.get())
                .add(BlockRegistration.NETHERITE_COMPRESSOR.get())
                .add(BlockRegistration.COMPRESSED_IRON_ORE.get())
                .add(BlockRegistration.COMPRESSED_GOLD_ORE.get())
                .add(BlockRegistration.COMPRESSED_DIAMOND_ORE.get())
                .add(BlockRegistration.COMPRESSED_COPPER_ORE.get())
                .add(BlockRegistration.COMPRESSED_COAL_ORE.get())
                .add(BlockRegistration.COMPRESSED_EMERALD_ORE.get())
                .add(BlockRegistration.COMPRESSED_LAPIS_ORE.get())
                .add(BlockRegistration.COMPRESSED_REDSTONE_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_IRON_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_GOLD_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_COPPER_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_COAL_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get())
                .add(BlockRegistration.COMPRESSED_IRON_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_GOLD_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_DIAMOND_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_COPPER_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_COAL_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_EMERALD_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_LAPIS_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_REDSTONE_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_NETHERITE_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_RAW_IRON_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_RAW_GOLD_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_RAW_COPPER_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_NETHER_GOLD_ORE.get())
                .add(BlockRegistration.COMPRESSED_NETHER_QUARTZ_ORE.get())
                .add(BlockRegistration.COMPRESSED_NETHER_QUARTZ_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_BASALT.get())
                .add(BlockRegistration.COMPRESSED_BLACKSTONE.get())
                .add(BlockRegistration.COMPRESSED_CHISELED_POLISHED_BLACKSTONE.get())
                .add(BlockRegistration.COMPRESSED_CRACKED_POLISHED_BLACKSTONE_BRICKS.get())
                .add(BlockRegistration.COMPRESSED_GILDED_BLACKSTONE.get())
                .add(BlockRegistration.COMPRESSED_GLOWSTONE.get())
                .add(BlockRegistration.COMPRESSED_MAGMA.get())
                .add(BlockRegistration.COMPRESSED_ANDESITE.get())
                .add(BlockRegistration.COMPRESSED_CALCITE.get())
                .add(BlockRegistration.COMPRESSED_COBBLED_DEEPSLATE.get())
                .add(BlockRegistration.COMPRESSED_COBBLESTONE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE.get())
                .add(BlockRegistration.COMPRESSED_DIORITE.get())
                .add(BlockRegistration.COMPRESSED_GRANITE.get())
                .add(BlockRegistration.COMPRESSED_MOSSY_COBBLESTONE.get())
                .add(BlockRegistration.COMPRESSED_NETHERRACK.get())
                .add(BlockRegistration.COMPRESSED_STONE.get())
                .add(BlockRegistration.COMPRESSED_TUFF.get())
                .add(BlockRegistration.COMPRESSED_POLISHED_ANDESITE.get())
                .add(BlockRegistration.COMPRESSED_POLISHED_BASALT.get())
                .add(BlockRegistration.COMPRESSED_POLISHED_BLACKSTONE.get())
                .add(BlockRegistration.COMPRESSED_POLISHED_BLACKSTONE_BRICKS.get())
                .add(BlockRegistration.COMPRESSED_POLISHED_DEEPSLATE.get())
                .add(BlockRegistration.COMPRESSED_POLISHED_DIORITE.get())
                .add(BlockRegistration.COMPRESSED_POLISHED_GRANITE.get())
                .add(BlockRegistration.COMPRESSED_SMOOTH_BASALT.get())
                .add(BlockRegistration.COMPRESSED_SMOOTH_STONE.get())
                .add(BlockRegistration.COMPRESSED_CHISELED_STONE_BRICKS.get())
                .add(BlockRegistration.COMPRESSED_CRACKED_STONE_BRICKS.get())
                .add(BlockRegistration.COMPRESSED_MOSSY_STONE_BRICKS.get())
                .add(BlockRegistration.COMPRESSED_STONE_BRICKS.get())
                .add(BlockRegistration.COMPRESSED_CHISELED_RED_SANDSTONE.get())
                .add(BlockRegistration.COMPRESSED_CHISELED_SANDSTONE.get())
                .add(BlockRegistration.COMPRESSED_CUT_RED_SANDSTONE.get())
                .add(BlockRegistration.COMPRESSED_CUT_SANDSTONE.get())
                .add(BlockRegistration.COMPRESSED_RED_SANDSTONE.get())
                .add(BlockRegistration.COMPRESSED_SANDSTONE.get())
                .add(BlockRegistration.COMPRESSED_OBSIDIAN.get())
                .add(BlockRegistration.DOUBLE_COMPRESSED_COBBLED_DEEPSLATE.get())
                .add(BlockRegistration.DOUBLE_COMPRESSED_COBBLESTONE.get())
                .add(BlockRegistration.DOUBLE_COMPRESSED_DEEPSLATE.get())
                .add(BlockRegistration.DOUBLE_COMPRESSED_DIRT.get())
                .add(BlockRegistration.DOUBLE_COMPRESSED_GRAVEL.get())
                .add(BlockRegistration.DOUBLE_COMPRESSED_NETHERRACK.get())
                .add(BlockRegistration.DOUBLE_COMPRESSED_RED_SAND.get())
                .add(BlockRegistration.DOUBLE_COMPRESSED_SAND.get())
                .add(BlockRegistration.DOUBLE_COMPRESSED_STONE.get())
                .add(BlockRegistration.COMPRESSED_BONE_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_CRIMSON_NYLIUM.get())
                .add(BlockRegistration.COMPRESSED_CRYING_OBSIDIAN.get())
                .add(BlockRegistration.COMPRESSED_LODESTONE.get())
                .add(BlockRegistration.COMPRESSED_RED_NETHER_BRICKS.get())
                .add(BlockRegistration.COMPRESSED_WARPED_NYLIUM.get())
                .add(BlockRegistration.COMPRESSED_ANCIENT_DEBRIS.get());

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(BlockRegistration.COMPRESSED_GRAVEL.get())
                .add(BlockRegistration.COMPRESSED_DIRT.get())
                .add(BlockRegistration.COMPRESSED_RED_SAND.get())
                .add(BlockRegistration.COMPRESSED_SAND.get())
                .add(BlockRegistration.COMPRESSED_SOUL_SAND.get())
                .add(BlockRegistration.COMPRESSED_SOUL_SOIL.get())
                .add(BlockRegistration.COMPRESSED_CLAY.get())
                .add(BlockRegistration.COMPRESSED_SNOW_BLOCK.get());

        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(BlockRegistration.COMPRESSED_ACACIA_LEAVES.get())
                .add(BlockRegistration.COMPRESSED_BIRCH_LEAVES.get())
                .add(BlockRegistration.COMPRESSED_DARK_OAK_LEAVES.get())
                .add(BlockRegistration.COMPRESSED_JUNGLE_LEAVES.get())
                .add(BlockRegistration.COMPRESSED_OAK_LEAVES.get())
                .add(BlockRegistration.COMPRESSED_SPRUCE_LEAVES.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(BlockRegistration.COMPRESSED_IRON_ORE.get())
                .add(BlockRegistration.COMPRESSED_COPPER_ORE.get())
                .add(BlockRegistration.COMPRESSED_IRON_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_COPPER_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_COAL_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_COAL_ORE.get())
                .add(BlockRegistration.COMPRESSED_RAW_IRON_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_RAW_COPPER_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_NETHER_GOLD_ORE.get())
                .add(BlockRegistration.COMPRESSED_NETHER_QUARTZ_ORE.get())
                .add(BlockRegistration.COMPRESSED_NETHER_QUARTZ_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_BASALT.get())
                .add(BlockRegistration.COMPRESSED_BLACKSTONE.get())
                .add(BlockRegistration.COMPRESSED_GLOWSTONE.get())
                .add(BlockRegistration.COMPRESSED_MAGMA.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(BlockRegistration.IRON_COMPRESSOR.get())
                .add(BlockRegistration.GOLDEN_COMPRESSOR.get())
                .add(BlockRegistration.DIAMOND_COMPRESSOR.get())
                .add(BlockRegistration.NETHERITE_COMPRESSOR.get())
                .add(BlockRegistration.COMPRESSED_GOLD_ORE.get())
                .add(BlockRegistration.COMPRESSED_DIAMOND_ORE.get())
                .add(BlockRegistration.COMPRESSED_EMERALD_ORE.get())
                .add(BlockRegistration.COMPRESSED_LAPIS_ORE.get())
                .add(BlockRegistration.COMPRESSED_REDSTONE_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_IRON_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_GOLD_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_COPPER_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_COAL_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get())
                .add(BlockRegistration.COMPRESSED_GOLD_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_DIAMOND_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_EMERALD_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_LAPIS_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_REDSTONE_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_NETHERITE_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_RAW_GOLD_BLOCK.get());
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(BlockRegistration.COMPRESSED_ANCIENT_DEBRIS.get());
        tag(Tags.Blocks.ORES)
                .add(BlockRegistration.COMPRESSED_IRON_ORE.get())
                .add(BlockRegistration.COMPRESSED_GOLD_ORE.get())
                .add(BlockRegistration.COMPRESSED_DIAMOND_ORE.get())
                .add(BlockRegistration.COMPRESSED_COPPER_ORE.get())
                .add(BlockRegistration.COMPRESSED_COAL_ORE.get())
                .add(BlockRegistration.COMPRESSED_EMERALD_ORE.get())
                .add(BlockRegistration.COMPRESSED_LAPIS_ORE.get())
                .add(BlockRegistration.COMPRESSED_REDSTONE_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_IRON_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_GOLD_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_COPPER_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_COAL_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_EMERALD_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_LAPIS_ORE.get())
                .add(BlockRegistration.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get())
                .add(BlockRegistration.COMPRESSED_ANCIENT_DEBRIS.get());
        tag(Tags.Blocks.STORAGE_BLOCKS)
                .add(BlockRegistration.COMPRESSED_IRON_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_GOLD_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_DIAMOND_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_GOLD_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_RAW_IRON_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_RAW_GOLD_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_RAW_COPPER_BLOCK.get())
                .add(BlockRegistration.COMPRESSED_ACACIA_LOG.get())
                .add(BlockRegistration.COMPRESSED_ACACIA_PLANKS.get())
                .add(BlockRegistration.COMPRESSED_BIRCH_LOG.get())
                .add(BlockRegistration.COMPRESSED_BIRCH_PLANKS.get())
                .add(BlockRegistration.COMPRESSED_DARK_OAK_LOG.get())
                .add(BlockRegistration.COMPRESSED_DARK_OAK_PLANKS.get())
                .add(BlockRegistration.COMPRESSED_JUNGLE_LOG.get())
                .add(BlockRegistration.COMPRESSED_JUNGLE_PLANKS.get())
                .add(BlockRegistration.COMPRESSED_OAK_LOG.get())
                .add(BlockRegistration.COMPRESSED_OAK_PLANKS.get())
                .add(BlockRegistration.COMPRESSED_SPRUCE_LOG.get())
                .add(BlockRegistration.COMPRESSED_SPRUCE_PLANKS.get())
                .add(BlockRegistration.COMPRESSED_CRIMSON_STEM.get())
                .add(BlockRegistration.COMPRESSED_CRIMSON_PLANKS.get())
                .add(BlockRegistration.COMPRESSED_WARPED_STEM.get())
                .add(BlockRegistration.COMPRESSED_WARPED_PLANKS.get());

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

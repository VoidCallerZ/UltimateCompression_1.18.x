package com.VoidCallerZ.uc.registration;

import com.VoidCallerZ.uc.world.ores.Ores;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.VoidCallerZ.uc.UltimateCompression.MODID;

public class WorldGenRegistration
{
    private static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, MODID);
    private static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, MODID);

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        CONFIGURED_FEATURES.register(bus);
        PLACED_FEATURES.register(bus);
    }

    public static final int OVERWORLD_VEINSIZE = 5;
    public static final int OVERWORLD_AMOUNT = 3;
    public static final int DEEPSLATE_VEINSIZE = 5;
    public static final int DEEPSLATE_AMOUNT = 4;

    public static final int OVERWORLD_DIAMOND_VEINSIZE = 1;
    public static final int OVERWORLD_DIAMOND_AMOUNT = 3;
    public static final int DEEPSLATE_DIAMOND_VEINSIZE = 3;
    public static final int DEEPSLATE_DIAMOND_AMOUNT = 4;

    public static final int OVERWORLD_COAL_VEINSIZE = 14;
    public static final int OVERWORLD_COAL_AMOUNT = 6;
    public static final int DEEPSLATE_COAL_VEINSIZE = 3;
    public static final int DEEPSLATE_COAL_AMOUNT = 6;

    public static final int NETHER_GOLD_ORE_VEINSIZE = 5;
    public static final int NETHER_GOLD_ORE_AMOUNT = 10;
    public static final int NETHER_QUARTZ_ORE_VEINSIZE = 10;
    public static final int NETHER_QUARTZ_ORE_AMOUNT = 16;
    public static final int ANCIENT_DEBRIS_VEINSIZE = 3;
    public static final int ANCIENT_DEBRIS_AMOUNT = 1;

    //Overworld Ores
    public static final RegistryObject<PlacedFeature> COMPRESSED_IRON_ORE_GEN = PLACED_FEATURES.register("compressed_iron_ore", () -> Ores.createOverworldOregen(false, true, BlockRegistration.COMPRESSED_IRON_ORE, OVERWORLD_VEINSIZE, OVERWORLD_AMOUNT, 48).value());
    public static final RegistryObject<PlacedFeature> COMPRESSED_GOLD_ORE_GEN = PLACED_FEATURES.register("compressed_gold_ore", () -> Ores.createOverworldOregen(false, true, BlockRegistration.COMPRESSED_GOLD_ORE, OVERWORLD_VEINSIZE, OVERWORLD_AMOUNT, 48).value());
    public static final RegistryObject<PlacedFeature> COMPRESSED_COPPER_ORE_GEN = PLACED_FEATURES.register("compressed_copper_ore", () -> Ores.createOverworldOregen(false, true, BlockRegistration.COMPRESSED_COPPER_ORE, OVERWORLD_VEINSIZE, OVERWORLD_AMOUNT, 96).value());
    public static final RegistryObject<PlacedFeature> COMPRESSED_DIAMOND_ORE_GEN = PLACED_FEATURES.register("compressed_diamond_ore", () -> Ores.createOverworldOregen(false, true, BlockRegistration.COMPRESSED_DIAMOND_ORE, OVERWORLD_DIAMOND_VEINSIZE, OVERWORLD_DIAMOND_AMOUNT, 16).value());
    public static final RegistryObject<PlacedFeature> COMPRESSED_COAL_ORE_GEN = PLACED_FEATURES.register("compressed_coal_ore", () -> Ores.createOverworldOregen(false, false, BlockRegistration.COMPRESSED_COAL_ORE, OVERWORLD_COAL_VEINSIZE, OVERWORLD_COAL_AMOUNT, 255).value());
    public static final RegistryObject<PlacedFeature> COMPRESSED_EMERALD_ORE_GEN = PLACED_FEATURES.register("compressed_emerald_ore", () -> Ores.createOverworldOregen(false, false, BlockRegistration.COMPRESSED_EMERALD_ORE, OVERWORLD_DIAMOND_VEINSIZE, OVERWORLD_DIAMOND_AMOUNT, 255).value());
    public static final RegistryObject<PlacedFeature> COMPRESSED_LAPIS_ORE_GEN = PLACED_FEATURES.register("compressed_lapis_ore", () -> Ores.createOverworldOregen(false, true, BlockRegistration.COMPRESSED_LAPIS_ORE, OVERWORLD_VEINSIZE, OVERWORLD_AMOUNT, 30).value());
    public static final RegistryObject<PlacedFeature> COMPRESSED_REDSTONE_ORE_GEN = PLACED_FEATURES.register("compressed_redstone_ore", () -> Ores.createOverworldOregen(false, true, BlockRegistration.COMPRESSED_REDSTONE_ORE, OVERWORLD_VEINSIZE, OVERWORLD_AMOUNT, 15).value());

    public static final RegistryObject<PlacedFeature> COMPRESSED_DEEPSLATE_IRON_ORE_GEN = PLACED_FEATURES.register("compressed_deepslate_iron_ore", () -> Ores.createOverworldOregen(true, true, BlockRegistration.COMPRESSED_DEEPSLATE_IRON_ORE, DEEPSLATE_VEINSIZE, DEEPSLATE_AMOUNT, -64).value());
    public static final RegistryObject<PlacedFeature> COMPRESSED_DEEPSLATE_GOLD_ORE_GEN = PLACED_FEATURES.register("compressed_deepslate_gold_ore", () -> Ores.createOverworldOregen(true, true, BlockRegistration.COMPRESSED_DEEPSLATE_GOLD_ORE, DEEPSLATE_VEINSIZE, DEEPSLATE_AMOUNT, -64).value());
    public static final RegistryObject<PlacedFeature> COMPRESSED_DEEPSLATE_COPPER_ORE_GEN = PLACED_FEATURES.register("compressed_deepslate_copper_ore", () -> Ores.createOverworldOregen(true, true, BlockRegistration.COMPRESSED_DEEPSLATE_COPPER_ORE, DEEPSLATE_VEINSIZE, DEEPSLATE_AMOUNT, -16).value());
    public static final RegistryObject<PlacedFeature> COMPRESSED_DEEPSLATE_DIAMOND_ORE_GEN = PLACED_FEATURES.register("compressed_deepslate_diamond_ore", () -> Ores.createOverworldOregen(true, true, BlockRegistration.COMPRESSED_DEEPSLATE_DIAMOND_ORE, DEEPSLATE_DIAMOND_VEINSIZE, DEEPSLATE_DIAMOND_AMOUNT, -64).value());
    public static final RegistryObject<PlacedFeature> COMPRESSED_DEEPSLATE_COAL_ORE_GEN = PLACED_FEATURES.register("compressed_deepslate_coal_ore", () -> Ores.createOverworldOregen(true, false, BlockRegistration.COMPRESSED_DEEPSLATE_COAL_ORE, DEEPSLATE_COAL_VEINSIZE, DEEPSLATE_COAL_AMOUNT, -16).value());
    public static final RegistryObject<PlacedFeature> COMPRESSED_DEEPSLATE_EMERALD_ORE_GEN = PLACED_FEATURES.register("compressed_deepslate_emerald_ore", () -> Ores.createOverworldOregen(true, false, BlockRegistration.COMPRESSED_DEEPSLATE_EMERALD_ORE, DEEPSLATE_DIAMOND_VEINSIZE, DEEPSLATE_DIAMOND_AMOUNT, -64).value());
    public static final RegistryObject<PlacedFeature> COMPRESSED_DEEPSLATE_LAPIS_ORE_GEN = PLACED_FEATURES.register("compressed_deepslate_lapis_ore", () -> Ores.createOverworldOregen(true, true, BlockRegistration.COMPRESSED_DEEPSLATE_LAPIS_ORE, DEEPSLATE_VEINSIZE, DEEPSLATE_AMOUNT, -64).value());
    public static final RegistryObject<PlacedFeature> COMPRESSED_DEEPSLATE_REDSTONE_ORE_GEN = PLACED_FEATURES.register("compressed_deepslate_redstone_ore", () -> Ores.createOverworldOregen(true, true, BlockRegistration.COMPRESSED_DEEPSLATE_REDSTONE_ORE, DEEPSLATE_VEINSIZE, DEEPSLATE_AMOUNT, -64).value());

    //Nether Ores
    public static final RegistryObject<PlacedFeature> COMPRESSED_NETHER_QUARTZ_ORE_GEN = PLACED_FEATURES.register("compressed_nether_quartz_ore", () -> Ores.createNetherOregen(BlockRegistration.COMPRESSED_NETHER_QUARTZ_ORE, NETHER_QUARTZ_ORE_VEINSIZE, NETHER_QUARTZ_ORE_AMOUNT, 10, 117).value());
    public static final RegistryObject<PlacedFeature> COMPRESSED_NETHER_GOLD_ORE_GEN = PLACED_FEATURES.register("compressed_nether_gold_ore", () -> Ores.createNetherOregen(BlockRegistration.COMPRESSED_NETHER_GOLD_ORE, NETHER_GOLD_ORE_VEINSIZE, NETHER_GOLD_ORE_AMOUNT, 10, 117).value());
    public static final RegistryObject<PlacedFeature> COMPRESSED_ANCIENT_DEBRIS_GEN = PLACED_FEATURES.register("compressed_ancient_debris", () -> Ores.createNetherOregen(BlockRegistration.COMPRESSED_ANCIENT_DEBRIS, ANCIENT_DEBRIS_VEINSIZE, ANCIENT_DEBRIS_AMOUNT, 8, 22).value());
}

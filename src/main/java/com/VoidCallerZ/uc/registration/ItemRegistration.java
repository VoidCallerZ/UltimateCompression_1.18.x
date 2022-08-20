package com.VoidCallerZ.uc.registration;

import com.VoidCallerZ.uc.items.UcFuelItem;
import com.VoidCallerZ.uc.items.UcSnowball;
import com.VoidCallerZ.uc.items.UcSnowballItem;
import com.VoidCallerZ.uc.items.arrows.UcArrowItem;
import com.VoidCallerZ.uc.items.arrows.UcSpectralArrowItem;
import com.VoidCallerZ.uc.setup.ModSetup;
import com.VoidCallerZ.uc.entities.projectiles.CompressedArrow;
import com.VoidCallerZ.uc.entities.projectiles.CompressedSpectralArrow;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.SolidBucketItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.*;

import static com.VoidCallerZ.uc.UltimateCompression.MODID;

public class ItemRegistration
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID);

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
        ENTITIES.register(bus);
    }

    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ULTIMATE_COMPRESSION_TAB);

    public static final RegistryObject<Item> COMPRESSED_FLINT = ITEMS.register("compressed_flint", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_LEATHER = ITEMS.register("compressed_leather", () -> new Item(ITEM_PROPERTIES));

    //Ingots & Gems
    public static final RegistryObject<Item> COMPRESSED_RAW_IRON = ITEMS.register("compressed_raw_iron", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_IRON_INGOT = ITEMS.register("compressed_iron_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_RAW_GOLD = ITEMS.register("compressed_raw_gold", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_GOLD_INGOT = ITEMS.register("compressed_gold_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_DIAMOND_GEM = ITEMS.register("compressed_diamond_gem", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_RAW_COPPER = ITEMS.register("compressed_raw_copper", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_COPPER_INGOT = ITEMS.register("compressed_copper_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_COAL = ITEMS.register("compressed_coal", () -> new UcFuelItem(ITEM_PROPERTIES, 14400));
    public static final RegistryObject<Item> COMPRESSED_EMERALD_GEM = ITEMS.register("compressed_emerald_gem", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_LAPIS = ITEMS.register("compressed_lapis", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_NETHERITE_INGOT = ITEMS.register("compressed_netherite_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_REDSTONE = ITEMS.register("compressed_redstone", () -> new Item(ITEM_PROPERTIES));

    //Nuggets
    public static final RegistryObject<Item> COMPRESSED_GOLD_NUGGET = ITEMS.register("compressed_gold_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COMPRESSED_IRON_NUGGET = ITEMS.register("compressed_iron_nugget", () -> new Item(ITEM_PROPERTIES));

    //Arrows
    //Basic
    public static final RegistryObject<Item> COMPRESSED_ARROW = ITEMS.register("compressed_arrow", () -> new UcArrowItem(ITEM_PROPERTIES, 1.5f));
    public static final RegistryObject<EntityType<CompressedArrow>> COMPRESSED_ARROW_ENTITY = ENTITIES.register("compressed_arrow_entity", () ->
            EntityType.Builder.<CompressedArrow>of(CompressedArrow::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(new ResourceLocation(MODID, "compressed_arrow_entity").toString()));

    //Spectral
    public static final RegistryObject<Item> COMPRESSED_SPECTRAL_ARROW = ITEMS.register("compressed_spectral_arrow", () -> new UcSpectralArrowItem(ITEM_PROPERTIES, 1.5f));
    public static final RegistryObject<EntityType<CompressedSpectralArrow>> COMPRESSED_SPECTRAL_ARROW_ENTITY = ENTITIES.register("compressed_spectral_arrow_entity", () ->
            EntityType.Builder.<CompressedSpectralArrow>of(CompressedSpectralArrow::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(new ResourceLocation(MODID, "compressed_spectral_arrow_entity").toString()));

    //Snowball
    public static final RegistryObject<Item> COMPRESSED_SNOWBALL = ITEMS.register("compressed_snowball", () -> new UcSnowballItem(ITEM_PROPERTIES));
    public static final RegistryObject<EntityType<UcSnowball>> COMPRESSED_SNOWBALL_ENTITY = ENTITIES.register("compressed_snowball_entity", () ->
            EntityType.Builder.<UcSnowball>of(UcSnowball::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(new ResourceLocation(MODID, "compressed_snowball_entity").toString()));

    //Bucket of Compressed Powder Snow
    public static final RegistryObject<Item> COMPRESSED_POWDER_SNOW_BUCKET = ITEMS.register("compressed_powder_snow_bucket", () -> new SolidBucketItem(BlockRegistration.COMPRESSED_POWDER_SNOW.get(), SoundEvents.BUCKET_EMPTY_POWDER_SNOW, ITEM_PROPERTIES));

    //Nether Items
    public static final RegistryObject<Item> COMPRESSED_QUARTZ = ITEMS.register("compressed_quartz", () -> new Item(ITEM_PROPERTIES));

    public static final RegistryObject<Item> COMPRESSED_STICK = ITEMS.register("compressed_stick", () -> new Item(ITEM_PROPERTIES));
}
package net.MintPlz.ExampleMod.item;

import net.MintPlz.ExampleMod.ExampleMod;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static final Tier BLACKOPAL = new ForgeTier(4, 5000, 200f, 4f, 22,
            null,
            () -> {return Ingredient.of(Items.NETHERITE_INGOT);
    });

    public static final RegistryObject<Item> BLACK_OPAL = ITEMS.register("black_opal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_BLACK_OPAL = ITEMS.register("raw_black_opal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLACK_OPAL_SWORD = ITEMS.register("black_opal_sword",
            () -> new SwordItem(BLACKOPAL, 100, -2.4F, new Item.Properties()));

    public static final RegistryObject<Item> BLACK_OPAL_PICKAXE = ITEMS.register("black_opal_pickaxe",
            () -> new PickaxeItem(BLACKOPAL, 1, -2.8f, (new Item.Properties())));

    public static final RegistryObject<Item> BLACK_OPAL_SHOVEL = ITEMS.register("black_opal_shovel",
            () -> new ShovelItem(BLACKOPAL, 1.5F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> BLACK_OPAL_AXE = ITEMS.register("black_opal_axe",
            () -> new AxeItem(BLACKOPAL, 5.0F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> BLACK_OPAL_HOE = ITEMS.register("black_opal_hoe",
            () -> new HoeItem(BLACKOPAL, -4, 0, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

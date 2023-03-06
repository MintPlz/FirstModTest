package net.MintPlz.ExampleMod.item;

import net.MintPlz.ExampleMod.ExampleMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static final RegistryObject<Item> BLACK_OPAL = ITEMS.register("black_opal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_BLACK_OPAL = ITEMS.register("raw_black_opal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLACK_OPAL_PICKAXE = ITEMS.register("black_opal_pickaxe",
            () -> new PickaxeItem(Tiers.NETHERITE, 1,-2.8f, (new Item.Properties())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

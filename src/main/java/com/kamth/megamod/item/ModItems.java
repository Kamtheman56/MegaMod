package com.kamth.megamod.item;

import com.kamth.megamod.MegaMod;
import com.kamth.megamod.item.custom.ModArmorMaterials;
import com.kamth.megamod.item.items.BusterItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MegaMod.MOD_ID);

    public static final RegistryObject<Item> MEGA_BUSTER = ITEMS.register("mega_buster",
            () -> new BusterItem(new Item.Properties()));


    public static final RegistryObject<Item> CLASSIC_HELMET = ITEMS.register("classic_helmet",
            () -> new ArmorItem(ModArmorMaterials.CLASSIC, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CLASSIC_CHESTPLATE = ITEMS.register("classic_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CLASSIC, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CLASSIC_LEGGINGS = ITEMS.register("classic_leggings",
            () -> new ArmorItem(ModArmorMaterials.CLASSIC, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CLASSIC_BOOTS = ITEMS.register("classic_boots",
            () -> new ArmorItem(ModArmorMaterials.CLASSIC, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

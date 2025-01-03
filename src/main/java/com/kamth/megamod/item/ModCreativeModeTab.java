package com.kamth.megamod.item;

import com.kamth.megamod.MegaMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            MegaMod.MOD_ID);
    public static void register (IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
    public static RegistryObject<CreativeModeTab> MEGA_ITEMS = CREATIVE_MODE_TABS.register("mega_items", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CLASSIC_HELMET.get())).title(Component.translatable("mega_items")).build());
}

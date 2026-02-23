package com.example.mace;
import com.example.mace.items.ModItems;
import com.example.mace.enchantments.ModEnchantments;
import net.minecraft.item.Item;
import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.MACE, ModItems.BREEZE_ROD, ModItems.HEAVY_CORE);
    }
    @SubscribeEvent
    public static void registerEnchantments(RegistryEvent.Register<Enchantment> event) {
        event.getRegistry().registerAll(ModEnchantments.DENSITY, ModEnchantments.BREACH, ModEnchantments.WIND_BURST);
    }
  }

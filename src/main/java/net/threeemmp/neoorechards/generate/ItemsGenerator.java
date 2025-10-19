package net.threeemmp.neoorechards.generate;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.threeemmp.neoorechards.NeoOrechards;
import net.threeemmp.neoorechards.items.ModItems;

public class ItemsGenerator {
    public static void generateItems(String name) {
        DeferredHolder.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(NeoOrechards.MODID, name + "_acorn"));
        DeferredHolder.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(NeoOrechards.MODID, name + "_roasted_acorn"));
        DeferredHolder.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(NeoOrechards.MODID, name + "_resin"));
        ModItems.ITEMS.register(name + "_acorn", () -> new Item(new Item.Properties()));
        ModItems.ITEMS.register(name + "_roasted_acorn", () -> new Item(new Item.Properties()));
        ModItems.ITEMS.register(name + "_resin", () -> new Item(new Item.Properties()));
    }
}

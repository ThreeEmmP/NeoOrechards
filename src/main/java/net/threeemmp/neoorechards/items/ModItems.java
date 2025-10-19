package net.threeemmp.neoorechards.items;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.threeemmp.neoorechards.NeoOrechards;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NeoOrechards.MODID);

    public static final DeferredItem<Item> TEMPLATE_ACORN = ITEMS.register(
            "template_acorn",
            () -> new Item(new Item.Properties())
    );

    public static final DeferredItem<Item> TEMPLATE_ROASTED_ACORN = ITEMS.register(
            "template_roasted_acorn",
            () -> new Item(new Item.Properties())
    );

    public static final DeferredItem<Item> TEMPLATE_RESIN = ITEMS.register(
            "template_resin",
            () -> new Item(new Item.Properties())
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
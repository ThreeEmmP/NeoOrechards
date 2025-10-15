package net.threeemmp.neoorechards.items;

import net.threeemmp.neoorechards.NeoOrechards;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NeoOrechards.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
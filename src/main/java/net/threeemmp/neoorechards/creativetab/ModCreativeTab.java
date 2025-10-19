package net.threeemmp.neoorechards.creativetab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.threeemmp.neoorechards.NeoOrechards;
import net.threeemmp.neoorechards.blocks.ModBlocks;
import net.threeemmp.neoorechards.items.ModItems;

import java.util.function.Supplier;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NeoOrechards.MODID);

    public static final Supplier<CreativeModeTab> NEOORECHARDS_TEMPLATES = CREATIVE_MODE_TAB.register("neoorechards_templates",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TEMPLATE_SAPLING.get()))
                    .title(Component.translatable("creativetab.neoorechards.neoorechards_templates"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.TEMPLATE_AMBER);
                        output.accept(ModBlocks.TEMPLATE_SAPLING);
                        output.accept(ModBlocks.TEMPLATE_ORE_LOG);
                        output.accept(ModBlocks.TEMPLATE_ORE_LEAVES);
                        output.accept(ModItems.TEMPLATE_ACORN);
                        output.accept(ModItems.TEMPLATE_ROASTED_ACORN);
                        output.accept(ModItems.TEMPLATE_RESIN);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}

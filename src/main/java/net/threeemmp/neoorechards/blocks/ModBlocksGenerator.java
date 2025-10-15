package net.threeemmp.neoorechards.blocks;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.threeemmp.neoorechards.NeoOrechards;

public class ModBlocksGenerator {
    public static void GenerateBlocks(String name) {
        DeferredHolder.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(NeoOrechards.MODID,name + "_sapling"));
        ModBlocks.registerBlock(name + "_sapling", () -> new SaplingBlock(TreeGrower.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    }
}

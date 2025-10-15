package net.threeemmp.neoorechards.generate;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.threeemmp.neoorechards.NeoOrechards;
import net.threeemmp.neoorechards.blocks.ModBlocks;

public class BlocksGenerator {
    public static void GenerateBlocks(String name) {
        //There's probably a reason we don't do this normally instead of the regular way of creating a block
        //But this is the only way I could get this "Mass Registering" to work
        DeferredHolder.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(NeoOrechards.MODID,name + "_sapling"));
        ModBlocks.registerBlock(name + "_sapling", () -> new SaplingBlock(TreeGrower.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    }
}

package net.threeemmp.neoorechards.generate;

import net.threeemmp.neoorechards.defaults.DefaultConfig;
import net.threeemmp.neoorechards.util.FileWriting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateResourcePack {
    public static void generateResourcePack(String ore_type) {
        generateModels(ore_type);
        generateBlockstates(ore_type);
    }

    public static void initResourcePack() {
        File file = new File(DefaultConfig.RESOURCE_MCMETA_PATH);
        file.getParentFile().mkdirs();
        try(FileWriter writer = new FileWriter(file)){
            writer.write(DefaultConfig.RESOURCE_MCMETA);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    private static void generateModels(String ore_type) {
        FileWriting.CreateAndWriteFile(DefaultConfig.MODEL_BLOCK_PATH + ore_type + "_sapling.json", DefaultConfig.MODEL_BLOCK_SAPLING);
        FileWriting.CreateAndWriteFile(DefaultConfig.MODEL_BLOCK_PATH + ore_type + "_amber.json", DefaultConfig.MODEL_BLOCK_AMBER);
        FileWriting.CreateAndWriteFile(DefaultConfig.MODEL_BLOCK_PATH + ore_type + "_ore_log.json", DefaultConfig.MODEL_BLOCK_ORE_LOG);
        FileWriting.CreateAndWriteFile(DefaultConfig.MODEL_BLOCK_PATH + ore_type + "_ore_leaves.json", DefaultConfig.MODEL_BLOCK_ORE_LEAVES);
        FileWriting.CreateAndWriteFile(DefaultConfig.MODEL_BLOCK_PATH + ore_type + "_ore_log_horizontal.json", DefaultConfig.MODEL_BLOCK_ORE_LOG_H);

        FileWriting.CreateAndWriteFile(DefaultConfig.MODEL_ITEM_PATH + ore_type + "_ore_log.json", DefaultConfig.MODEL_ITEM_ORE_LOG);
        FileWriting.CreateAndWriteFile(DefaultConfig.MODEL_ITEM_PATH + ore_type + "_sapling.json", DefaultConfig.MODEL_ITEM_SAPLING);
        FileWriting.CreateAndWriteFile(DefaultConfig.MODEL_ITEM_PATH + ore_type + "_ore_leaves.json", DefaultConfig.MODEL_ITEM_ORE_LEAVES);
        FileWriting.CreateAndWriteFile(DefaultConfig.MODEL_ITEM_PATH + ore_type + "_amber.json", DefaultConfig.MODEL_ITEM_AMBER);
        FileWriting.CreateAndWriteFile(DefaultConfig.MODEL_ITEM_PATH + ore_type + "_resin.json", DefaultConfig.MODEL_ITEM_RESIN);
        FileWriting.CreateAndWriteFile(DefaultConfig.MODEL_ITEM_PATH + ore_type + "_acorn.json", DefaultConfig.MODEL_ITEM_ACORN);
        FileWriting.CreateAndWriteFile(DefaultConfig.MODEL_ITEM_PATH + ore_type + "_roasted_acorn.json", DefaultConfig.MODEL_ITEM_ROASTED_ACORN);
    }

    private static void generateBlockstates(String ore_type) {
        FileWriting.CreateAndWriteFile(DefaultConfig.BLOCKSTATE_PATH + ore_type + "_sapling.json", DefaultConfig.BLOCKSTATE_SAPLING);
        FileWriting.CreateAndWriteFile(DefaultConfig.BLOCKSTATE_PATH + ore_type + "_ore_log.json", DefaultConfig.BLOCKSTATE_ORE_LOG);
        FileWriting.CreateAndWriteFile(DefaultConfig.BLOCKSTATE_PATH + ore_type + "_ore_leaves.json", DefaultConfig.BLOCKSTATE_ORE_LEAVES);
        FileWriting.CreateAndWriteFile(DefaultConfig.BLOCKSTATE_PATH + ore_type + "_amber.json", DefaultConfig.BLOCKSTATE_AMBER);
    }
}

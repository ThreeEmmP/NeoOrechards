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
            writer.write(DefaultConfig.RESOURCE_MCMETA_TEMPLATE);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    private static void generateModels(String ore_type) {
        FileWriting.CreateAndWriteFile(
                DefaultConfig.MODEL_BLOCK_PATH + ore_type + "_sapling.json",
                DefaultConfig.MODEL_BLOCK_SAPLING_TEMPLATE);
        FileWriting.CreateAndWriteFile(
                DefaultConfig.MODEL_ITEM_PATH + ore_type + "_sapling.json",
                DefaultConfig.MODEL_ITEM_SAPLING_TEMPLATE);
    }

    private static void generateBlockstates(String ore_type) {
        FileWriting.CreateAndWriteFile(
                DefaultConfig.BLOCKSTATE_PATH + ore_type + "_sapling.json",
                DefaultConfig.BLOCKSTATE_SAPLING_TEMPLATE);
    }
}

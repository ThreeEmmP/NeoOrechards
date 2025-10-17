package net.threeemmp.neoorechards.generate;

import net.threeemmp.neoorechards.defaults.DefaultConfig;

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
            writer.write(DefaultConfig.RESOURCE_MCMETA_TEXT);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    private static void generateModels(String ore_type) {
        File blockFile = new File("resourcepacks/neoorechards/assets/neoorechards/models/block/" + ore_type + "_sapling.json");
        blockFile.getParentFile().mkdirs();
        try(FileWriter writer = new FileWriter(blockFile)) {
            writer.write("{\n" +
                    "  \"parent\": \"minecraft:block/cross\",\n" +
                    "  \"render_type\": \"minecraft:cutout\",\n" +
                    "  \"textures\": {\n" +
                    "    \"cross\": \"neoorechards:block/template_sapling\"\n" +
                    "  }\n" +
                    "}");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        File itemFile = new File("resourcepacks/neoorechards/assets/neoorechards/models/item/" + ore_type + "_sapling.json");
        itemFile.getParentFile().mkdirs();
        try(FileWriter writer = new FileWriter(itemFile)) {
            writer.write("{\n" +
                    "  \"parent\": \"minecraft:item/generated\",\n" +
                    "  \"textures\": {\n" +
                    "    \"layer0\": \"neoorechards:block/template_sapling\"\n" +
                    "  }\n" +
                    "}");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void generateBlockstates(String ore_type) {
        File file = new File("resourcepacks/neoorechards/assets/neoorechards/blockstates/" + ore_type + "_sapling.json");
        file.getParentFile().mkdirs();
        try(FileWriter writer = new FileWriter(file)) {
            writer.write("{\n" +
                    "  \"variants\": {\n" +
                    "    \"\": {\n" +
                    "      \"model\": \"neoorechards:block/template_sapling\"\n" +
                    "    }\n" +
                    "  }\n" +
                    "}");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

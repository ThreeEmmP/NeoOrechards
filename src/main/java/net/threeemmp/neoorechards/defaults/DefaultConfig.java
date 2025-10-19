package net.threeemmp.neoorechards.defaults;

public class DefaultConfig {

    public static final String DEFAULT_ORES = "ore_types = [\"coal\", \"iron\", \"lapis\", \"gold\", \"copper\", \"diamond\", \"emerald\", \"netherite\"] ";
    public static final String[] DEFAULT_FIELDS = {"ore_types"};

    // Template text for files

    public static final String RESOURCE_MCMETA_TEMPLATE =
            """
            {
              "pack": {
                "description": "Generated NeoOrechards pack",
                "pack_format": 34
              }
            }
            """;
    public static final String MODEL_BLOCK_SAPLING_TEMPLATE =
            """
            {
              "parent": "minecraft:block/cross",
              "render_type": "minecraft:cutout",
              "textures": {
                "cross": "neoorechards:block/template_sapling"
              }
            }""";
    public static final String MODEL_ITEM_SAPLING_TEMPLATE =
            """
            {
              "parent": "minecraft:item/generated",
              "textures": {
                "layer0": "neoorechards:block/template_sapling"
              }
            }
            """;
    public static final String BLOCKSTATE_SAPLING_TEMPLATE =
            """
            {
              "variants": {
                "": {
                  "model": "neoorechards:block/template_sapling"
                }
              }
            }
            """;

    //Template File Paths
    public static final String DEFAULT_CONFIG_PATH = "config/neoorechards.toml";
    public static final String RESOURCE_MCMETA_PATH = "resourcepacks/neoorechards/pack.mcmeta";
    public static final String MODEL_ITEM_PATH = "resourcepacks/neoorechards/assets/neoorechards/models/item/";
    public static final String MODEL_BLOCK_PATH =  "resourcepacks/neoorechards/assets/neoorechards/models/block/";
    public static final String BLOCKSTATE_PATH = "resourcepacks/neoorechards/assets/neoorechards/blockstates/";

}

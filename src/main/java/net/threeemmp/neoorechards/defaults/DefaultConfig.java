package net.threeemmp.neoorechards.defaults;

public class DefaultConfig {

    public static final String DEFAULT_ORES = "ore_types = [\"coal\", \"iron\", \"lapis\", \"gold\", \"copper\", \"diamond\", \"emerald\", \"netherite\"] ";
    public static final String[] DEFAULT_FIELDS = {"ore_types"};

    // Template pack.mcmeta

    public static final String RESOURCE_MCMETA =
            """
            {
              "pack": {
                "description": "Generated NeoOrechards pack",
                "pack_format": 34
              }
            }
            """;
    // Template block models
    public static final String MODEL_BLOCK_SAPLING =
            """
            {
              "parent": "minecraft:block/cross",
              "render_type": "minecraft:cutout",
              "textures": {
                "cross": "neoorechards:block/template_sapling"
              }
            }
            """;
    public static final String MODEL_BLOCK_ORE_LOG =
            """
            {
              "parent": "neoorechards:block/cube_column_overlay",
              "render_type": "minecraft:cutout",
              "textures": {
                "end": "minecraft:block/oak_log_top",
                "side": "minecraft:block/oak_log",
                "overlay": "neoorechards:block/template_ore_overlay"
              }
            }
            """;
    public static final String MODEL_BLOCK_ORE_LOG_H =
            """ 
            {
              "parent": "neoorechards:block/cube_column_horizontal_overlay",
              "render_type": "minecraft:cutout",
              "textures": {
                "end": "minecraft:block/oak_log_top",
                "side": "minecraft:block/oak_log",
                "overlay": "neoorechards:block/template_ore_overlay"
              }
            }
            """;
    public static final String MODEL_BLOCK_ORE_LEAVES =
            """
            {
              "parent": "minecraft:block/leaves",
              "render_type": "minecraft:cutout",
              "textures": {
                "all": "minecraft:block/oak_leaves"
              }
            }
            """;
    public static final String MODEL_BLOCK_AMBER =
            """
            {
              "parent": "minecraft:block/cube_all",
              "render_type": "minecraft:translucent",
              "textures": {
                "all": "neoorechards:block/template_amber"
              }
            }
            """;
    //Template item models
    public static final String MODEL_ITEM_SAPLING =
            """
            {
              "parent": "minecraft:item/generated",
              "textures": {
                "layer0": "neoorechards:block/template_sapling"
              }
            }
            """;
    public static final String MODEL_ITEM_ACORN =
            """
            {
              "parent": "minecraft:item/generated",
              "textures": {
                "layer0": "neoorechards:item/template_acorn"
              }
            }
            """;
    public static final String MODEL_ITEM_AMBER =
            """
            {
              "parent": "neoorechards:block/template_amber"
            }
            """;
    public static final String MODEL_ITEM_ORE_LEAVES =
            """
            {
              "parent": "neoorechards:block/template_ore_leaves"
            }
            """;
    public static final String MODEL_ITEM_ORE_LOG =
            """
            {
              "parent": "neoorechards:block/template_ore_log"
            }
            """;
    public static final String MODEL_ITEM_RESIN =
            """
            {
              "parent": "minecraft:item/generated",
              "textures": {
                "layer0": "neoorechards:item/template_resin"
              }
            }
            """;
    public static final String MODEL_ITEM_ROASTED_ACORN =
            """
            {
              "parent": "minecraft:item/generated",
              "textures": {
                "layer0": "neoorechards:item/template_roasted_acorn"
              }
            }
            """;
    //Template blockstates
    public static final String BLOCKSTATE_SAPLING =
            """
            {
              "variants": {
                "": {
                  "model": "neoorechards:block/template_sapling"
                }
              }
            }
            """;
    public static final String BLOCKSTATE_ORE_LOG =
            """
            {
              "variants": {
                "axis=x": {
                  "model": "neoorechards:block/template_ore_log_horizontal",
                  "x": 90,
                  "y": 90
                },
                "axis=y": {
                  "model": "neoorechards:block/template_ore_log"
                },
                "axis=z": {
                  "model": "neoorechards:block/template_ore_log_horizontal",
                  "x": 90
                }
              }
            }
            """;
    public static final String BLOCKSTATE_ORE_LEAVES =
            """
            {
              "variants": {
                "": {
                  "model": "neoorechards:block/template_ore_leaves"
                }
              }
            }
            """;
    public static final String BLOCKSTATE_AMBER =
            """
            {
              "variants": {
                "": {
                  "model": "neoorechards:block/template_amber"
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
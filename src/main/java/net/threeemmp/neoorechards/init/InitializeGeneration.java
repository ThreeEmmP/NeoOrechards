package net.threeemmp.neoorechards.init;

import net.threeemmp.neoorechards.NeoOrechards;
import net.threeemmp.neoorechards.generate.GenerateResourcePack;
import net.threeemmp.neoorechards.loaded.LoadedFields;
import net.threeemmp.neoorechards.defaults.DefaultConfig;
import net.threeemmp.neoorechards.generate.GenerateConfig;
import net.threeemmp.neoorechards.util.FileReading;

public class InitializeGeneration {
    public static void initConfig() {
        if (!FileReading.doesConfigFileExist()) {
            GenerateConfig.generateDefaultConfig();
        }
        verifyFields();
        loadCustomFields();
        GenerateResourcePack.initResourcePack();
        for (int i = 0; i < LoadedFields.customOres.length; i++) {
            GenerateResourcePack.generateResourcePack(LoadedFields.customOres[i]);
        }

    }

    private static void verifyFields() {
        for (int i = 0; i < DefaultConfig.DEFAULT_FIELDS.length; i++) {
            String currentField = DefaultConfig.DEFAULT_FIELDS[i];
            if (!FileReading.fieldValidityCheck(currentField)) {
                NeoOrechards.LOGGER.info("Validity check failed on: {}, reverting to default", currentField);
                GenerateConfig.generateDefaultConfig();
                return;
           }
        }
    }

    private static void loadCustomFields () {
        LoadedFields.customOres = FileReading.readFieldFromConfig("ore_types");
    }
}

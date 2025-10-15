package net.threeemmp.neoorechards.init;

import net.threeemmp.neoorechards.NeoOrechards;
import net.threeemmp.neoorechards.loaded.LoadedFields;
import net.threeemmp.neoorechards.defaults.DefaultConfig;
import net.threeemmp.neoorechards.generate.GenerateConfig;
import net.threeemmp.neoorechards.util.FileReading;

public class InitializeConfig {
    public static void init() {
        if (!FileReading.doesConfigFileExist()) {
            GenerateConfig.generateDefaultConfig();
        }
        verifyFields();
        loadCustomFields();
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

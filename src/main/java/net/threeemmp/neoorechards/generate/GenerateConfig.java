package net.threeemmp.neoorechards.generate;

import net.threeemmp.neoorechards.defaults.DefaultConfig;

import java.io.*;

public class GenerateConfig {

    public static void generateDefaultConfig() {
        try (FileWriter writer = new FileWriter(DefaultConfig.DEFAULT_CONFIG_PATH)){
            writer.write(DefaultConfig.DEFAULT_ORES);
        }
        catch (IOException e) {
            System.out.println("Something Failed");
        }
    }
}

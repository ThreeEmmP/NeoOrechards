package net.threeemmp.neoorechards.util;

import net.threeemmp.neoorechards.NeoOrechards;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

    public static void CreateAndWriteFile(String path, String content) {
        File file = new File(path);
        file.getParentFile().mkdirs();
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(content);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

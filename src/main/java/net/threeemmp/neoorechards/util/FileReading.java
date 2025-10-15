package net.threeemmp.neoorechards.util;

import net.threeemmp.neoorechards.defaults.DefaultConfig;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
    //All this shit to read and write to some stupid file
    public static boolean fieldValidityCheck (String fieldName) {
        try {
            Scanner scanner = new Scanner(new File(DefaultConfig.DEFAULT_CONFIG_PATH));
            while (scanner.hasNextLine()) {
                String currentLine = scanner.nextLine();
                if (currentLine.contains(fieldName)) {
                    return true;
                }
            }
            return false;
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException("Failed to find config file, even though it should exist");
        }
    }

    public static String[] readFieldFromConfig(String fieldName) {
        try {
            Scanner scanner = new Scanner(new File(DefaultConfig.DEFAULT_CONFIG_PATH));
            while(scanner.hasNextLine()){
                String currentLine = scanner.nextLine();
                if (currentLine.contains(fieldName)) {
                    return StringManipulation.getStringArrayFromField(currentLine);
                }
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException("File still does not exist");
        }
        throw new RuntimeException("Couldn't find field even after config validity check");
    }

    public static boolean doesConfigFileExist() {
        File file = new File(DefaultConfig.DEFAULT_CONFIG_PATH);
        return file.isFile();
    }
}
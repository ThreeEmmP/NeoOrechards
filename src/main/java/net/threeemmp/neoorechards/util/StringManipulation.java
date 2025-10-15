package net.threeemmp.neoorechards.util;

public class StringManipulation {
    //I would add more arguments, but I know that the TOML will be consistent, and I'm lazy
    public static String[] getStringArrayFromField(String str) {
        String substring = str.substring(str.indexOf("[") + 1, str.indexOf("]"));
        String filteredSubstring = substring.replaceAll(" ", "");
        filteredSubstring = filteredSubstring.replaceAll("\"", "");
        return filteredSubstring.split(",");
    }
}

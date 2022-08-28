package com.bridgelabz.day16_17;

import java.io.*;

public class DataStructuresUtility {

    private static String path;
    private static String str;

    public static String readFile(String path) throws IOException {
        String str = "";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        str = bufferedReader.readLine();
        bufferedReader.close();
        return str;
    }


    public static String writeFile(String path, String str) throws IOException {
        DataStructuresUtility.path = path;
        DataStructuresUtility.str = str;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        bufferedWriter.write(str);
        bufferedWriter.close();
        return "\n File is Written...";
    }
}

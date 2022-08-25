package com.bridgelabz.day16;

import java.io.*;

public class DataStructuresUtility {

    public static String readFile(String path) throws IOException {
        String str = "";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        str = bufferedReader.readLine();
        bufferedReader.close();
        return str;
    }


    public static String writeFile(String path, String str) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        bufferedWriter.write(str);
        bufferedWriter.close();
        return "\n File is Written...";
    }
}

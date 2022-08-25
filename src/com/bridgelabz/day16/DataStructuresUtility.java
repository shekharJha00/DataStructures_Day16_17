package com.bridgelabz.day16;

import java.io.*;

public class DataStructuresUtility {

    public String readFile(String path) throws IOException {
        String str = "";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        str = bufferedReader.readLine();
        bufferedReader.close();
        return str;
    }


    public String writeFile(String path, String str) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        bufferedWriter.write(str);
        bufferedWriter.close();
        return "\n File is Written...";
    }
}

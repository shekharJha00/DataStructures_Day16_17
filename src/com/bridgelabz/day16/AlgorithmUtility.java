package com.bridgelabz.day16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AlgorithmUtility {
    public static int stringBinarySearch(String[] arr, String key) {
    int start = 0, end = arr.length - 1, mid;
    while (start <= end) {
        mid = start + (end - start) / 2;

        if (arr[mid].equals(key))
            return mid;

        if (arr[mid].compareTo(key) > 0)
            start = mid + 1;

        else
            end = mid - 1;
    }
    return -1;
}
    public static String[] stringInsertionSort(String[] arr) {
        String key;
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void printStringArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static String getFromFile(String path) {
        BufferedReader bufferedReader = null;
        String str = "";
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            str = bufferedReader.readLine();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

}

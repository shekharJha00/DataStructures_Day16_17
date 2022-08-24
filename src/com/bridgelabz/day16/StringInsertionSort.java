package com.bridgelabz.day16;

import java.util.ArrayList;


class StringInsertionSort{
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

    public static void main(String[] args) {
        ArrayList<String>stringArrayList=new ArrayList<>() ;
        stringArrayList.add("sdasdasd");
        stringArrayList.add("sadasd");
        stringArrayList.add("dasdasda");
        stringArrayList.add("sadasd");
        System.out.println(stringArrayList);

        String[] strArr = stringArrayList.toArray(new String[0]);

        stringInsertionSort(strArr);
        System.out.println("sorted list :");
        printStringArr(strArr);
        }


    }


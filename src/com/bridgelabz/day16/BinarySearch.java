package com.bridgelabz.day16;


import java.util.Scanner;

class BinarySearch{




public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = AlgorithmUtility
        .getFromFile("/C:/Users/sunny/IdeaProjects/AssignMentDay16_17/Words.txt");
        String[] strArr = str.split(",");
        AlgorithmUtility.stringInsertionSort(strArr);
        AlgorithmUtility.printStringArr(strArr);
        System.out.println("Enter key to search");
        String key = scanner.next();
        int index = AlgorithmUtility.stringBinarySearch(strArr, key);
        if (index >= 0)
        System.out.println("Key found at index : " + index + " which is : " + strArr[index]);
        else if(index==-1) {
        System.out.println("Key not found");
        }

        scanner.close();
        }

        }
package com.bridgelabz.day16_17;


public class BubbleSort {

    public static void main(String[] args) {
        int[] intArr = {1, 5, 2, 6, 7, 9, 3};
        System.out.println("Before sorting");
        AlgorithmUtility.printIntArr(intArr);
        AlgorithmUtility.intBubbleSort(intArr);
        System.out.println("After sorting");
        AlgorithmUtility.printIntArr(intArr);
    }

    }


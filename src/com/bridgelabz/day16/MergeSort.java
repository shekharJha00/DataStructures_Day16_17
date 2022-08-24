package com.bridgelabz.day16;

import java.util.ArrayList;

public class MergeSort {

    private final ArrayList<String> arrayToSort;

    public MergeSort(ArrayList<String> arrayToSort) {
        this.arrayToSort = arrayToSort;
    }

    public ArrayList<String> getArrayAfterSorting() {
        return arrayToSort;
    }

    public void divideArrayElements(int indexStart, int indexEnd) {

        if (indexStart < indexEnd && (indexEnd - indexStart) >= 1) {
            int middleElement = (indexEnd + indexStart) / 2;

            divideArrayElements(indexStart, middleElement);
            divideArrayElements(middleElement + 1, indexEnd);

            mergeArrayElements(indexStart, middleElement, indexEnd);
        }
    }

    public void mergeArrayElements(int indexStart, int indexMiddle, int indexEnd) {

        ArrayList<String> tempArray = new ArrayList<>();

        int getLeftIndex = indexStart;
        int getRightIndex = indexMiddle + 1;

        while (getLeftIndex <= indexMiddle && getRightIndex <= indexEnd) {

            if((Integer.parseInt(arrayToSort.get(getLeftIndex)) <= Integer.parseInt(arrayToSort.get(getRightIndex)))) {

                tempArray.add(arrayToSort.get(getLeftIndex));
                getLeftIndex++;

            } else {

                tempArray.add(arrayToSort.get(getRightIndex));
                getRightIndex++;

            }
        }

        while (getLeftIndex <= indexMiddle) {
            tempArray.add(arrayToSort.get(getLeftIndex));
            getLeftIndex++;
        }

        while (getRightIndex <= indexEnd) {
            tempArray.add(arrayToSort.get(getRightIndex));
            getRightIndex++;
        }


        for (int i = 0; i < tempArray.size(); indexStart++) {
            arrayToSort.set(indexStart, tempArray.get(i++));

        }

    }

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("3423");
        stringArrayList.add("34233");
        stringArrayList.add("3423234");
        stringArrayList.add("44");
        stringArrayList.add("4324");

        MergeSort exampleClass1 = new MergeSort(stringArrayList);

        System.out.println("Array Before Merge Sort: ");
        for (String string : exampleClass1.getArrayAfterSorting()) {
            System.out.println(string);
        }

        System.out.println();

        exampleClass1.divideArrayElements(0, stringArrayList.size() - 1);

        System.out.println("Array After Merge Sort: ");
        for (String string : exampleClass1.getArrayAfterSorting()) {
            System.out.println(string);
        }


    }
}










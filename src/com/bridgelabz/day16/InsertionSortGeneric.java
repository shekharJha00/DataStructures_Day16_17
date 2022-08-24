package com.bridgelabz.day16;

public class InsertionSortGeneric<T extends Comparable<? super T>> {
    public static void main(String[] args)
    {

        String[] arrayOfStrings = new String[]{"dispensable", " romantic", "squirrel", "bolt", "fixed", "winter","many"};

        InsertionSortGeneric<String> stringSorter   = new InsertionSortGeneric<>();
        stringSorter.insertionSort(arrayOfStrings);
        System.out.println(java.util.Arrays.toString(arrayOfStrings));


        Double[]arrayOfDoubles = {0.35, 0.02, 0.36, 0.82, 0.27, 0.49, 0.41, 0.17, 0.30, 0.89, 0.37, };
        InsertionSortGeneric<Double> doubleSorter   = new InsertionSortGeneric<>();
        doubleSorter.insertionSort(arrayOfDoubles);
        System.out.println(java.util.Arrays.toString(arrayOfDoubles));
    }

    void insertionSort(T[] array)
    {

        for (int i = 1; i < array.length; i++)
        {
            int currentIndex = i;

            while (currentIndex > 0 && array[currentIndex - 1].compareTo(array[currentIndex]) > 0)
            {
                T temp = array[currentIndex];
                array[currentIndex] = array[currentIndex - 1];
                array[currentIndex - 1] = temp;
                currentIndex--;
            }
        }
    }
}
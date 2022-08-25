package com.bridgelabz.day16_17;

public class BubbleSortGeneric<T extends Comparable<? super T>> {
    public static void main(String[] args)
    {

        String[] arrayOfStrings = {"dispensable", " romantic", "squirrel", "bolt", "fixed", "winter","many"};
        BubbleSortGeneric<String> stringSorter   = new BubbleSortGeneric<>();
        stringSorter.bubbleSort(arrayOfStrings);
        System.out.println(java.util.Arrays.toString(arrayOfStrings));


        Double[] arrayOfDoubles = {0.35, 0.02, 0.36, 0.82, 0.27, 0.49, 0.41, 0.17, 0.30, 0.89, 0.37, 0.66,};
        BubbleSortGeneric<Double> doubleSorter   = new BubbleSortGeneric<>();
        doubleSorter.bubbleSort(arrayOfDoubles);
        System.out.println(java.util.Arrays.toString(arrayOfDoubles));
    }

    void bubbleSort(T[] array)
    {
        int n = array.length;
        while (n > 0)
        {
            int lastModifiedIndex = 0;
            for (int currentIndex = 1; currentIndex < n; currentIndex++)
            {

                if (array[currentIndex - 1].compareTo(array[currentIndex]) > 0)
                {

                    T temp = array[currentIndex - 1];
                    array[currentIndex - 1] = array[currentIndex];
                    array[currentIndex] = temp;

                    lastModifiedIndex = currentIndex;
                }
            }

            n = lastModifiedIndex;
        }
    }
}

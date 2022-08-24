package com.bridgelabz.day16;

public class GenericBSearch<T extends Comparable<T>> {
    private T[] a;

    public GenericBSearch(T[] words) {
        a = words;
    }

    public int search(Comparable<T> v) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            T midVal = a[mid];
            int result = v.compareTo(midVal);

            if (result < 0) {
                high = mid - 1;
            }

            else if (result > 0) {
                low = mid + 1;
            }

            else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String[] words = {"Alpha", "Bravo", "Charlie", "Delta", "Echo", "November", "october"};
        GenericBSearch<String> searcher=new GenericBSearch<>(words);
        System.out.println(searcher.search("November"));
        System.out.println("word is present");
        System.out.println(searcher.search("October"));
        System.out.println("word is present");
    }
}



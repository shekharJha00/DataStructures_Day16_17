package com.bridgelabz.day16_17;

public class PrimeAnagram2dUsingQueue {
    public static void main(String[] args) {


            int start = 0;
            int end = 1000;
            QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();
            for (int j = start; j <= end; j++) {
                if (DataStructuresUtility.isPrime(j)) {
                    for (int k = j + 1; k < end; k++) {
                        if (DataStructuresUtility.isPrime(k)) {
                            if (DataStructuresUtility.isAnagram(String.valueOf(j), String.valueOf(k))) {
                                queue.enQueue(j);
                                queue.enQueue(k);

                            }
                        }
                    }

                }

            }

            int tempSize = queue.size();
            for (int i = 0; i < tempSize; i++) {
                System.out.print(queue.get(i) + " ");
}
        }

    }

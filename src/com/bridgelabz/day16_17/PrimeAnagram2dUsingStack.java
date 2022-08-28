package com.bridgelabz.day16_17;

public class PrimeAnagram2dUsingStack {
    public static void main(String[] args) {
        int start = 0;
        int end = 1000;

        StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();
        for (int j = start; j <= end; j++) {
            if (DataStructuresUtility.isPrime(j)) {
                for (int k = j + 1; k < end; k++) {
                    if (DataStructuresUtility.isPrime(k)) {
                        if (DataStructuresUtility.isAnagram(String.valueOf(j), String.valueOf(k))) {
                            stack.push(j);
                            stack.push(k);

                        }
                    }
                }

            }

        }


        int tempSize = stack.size();
        for (int i = 0; i < tempSize; i++) {
            System.out.print(stack.peek() + " ");
            if (!stack.isEmpty()) {
                stack.pop();
            }
        }

    }

}



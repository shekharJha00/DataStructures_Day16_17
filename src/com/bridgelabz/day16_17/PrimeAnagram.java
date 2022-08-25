package com.bridgelabz.day16_17;

public class PrimeAnagram {
    public static void main(String[] args) {


        AlgorithmUtility utility = new AlgorithmUtility();
        for (int i = 0; i <= 1000; i++) {
            if (AlgorithmUtility.isPrime(i)) {
                for (int j = i; j < 1000; j++) {
                    if (i != j) {
                        if (AlgorithmUtility.isPrime(j)) {
                            if (utility.isAnagram(String.valueOf(i), String.valueOf(j)) && utility.isPalindrome(i)) {
                                System.out.println(i + " " + j + " is prime and anagram and palindrome");
                            }
                        }
                    }
                }

            }

        }

    }
}







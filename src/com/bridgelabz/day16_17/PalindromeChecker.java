package com.bridgelabz.day16_17;



public class PalindromeChecker {

    public static void main(String[] args) {
        String str = "madam";
        String revFront = "";
        String revRear = "";

        DequeUsingLinkedList<Character> deque = new DequeUsingLinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            deque.insertRear(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            revRear += deque.getRear();
            deque.removeRear();
        }
        for (int i = 0; i < str.length(); i++) {
            deque.insertRear(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            revFront += deque.getFront();
            deque.removeFront();
        }
        System.out.println("Rear delete : " + revRear);
        System.out.println("Front delete : " + revFront);
        if (revRear.equals(revFront)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }

    }


    }


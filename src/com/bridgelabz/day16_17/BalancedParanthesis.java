package com.bridgelabz.day16_17;

import java.util.Scanner;

public class BalancedParanthesis {
    public static void main(String[] args) {
        StackUsingLinkedList<Character> parenthesisStack = new StackUsingLinkedList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter equation to check: ");

        String equation = scanner.nextLine(); // equation

        scanner.close();


        char[] equationCharacterArray = equation.toCharArray();

        for (char character : equationCharacterArray) {
            if (character == '(') {
                parenthesisStack.push(character);
            } else if (character == ')') {
                if (parenthesisStack.isEmpty()) {
                    System.out.println("Equation is balanced.");
                    return;
                } else {
                    parenthesisStack.pop();
                }
            }
        }

        if (parenthesisStack.isEmpty()) {
            System.out.println("Equation is balanced.");
        } else {
            System.out.println("Equation is not balanced.");
        }
    }
}
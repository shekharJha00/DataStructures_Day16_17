package com.bridgelabz.day16_17;

import java.io.IOException;

import java.util.Scanner;

import static java.lang.Integer.*;


@SuppressWarnings("ConstantConditions")
public class OrderedList {
    @SuppressWarnings("ConstantConditions")
    public static void main(String[] args) {


        MyLinkedList<Integer> list = new MyLinkedList<>();
        String[] strArr = null;

        try {
            strArr = (DataStructuresUtility.readFile(
                            "/C:/Users/sunny/IdeaProjects/AssignMentDay16_17/Words.txt")
                    .split(","));

        } catch (IOException e) {
            e.printStackTrace();
        }
        int[] integerArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            integerArr[i] = parseInt((strArr[i]));
            list.add(integerArr[i]);
        }
        int size = integerArr.length;
        System.out.println(list.show());
        System.out.println("\nSorting");
        list.sort(size);
        System.out.println(list.show());

        System.out.println("\nEnter key to search in list:");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        size = list.searchNode(key, size);



        scanner.close();

        System.out.println("\nSorting");
        list.sort(size);

        System.out.println(list.show());
        String str = list.returnListInString();
        try {
            DataStructuresUtility.writeFile(
                    "/C:/Users/sunny/IdeaProjects/AssignMentDay16_17/Words.txt",
                    str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


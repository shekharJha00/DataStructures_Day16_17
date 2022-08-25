package com.bridgelabz.day16_17;

import java.io.*;

import java.util.Scanner;

public class UnOrderedList {
    public static void main(String[] args) {

        DataStructuresUtility utility = new DataStructuresUtility();
        MyLinkedList<String> list = new MyLinkedList<String>();
        String[] strArray = null;
        try {
            strArray = utility.readFile(
                            "/C:/Users/sunny/IdeaProjects/AssignMentDay16_17/Words.txt")
                    .split(",");
        } catch (IOException e) {
            e.printStackTrace();
        }
        int size = strArray.length;
        for (int i = 0; i < strArray.length; i++) {
            list.add(strArray[i]);
        }
        System.out.println(list.size());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter key to search");
        String key = scanner.next();
        size = list.searchNode(key, size);
        System.out.println(list.size());

        try {
            utility.writeFile(
                    "/C:/Users/sunny/IdeaProjects/AssignMentDay16_17/Words.txt",
                    list.returnListInString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }

}



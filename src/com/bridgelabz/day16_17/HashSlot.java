package com.bridgelabz.day16_17;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class HashSlot {
    static int[] arr;

    public static void main(String[] args) {


        HashMap<Integer,Integer>hashMap=new HashMap<>();
    String readMessage = "";
		try {
        readMessage = DataStructuresUtility.readFile(
                "/C:/Users/sunny/IdeaProjects/AssignMentDay16_17/Hashlist");
    } catch (IOException e) {
        e.printStackTrace();
    }
    String[] str = readMessage.split(",");
    arr = new int[str.length];

		for (int i = 0; i < arr.length; i++) {
        arr[i] = Integer.parseInt(str[i]);
    }
		System.out.println(Arrays.toString(arr));
		System.out.println("Getting keys");
        for (int j : arr) {
            hashMap.add(j, j);
        }
		hashMap.show();
		System.out.println("\nEnter key to search: ");
    Scanner scanner = new Scanner(System.in);
    int key = scanner.nextInt();
		if (hashMap.get(key) != null) {
        hashMap.remove(key);
    } else {
        hashMap.add(key, key);
    }
		scanner.close();//C:\Users\sunny\IdeaProjects\AssignMentDay16_17
		hashMap.show();
		try {
        DataStructuresUtility.writeFile(
                "/C:/Users/sunny/IdeaProjects/AssignMentDay16_17/Hashlistoutput",
                hashMap.returnListInString());
    } catch (IOException e) {
        e.printStackTrace();
    }

}

}


package com.bridgelabz.day16_17;

import java.util.ArrayList;
@SuppressWarnings("All")
public class HashMap<K, V> {
    public ArrayList<HashNode<K, V>> arrList;

    public int arrCapacity;

    public int size;

    public HashMap() {
        arrList = new ArrayList<>();
        arrCapacity = 10;
        size = 0;

        for (int i = 0; i < arrCapacity; i++) {
            arrList.add(null);
        }
    }


    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public int hashFunction(K key) {
        int hashCod = (int) key;
        return hashCod % 11;
    }


    public V get(K key) {

        int hashIndex = hashFunction(key);
        HashNode<K, V> head = arrList.get(hashIndex);

        while (head != null) {
            if (head.key.equals(key))
                return head.value;
            head = head.next;
        }


        return null;
    }


    public void add(K key, V value) {
        int hashIndex = hashFunction(key);
        // Get head of chain
        HashNode<K, V> head = arrList.get(hashIndex);
        // Check if key is already present
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = arrList.get(hashIndex);
        HashNode<K, V> newNode = new HashNode<>(key, value);
        newNode.next = head;
        arrList.set(hashIndex, newNode);

        if ((1.0 * size) / arrCapacity >= 0.7) {
            ArrayList<HashNode<K, V>> temp = arrList;
            arrList = new ArrayList<>();
            arrCapacity = 2 * arrCapacity;
            size = 0;
            for (int i = 0; i < arrCapacity; i++)
                arrList.add(null);

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }


    public V remove(K key) {
        int hashIndex = hashFunction(key);

        HashNode<K, V> head = arrList.get(hashIndex);

        HashNode<K, V> prev = null;
        while (head != null) {

            if (head.key.equals(key))
                break;

            prev = head;
            head = head.next;
        }

        if (head == null)
            return null;

        size--;

        if (prev != null)
            prev.next = head.next;
        else
            arrList.set(hashIndex, head.next);

        return head.value;
    }


    public void show() {

        for (int i = 0; i < arrList.size(); i++) {
            try {
                if (!(arrList.get(i) == null)) {
                    System.out.println("\narray index : " + i);
                    HashNode<K, V> head = arrList.get(i);
                    while (head != null) {
                        System.out.print(head.value + " ");
                        head = head.next;
                    }

                }
            } catch (Exception e) {
                System.err.println(e);
            }

        }



    }

    public String returnListInString() {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < arrList.size(); i++) {
            try {
                if (!(arrList.get(i) == null)) {
                    str.append("\narray index : ").append(i);
                    HashNode<K, V> head = arrList.get(i);
                    while (head != null) {
                        str.append(head.value).append(" ");
                        head = head.next;
                    }

                }
            } catch (Exception e) {
                System.err.println(e);
            }

        }
        return str.toString();
    }}

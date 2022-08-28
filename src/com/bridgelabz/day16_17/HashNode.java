package com.bridgelabz.day16_17;

public class HashNode<K, V> {
    K key;
    V value;
    HashNode<K, V> next;

    HashNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}


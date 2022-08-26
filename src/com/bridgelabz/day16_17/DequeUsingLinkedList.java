package com.bridgelabz.day16_17;

public class DequeUsingLinkedList<T> {
MyLinkedList<T> deque = new MyLinkedList<>();
    int size=0;


    public void insertFront(T data) {
        deque.addAtStart(data);
        size++;
    }


    public void insertRear(T data) {
        deque.add(data);
        size++;
    }


    public void removeFront() {
        deque.deleteAtStart();
        size--;
    }


    public void removeRear() {
        deque.deleteAtEnd();
        size--;
    }


    public T getFront() {
        return deque.get(--size);
    }


    public T getRear() {
        return deque.get(size-1);
    }

}

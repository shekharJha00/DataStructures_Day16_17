package com.bridgelabz.day16_17;

public class StackUsingLinkedList<T> {
    MyLinkedList<T> stack = new MyLinkedList<T>();
    public static int top = 0;


    public void push(T data) {

        stack.add(data);
        top++;

    }

    public void pop() {

        if (isEmpty()) {
            System.out.println("Stack is underflow");
        } else {
            stack.deleteAtEnd();
            top--;

        }

    }



    public T peek() {
        if (!isEmpty()) {
            T data;
            data = stack.get(top);
            return data;
        }
        return null;

    }


    public boolean isEmpty() {

        return stack.isEmpty();
    }



    public void show() {

        stack.show();
    }





    public int size() {
        return top;
    }
}

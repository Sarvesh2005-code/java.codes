package com.sarvesh.javabasics;

public class CustomStack {
    private int[] arr;
    private int top;
    private int capacity;

    public CustomStack(int size) {
        this.arr = new int[size];
        this.capacity = size;
        this.top = -1; 
    }

    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("System Crash: Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("System Crash: Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (top == -1) return -1;
        return arr[top];
    }

    public static void main(String[] args) {
        CustomStack engine = new CustomStack(5);
        engine.push(10);
        engine.push(20);
        
        System.out.println("Popped: " + engine.pop());
        System.out.println("Peek: " + engine.peek()); 
    }
}
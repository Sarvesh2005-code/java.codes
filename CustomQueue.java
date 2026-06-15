package com.sarvesh.javabasics;

public class CustomQueue {
    int[] arr;
    int front; 
    int rear; 

    public CustomQueue(int size) {
        arr = new int[size];
        front = 0;
        rear = 0;
    }

    public void enqueue(int x) {
        if (rear == arr.length) {
            System.out.println("The line is full! Cannot add " + x);
            return;
        }        
        arr[rear] = x;
        rear++; 
    }

    public int dequeue() {
        if (front == rear) {
            System.out.println("The line is empty!");
            return -1;
        }
        int servedPerson = arr[front];
        front++; 
        return servedPerson;
    }

    public int peek() {
        if (front == rear) return -1;
        return arr[front];
    }

    public static void main(String[] args) {
        CustomQueue engine = new CustomQueue(5);
        
        engine.enqueue(10); 
        engine.enqueue(20); 
        engine.enqueue(30); 
        
        System.out.println("Served: " + engine.dequeue()); 
        System.out.println("Next up: " + engine.peek());   
    }
}
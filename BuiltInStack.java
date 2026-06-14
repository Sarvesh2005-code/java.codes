package com.sarvesh.javabasics;

import java.util.Stack;

public class BuiltInStack {
    public static void main(String[] args) {
        Stack<Integer> history = new Stack<>();
        
        history.push(100);
        history.push(200);
        history.push(300);
        
        System.out.println("Currently on top: " + history.peek());
        
        System.out.println("Popped off: " + history.pop());
        
        System.out.println("New top: " + history.peek()); 
    }
}
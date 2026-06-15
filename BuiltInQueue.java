package com.sarvesh.javabasics;

import java.util.LinkedList;
import java.util.Queue;

public class BuiltInQueue {
    public static void main(String[] args) {
        Queue<Integer> driveThru = new LinkedList<>();
        
        driveThru.offer(100);
        driveThru.offer(200);
        driveThru.offer(300);
        
        System.out.println("Car at the window: " + driveThru.peek());        
        System.out.println("Served and left: " + driveThru.poll());        
        System.out.println("Next car at the window: " + driveThru.peek()); 
    }
}
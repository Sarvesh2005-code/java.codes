package com.sarvesh.javabasics;
import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean sorted = true;
        for (int i=0;i<n-1;i++) {
            if (arr[i]>arr[i+1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
        sc.close();
    }
}
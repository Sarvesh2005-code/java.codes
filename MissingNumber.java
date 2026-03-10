package com.sarvesh.javabasics;

import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];
        System.out.println("Enter elements:");
        for (int i=0;i<n-1;i++) {
            arr[i] = sc.nextInt();
        }

        int expected = n*(n + 1)/2;
        int real = 0;
        for (int i=0;i<arr.length;i++) {
            real += arr[i];
        }
        int missing = expected - real;
        System.out.println("Missing number is: " + missing);

        sc.close();
    }
}
package com.sarvesh.javabasics;

import java.util.Scanner;

public class MaximumPrefix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of digits: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Digits: ");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        prefix(arr);
        sc.close();
    }

    public static void prefix(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i=1;i<n;i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }

        System.out.println("Prefix Array:");
        for (int i=0;i<n;i++) {
            System.out.print(prefix[i] + " ");
        }
    }
}
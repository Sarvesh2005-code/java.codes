package com.sarvesh.javabasics;

import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n < 2) {
            System.out.println(-1);
            return;
        }

        int max = arr[0];
        int second = -1;

        for (int i = 1; i < n; i++) {

            if (arr[i] > max) {
                second = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > second) {
                second = arr[i];
            }
        }

        System.out.println("Second Largest: " + second);

        sc.close();
    }
}
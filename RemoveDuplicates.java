package com.sarvesh.javabasics;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter sorted elements:");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int index = 0;
        for (int i=1;i<n;i++) {
            if (arr[i] != arr[index]) {
                index++;
                arr[index] = arr[i];
            }
        }

        System.out.println("Array without duplicates:");
        for (int i=0; i<=index;i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

package com.sarvesh.javabasics;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in 1st array: ");
        int n = sc.nextInt();
        sc.nextLine();   
        String[] arr1 = new String[n];
        System.out.println("Enter elements of 1st array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextLine();
        }

        System.out.print("Enter number of elements in 2nd array: ");
        int m = sc.nextInt();
        sc.nextLine();   
        String[] arr2 = new String[m];
        System.out.println("Enter elements of 2nd array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextLine();
        }

        if (isAnagram(arr1, arr2)) {
            System.out.println("It's a valid anagram");
        } else {
            System.out.println("It's not a valid anagram");
        }

        sc.close();
    }

    private static boolean isAnagram(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
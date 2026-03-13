package com.sarvesh.javabasics;
import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++) {
            int count = 1;
            boolean alreadyCounted = false;
            for(int j=0;j<i;j++) {
                if(arr[i] == arr[j]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if(alreadyCounted) {
                continue;
            }
            for(int j=i+1;j<n;j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
        sc.close();
    }
}
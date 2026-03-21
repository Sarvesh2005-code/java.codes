package com.sarvesh.javabasics;

import java.util.Scanner;

public class ContainerWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter heights:");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n-1;
        int maxArea = 0;

        while(left < right) {
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;

            int area = height * width;
            if(area>maxArea) {
                maxArea = area;
            }


            if(arr[left]<arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("Maximum Water: " + maxArea);
        sc.close();
    }
}

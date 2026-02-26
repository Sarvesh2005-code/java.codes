package com.sarvesh.javabasics;

import java.util.Scanner;

public class SlidingWindow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Number of Integers: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.print("Enter Integers: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter Size of Sub Array: ");
		int k = sc.nextInt();
		int result = maximumSubArray(arr, k);
		System.out.println("maximum sub array : " + result);
		sc.close();
	}

	private static int maximumSubArray(int[] arr, int k) {
		int windowsum = 0;
		
		for(int i = 0; i<k;i++) {
			windowsum = windowsum + arr[i];
		}
		int maxsum = windowsum;
		for(int i = k;i<arr.length;i++) {
			windowsum = windowsum - arr[i-k] + arr[i];
			if(maxsum < windowsum) {
				maxsum = windowsum;
			}
		}
		return maxsum;
	}
}

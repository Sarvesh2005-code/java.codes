package com.sarvesh.javabasics;

import java.util.Arrays;
import java.util.Scanner;

public class SortedSquareArray {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number of Elemeents in array: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array Elements: ");
		for(int i = 0 ; i<n;i++) {
			arr[i] = scanner.nextInt(); 
		}
		System.out.println("The sorted square array : " + Arrays.toString(Square(arr)));
	}

	public static int[] Square(int[] arr) {
		int left = 0;
		int right=arr.length-1;
		int writeindex = arr.length-1;
		int[] result = new int[arr.length];
		
		
		while(left<=right) {
			int leftsquare= arr[left]*arr[left];
			int rightsquare = arr[right]*arr[right];
			
			if(leftsquare>rightsquare) {
				result[writeindex] = leftsquare;
				left++;
			}
			else {
				result[writeindex] = rightsquare;
				right--;
			}
			writeindex--;
		}
		
		return result;
	}
}

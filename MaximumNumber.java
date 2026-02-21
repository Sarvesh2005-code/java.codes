package com.sarvesh.javabasics;

public class MaximumNumber {
	 public static void main(String[] args) {
	     int[] numbers = {10, 3, 5, 7, 12};
	     int max = numbers[0];

	     for (int i = 1; i < numbers.length; i++) {
	         if (numbers[i] > max) {
	             max = numbers[i];
	         }
	     }

	     System.out.println("The maximum number is: " + max);
	 }
	
}

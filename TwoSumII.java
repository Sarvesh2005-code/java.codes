/*
 * Imagine you are building a financial backend.
 * You have a massive ledger of daily transactions sorted by amount.
 * The system needs to find two specific transactions that perfectly add up to a specific target value
 * (e.g., matching a deposit to two combined withdrawals) to reconcile an account. 
 * You cannot afford to check every single combination because the ledger has millions of rows.
*/

package com.sarvesh.javabasics;

public class TwoSumII {
	public static void main(String[] args) {
		// 1. The ledger MUST be sorted for this algorithm to work
		int[] arr = {1,2,3,4,5,6,7,8,9}; 
		int target = 9;
		
		int left = 0;
		// 2. Prevent the OutOfBounds crash
		int right = arr.length - 1; 
		
		// 3. The while loop
		while (left < right) {
			int sum = arr[left] + arr[right];
			
			if (sum == target) {
				System.out.println("Reconciliation Match found at indexes: " + left + " and " + right);
				System.out.println("Values: " + arr[left] + " + " + arr[right] + " = " + target);
				break; 
			} 
			else if (sum > target) {
				// Sum is too big, move the right pointer left to get a smaller number
				right--;
			} 
			else {
				// Sum is too small, move the left pointer right to get a bigger number
				left++;
			}
		}
	}
}
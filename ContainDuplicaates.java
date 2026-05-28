package com.sarvesh.javabasics;

import java.util.HashSet;

public class ContainDuplicaates {
	public static void main(String[]args) {
		int[] arr = {3,4,5,6,7,8,9,0,1,1};
		
		HashSet<Integer> seen = new HashSet<>();
		
		for(int i = 0;i<arr.length;i++) {
			int currentnum = arr[i];
			if(seen.contains(currentnum)) {
				System.out.println("Contain Duplicates !!");
				return;
			}
			seen.add(currentnum);
		}
		System.out.println("Array Don't have duplicates");

	}
}

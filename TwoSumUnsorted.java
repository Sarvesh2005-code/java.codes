package com.sarvesh.javabasics;

import java.util.HashMap;
import java.util.Arrays; 

public class TwoSumUnsorted {

    public static void main(String[] args) {
        int[] arr = {7, 11, 2, 15};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println("Match found at indexes: " + Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> num = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int complement = target - currentNum;
            
            if (num.containsKey(complement)) {
                int complementIndex = num.get(complement);
                return new int[] { complementIndex, i };
            }
            
            num.put(currentNum, i);
        }
        return new int[] {};
    }
}
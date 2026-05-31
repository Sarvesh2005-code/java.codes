package com.sarvesh.javabasics;

public class BinarySearch {
    public static void main(String[] args) {
        int[] database = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        System.out.println(search(database, target));
    }
    public static int search(int[] nums, int target) {
    	
        int left = 0;
        int right = nums.length-1;
        
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(target<nums[mid]){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }
}
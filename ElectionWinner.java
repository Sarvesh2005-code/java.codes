package com.sarvesh.javabasics;

import java.util.Arrays;

public class ElectionWinner {

    public static void main(String[] args) {
        int[] votes = {2, 2, 1, 1, 1, 2, 2};
        
        System.out.println("Counting votes for: " + Arrays.toString(votes));
        
        int winner = majorityElement(votes);
     
        System.out.println("The Election Winner is Candidate: " + winner);
    }

    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        
        for (int i=0;i<nums.length;i++) {
            int currentVote=nums[i];
            if (count==0) {
                candidate=currentVote;
            }
            if (currentVote==candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
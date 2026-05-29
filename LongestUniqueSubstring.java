package com.sarvesh.javabasics;

import java.util.HashSet;

public class LongestUniqueSubstring {

    public static void main(String[] args) {
        String stream = "abcabcbb"; 
        int maxLength = lengthOfLongestSubstring(stream);
        System.out.println("Longest unique packet sequence length: " + maxLength);
    }

    public static int lengthOfLongestSubstring(String s) {
 
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLength = 0;
        
        while (right < s.length()) {
            char currentChar = s.charAt(right);
           
            while ( set.contains(currentChar)) {
              set.remove(s.charAt(left));
                left++;
            }
            maxLength = Math.max(maxLength,right-left+ 1);
            right++;
        }
        return maxLength;
    }
}

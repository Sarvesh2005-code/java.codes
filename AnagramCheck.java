package com.sarvesh.javabasics;

import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        if(s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        int[] freq = new int[26];
        for(int i=0;i<s1.length();i++) {
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        boolean isAnagram = true;
        for(int i=0;i<26;i++) {
            if(freq[i] != 0) {
                isAnagram = false;
                break;
            }
        }
        if(isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
        sc.close();
    }
}
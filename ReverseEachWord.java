package com.sarvesh.javabasics;

import java.util.Scanner;
public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversed = "";
            for(int j = word.length() - 1; j >= 0; j--) {
                reversed = reversed + word.charAt(j);
            }
            System.out.print(reversed + " ");
        }
        sc.close();
    }
}
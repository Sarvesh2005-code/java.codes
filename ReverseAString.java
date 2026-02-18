package com.sarvesh.javabasics;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Original String : ");
		String str = sc.nextLine();
		
		String reversed = "";
		int i;
		for(i = str.length()-1;i>=0;i--) {
			reversed += str.charAt(i);
	
		}
		System.out.println("Revesed String : " + reversed);
		sc.close();
	}

}

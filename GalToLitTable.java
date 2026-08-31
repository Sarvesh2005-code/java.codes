package com.sarvesh.javabasics;

import java.util.Scanner;

public class GalToLitTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Gallons want to convert in litres : ");
		int gal = sc.nextInt();
		System.out.println("Expected Litre quantity : "+gal* 3.78541 + "Litres");
	}
}

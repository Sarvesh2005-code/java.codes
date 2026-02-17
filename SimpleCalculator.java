package com.sarvesh.javabasics;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("\n 2--- Calculator ---");
			System.out.println("1. Addition ");
			System.out.println("2. Susbstraction ");
			System.out.println("3. Multiplication ");
			System.out.println("4. Division ");
			System.out.println("5. Exit ");
			System.out.println("------------------");
			System.out.print("Choice : ");
			choice = sc.nextInt();
			
			if (choice >= 1 && choice <= 4) {
				System.out.print("Enter 1st Integer : ");
				double num1 = sc.nextDouble();
				System.out.print("Enter 2nd Integer : ");
				double num2 = sc.nextDouble();
				
				switch(choice) {
				case 1:
					System.out.printf("Addiition of %.2f and %.2f is %.2f.\n", (num1) , (num2) , (num1 + num2 ));
					break;
				case 2: 
					System.out.printf("Substraction of %.2f with %.2f is %.2f.\n" , (num1) ,(num2) ,(num1-num2));
					break;
				case 3:
					System.out.printf("Multiplication of %.2f and %.2f is %.2f.\n" ,(num1) ,(num2) ,(num1*num2));
					break;
				case 4:
					System.out.printf("Division of %.2f with %.2f is %.2f.\n",(num1) ,(num2) ,(num1/num2));					
				
				}
			}
		}while (choice!=5);
		sc.close();

	}
}

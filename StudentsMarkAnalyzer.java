package com.sarvesh.javabasics;

import java.util.Scanner;

public class StudentsMarkAnalyzer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number of Students : ");
		int numberOfStudents = sc.nextInt();
		
		double[] marksOfStudents = new double[numberOfStudents];
		
		if (numberOfStudents <= 0) {
			System.out.println("Try Again , Number of students can't be zero.");
		}
		System.out.print("Enter Student's Marks : ");
		for(int i =0;i<numberOfStudents;i++) {
			marksOfStudents[i] = sc.nextInt();
		}
		 double total = calculateTotal(marksOfStudents);
	     double average = calculateAverage(total, numberOfStudents);
	     int highestIndex = findHighestIndex(marksOfStudents);
	     int lowestIndex = findLowestIndex(marksOfStudents);
	     int aboveAverageCount = countAboveAverage(marksOfStudents, average);
         printReport(total, average, marksOfStudents, highestIndex, lowestIndex, aboveAverageCount);

	     sc.close();
	
	}

 
    public static double calculateTotal(double[] marks) {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total;
    }

  
    public static double calculateAverage(double total, int count) {
        return total / count;
    }


    public static int findHighestIndex(double[] marks) {
        double max = marks[0];
        int index = 0;
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
                index = i;
            }
        }
        return index;
    }


    public static int findLowestIndex(double[] marks) {
        double min = marks[0];
        int index = 0;
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
                index = i;
            }
        }
        return index;
    }

   
    public static int countAboveAverage(double[] marks, double average) {
        int count = 0;
        for (double mark : marks) {
            if (mark > average) {
                count++;
            }
        }
        return count;
    }


    public static void printReport(double total, double average, double[] marks, int highestIndex, int lowestIndex, int aboveAverageCount) {
        System.out.println("\n===== REPORT =====");
        System.out.printf("Total Marks: %.2f%n", total);
        System.out.printf("Average Marks: %.2f%n", average);
        System.out.printf("Highest Marks: %.2f (Index %d)%n", marks[highestIndex], highestIndex);
        System.out.printf("Lowest Marks: %.2f (Index %d)%n", marks[lowestIndex], lowestIndex);
        System.out.printf("Students Above Average: %d%n", aboveAverageCount);
    }
}


package com.sarvesh.javabasics;
import java.util.Scanner;

public class PerformanceAnalyzer {

    @SuppressWarnings("resource")
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Number of days must be positive.");
            return;
        }

        double[] scores = new double[n];

        System.out.println("Enter daily scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextDouble();
        }

        analyzePerformance(scores);

        sc.close();
    }

    public static void analyzePerformance(double[] scores) {
        double total = 0;
        double max = scores[0];
        double min = scores[0];

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < scores.length; i++) {

            total += scores[i];

            if (scores[i] > max) {
                max = scores[i];
                maxIndex = i;
            }
            if (scores[i]<min) {
                min = scores[i];
                minIndex = i;
            }
        }

        double average = total/scores.length;

        int aboveAverageCount = 0;
        for (double score : scores) {
            if (score>average) {
                aboveAverageCount++;
            }
        }
        System.out.printf("Total Score: %.2f%n", total);
        System.out.printf("Average Score: %.2f%n", average);
        System.out.printf("Highest Score: %.2f (Day %d)%n", max, maxIndex);
        System.out.printf("Lowest Score: %.2f (Day %d)%n", min, minIndex);
        System.out.printf("Days Above Average: %d%n", aboveAverageCount);
    }
}

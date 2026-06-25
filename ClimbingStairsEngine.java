package com.sarvesh.javabasics;

public class ClimbingStairsEngine {

    public static void main(String[] args) {
        ClimbingStairsEngine engine = new ClimbingStairsEngine();
        
        System.out.println("Ways to climb 2 steps: " + engine.climbStairs(2)); 
        System.out.println("Ways to climb 5 steps: " + engine.climbStairs(5)); 
        
        long startTime = System.nanoTime();
        int result = engine.climbStairs(45);
        long endTime = System.nanoTime();
        
        System.out.println("Ways to climb 45 steps: " + result);
        System.out.println("Time taken: " + (endTime - startTime) / 1_000_000.0 + " milliseconds");
    }

    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        int twoStepsBelow = 1; 
        int oneStepBelow = 2;  
        int currentStep = 0;
        
        for(int i=3;i<=n;i++) {
            currentStep = oneStepBelow + twoStepsBelow;
            twoStepsBelow = oneStepBelow;
            oneStepBelow = currentStep;
        }
        
        return currentStep;
    }
}
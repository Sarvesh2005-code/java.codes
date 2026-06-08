import java.util.Arrays;

public class PlusOne { 
    
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; 
        return newNumber;
    }

    public static void main(String[] args) {
        PlusOne solution = new PlusOne(); 

        int[] test1 = {1, 2, 3};
        System.out.println("Input:  " + Arrays.toString(test1));
        System.out.println("Output: " + Arrays.toString(solution.plusOne(test1)));
    }
}
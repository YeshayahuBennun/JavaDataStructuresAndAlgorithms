package Recursion;

/**
 * This file is a part of JavaDataStructuresAndAlgorithms project.
 *
 * @author Yeshayahu Bennun
 * @version 1.0.0
 * @since 25/09/2021
 */

/*How to find the sum of digits of a positive integer number using recursion?*/
public class RecursionSumOfNumberDigits {
    public static void main(String[] args) {
        RecursionSumOfNumberDigits recursion = new RecursionSumOfNumberDigits();

        var result = recursion.sumOfDigits(151);
        System.out.println(result);

    }

    public int sumOfDigits(int n) {
        if (n == 0 || n < 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }
}

package Recursion;

/**
 * This file is a part of JavaDataStructuresAndAlgorithms project.
 *
 * @author Yeshayahu Bennun
 * @version 1.0.0
 * @since 25/09/2021
 */
public class RecursiveFactorial {
    public static void main(String[] args) {

        RecursiveFactorial recursion = new RecursiveFactorial();

        var rec = recursion.factorial(4);

        System.out.println(rec);

    }

    public int factorial(int n) {

        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

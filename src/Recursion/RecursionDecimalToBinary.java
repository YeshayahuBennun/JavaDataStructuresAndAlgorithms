package Recursion;

/**
 * This file is a part of JavaDataStructuresAndAlgorithms project.
 *
 * @author Yeshayahu Bennun
 * @version 1.0.0
 * @since 26/09/2021
 */
/*How to convert a number from Decimal to Binary using recursion*/
public class RecursionDecimalToBinary {
    public static void main(String[] args) {
        RecursionDecimalToBinary recursion = new RecursionDecimalToBinary();
        var result = recursion.decimalToBinary(10);
        System.out.println(result);
    }

    public int decimalToBinary(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2 + 10 * decimalToBinary(n / 2);
    }
}

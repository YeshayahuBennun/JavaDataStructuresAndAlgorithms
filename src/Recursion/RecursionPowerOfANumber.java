package Recursion;

/**
 * This file is a part of JavaDataStructuresAndAlgorithms project.
 *
 * @author Yeshayahu Bennun
 * @version 1.0.0
 * @since 25/09/2021
 */
/*How to calculate power of a number using recursion */
public class RecursionPowerOfANumber {
    public static void main(String[] args) {
        RecursionPowerOfANumber recursion = new RecursionPowerOfANumber();
        var result = recursion.power(2, 2);
        System.out.println(result);
    }

    public int power(int base, int exp) {
        if (exp < 0) {
            return -1;
        }
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }
}

package Recursion;

/**
 * This file is a part of JavaDataStructuresAndAlgorithms project.
 *
 * @author Yeshayahu Bennun
 * @version 1.0.0
 * @since 25/09/2021
 */

/*How to find GCD (Greatest Common Divisor) of two numbers using recursion */
public class RecursionGCD {
    public static void main(String[] args) {
        RecursionGCD recursion = new RecursionGCD();
        var result = recursion.gdc(-8, 4);

        System.out.println(result);

    }

    public int gdc(int a, int b) {
        if(a<0||b<0){
            return -1;
        }
        if (b == 0) {
            return a;
        }
        return gdc(b, a % b);
    }
}

package Recursion;

/**
 * This file is a part of JavaDataStructuresAndAlgorithms project.
 *
 * @author Yeshayahu Bennun
 * @version 1.0.0
 * @since 25/09/2021
 */
public class RecursionFibonacci {
    public static void main(String[] args) {
        RecursionFibonacci recursion = new RecursionFibonacci();

        var rec = recursion.fibonacci(4);
        System.out.println(rec);
    }

    public int fibonacci(int n) {
        if(n<0){
            return -1;
        }
        if(n==0||n==1){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

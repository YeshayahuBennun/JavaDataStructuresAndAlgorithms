package Recursion;

/**
 * This file is a part of JavaDataStructuresAndAlgorithms project.
 *
 * @author Yeshayahu Bennun
 * @version 1.0.0
 * @since 24/09/2021
 */

/*Stack Memory in the recursive methods order*/
public class RecursionLogic {
    static void firstMethod() {
        secondMethod();
        System.out.println("I am the first method");
    }

    static void secondMethod() {
        thirdMethod();
        System.out.println("I am the second method");
    }

    static void thirdMethod() {
        fourthMethod();
        System.out.println("I am the third method");
    }

    static void fourthMethod() {
        System.out.println("I am the forth method");
    }

    public static void main(String[] args) {
        firstMethod();
    }
}



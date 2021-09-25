package Recursion;

/**
 * This file is a part of JavaDataStructuresAndAlgorithms project.
 *
 * @author Yeshayahu Bennun
 * @version 1.0.0
 * @since 24/09/2021
 */
public class RecursiveMethod {
    static void recursiveMethod(int n){
        if(n<1){
            System.out.println("n is less than 1");
        }else{
            recursiveMethod(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        recursiveMethod(4);
    }
}

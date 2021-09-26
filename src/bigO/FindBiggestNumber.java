package bigO;

/**
 * This file is a part of JavaDataStructuresAndAlgorithms project.
 *
 * @author Yeshayahu Bennun
 * @version 1.0.0
 * @since 26/09/2021
 */
public class FindBiggestNumber {
    public static void findBiggestNumber(int[] sampleArray) {
        var biggestNumber = sampleArray[0]; //---------------> O(1)
        for (int i = 1; i < sampleArray.length; ++i) { // ---> O(n)
            if (sampleArray[i] > biggestNumber) {//----------> O(1)
                biggestNumber = sampleArray[i];//------------> O(1)
            }
        }
        System.out.println(biggestNumber);//-----------------> O(1)

        //Time complexity expression
        //O(1) + O(1) = O(1)
        //O(n) + O(1) = O(n)
        //O(1) + O(n) + O(1) = O(n)
    }

    public static void main(String[] args) {
        findBiggestNumber(new int[]{1,2,30,10});
    }
}

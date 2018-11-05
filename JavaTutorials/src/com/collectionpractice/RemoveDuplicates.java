package com.collectionpractice;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String args[]){
        int[][] test = new int[][]{
                {1, 1, 2, 2, 3, 4, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},};

        for(int[] input : test ){
            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
            System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicates(input)));
        }

    }

    public static int[] removeDuplicates(int[] input) {

        Arrays.sort(input);
        int[] result = new int[input.length];
        int previous = input[0];
        result[0] = previous;

        for (int i = 1; i < input.length; i++) {
            if (previous != input[i]) {
                result[i] = input[i];
            }

            previous = input[i];
        }
        return result;
    }
}

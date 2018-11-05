package com.collectionpractice;

import java.util.Arrays;

public class TopTwoMax {
    public static void main(String args[]){
        topTwo(new int[]{20, 34, 21, 87, 92, Integer.MAX_VALUE});
    }

    public static void topTwo(int[] array){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i =0 ; i< array.length; i++){
            if(array[i]> max1){
                max2 =max1;
                max1 = array[i];
            }else if (array[i] > max2){
                max2 =array[i];
            }
        }
        System.out.println("Given integer array : " + Arrays.toString(array));
        System.out.println("First maximum number is : " + max1);
        System.out.println("Second maximum number is : " + max2);


    }
}

package com.algorithmpractice;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
        int i ,j, pos, temp;
        for(i=0; i< a.length;i++) {
            pos = smallestValue(a, a.length, i);
            temp = a[i];
            a[i] = a[pos];
            a[pos] = temp;
        }
        System.out.println("\nprinting sorted elements...\n");
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static int smallestValue(int[] arr, int length , int i){
        int small,pos,j;
        small = arr[i];
        pos = i;

        for(j=i+1;j< length;j++){
            if(arr[j]< small){
                small = arr[j];
                pos=j;
            }
        }
        return pos;
     }
    }

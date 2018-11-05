package com.algorithmpractice;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {16, 19, 20, 23, 45, 56, 78, 90, 96, 100};
        int item, location = -1;
        System.out.println("Enter item you want to search");
        Scanner sc = new Scanner(System.in);
        item =  sc.nextInt();
        location = binarySearch(arr,0,9, item);
        if(location != -1)
            System.out.println("the location of the item is "+location);
        else
            System.out.println("Item not found");
    }

    public static int binarySearch(int[] arr, int beg, int end, int item){
     int mid;
     if(end >= beg){
         mid = (beg+end)/2;
         if(arr[mid] == item){
             return mid+1;
         }
         else if(arr[mid] < item)
         {
             return binarySearch(arr,mid+1,end,item);
         }
         else
         {
             return binarySearch(arr,beg,mid-1,item);
         }
     }
     return -1;
    }
}

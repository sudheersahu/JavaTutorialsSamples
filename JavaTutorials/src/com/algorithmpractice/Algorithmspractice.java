package com.algorithmpractice;

import java.util.Scanner;

public class Algorithmspractice {

    public static void main(String[] args){
        evenoddSum();
        factorial();
        fibannoci();
        primenumber(27);
        palindrome(1221);
        hcfandLcm();
        bubbleSort();


        for(int i=0; i<5; i++)
        {

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(int j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
    }


  public static void evenoddSum(){
    int evensum = 0;
    int oddsum = 0;

    for(int i =1; i <= 10;i++){
        if(i%2 == 0){
            evensum++;
        }else{
            oddsum++;
        }
    }
    System.out.println("evensum " +evensum);
    System.out.println("oddsum " +oddsum);
   }

    public static void factorial(){
       int n= 5;
       int f= 1;
       for(int i =n; i>=1 ;i--){
           f= f*i;
       }

       System.out.println("factorial is:" +f);
    }

    public static void fibannoci(){

        int a = 0;int b = 1;
        int c= 0;
        int i;
        int n = 6;
        System.out.println(" " + a + " "+b);

        for( i =1; i<=(n-2);i++){
            c = a+b;
            System.out.println(" " + c);
            a=b;
            b=c;
        }

    }

    public static void primenumber(int n){

        boolean isPrime = true;

        for (int i = 2; i<n/2; i++){
            if(n%i ==0){
                isPrime = false;
            }
        }

        System.out.println("IS Prime " +isPrime);
    }

    public static void hcfandLcm(){

        int a,b,s, hcf = 0, lcm = 0 ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first num :");
       a =  sc.nextInt();
        System.out.println("Enter the second num ");
       b =  sc.nextInt();

        s= a<b?a:b;

        for(int i =1 ; i<=s; i++){

            if((a%i ==0 ) && (b%i == 0)){
                hcf=i;
            }

        }

        System.out.println("HCF "+hcf);
        lcm =(a*b)/hcf;
        System.out.println("LCM "+lcm);
    }

    public static void palindrome(int n){

        int i;
        int m=n;
        int sum =0;
        while(n>0){
            i = n%10;
            sum = sum*10+i;
            n = n/10;
        }

        if(m==sum){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }

    public static void bubbleSort(){
        int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};

        for(int i = 0; i<10;i++){
            for(int j =0 ;j<10; j++){
                if(a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Printing sorted list");
        for(int i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}
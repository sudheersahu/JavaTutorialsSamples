package com.stringpractice;

import java.io.Console;
import java.util.stream.Stream;

public class StringSamples {

public static void main(String args[]){

    //case-1
    System.out.println("*******case1********** \n");
    String s = new String("durga");
    s.concat("software");
    System.out.println(s);

    StringBuffer sb = new StringBuffer("durga");
    sb.append("software");
    System.out.println(sb + "\n" );

    System.out.println("*******case2******** \n");
    //case-2
    String s1= new String("durga");
    String s2 = new String("durga");
    System.out.println(s1== s2);
    System.out.println(s1.equals(s2));

    StringBuffer s3 = new StringBuffer("durga");
    StringBuffer s4 = new StringBuffer("durga");
    System.out.println(s3== s4);
    System.out.println(s3.equals(s4)+ "\n" );

    //case-3

    String s5 = "durga";
    String s6 = new String("durga");

    //case-4 contains three obj, two in heap area and one in string constant pool, as duplicates are not allowed in SCP area.
    String s7 = new String("durga");
    String s8 = new String("durga");
    String s9 = "durga";
    String s10 = "durga";

    //case-5

    System.out.println("******case3******** \n");

    String s11 = new String("durga");
    s11.concat("software");
    String s12 = s11.concat("solutions");
    s11 = s11.concat("Soft");
    System.out.println(s11);
    System.out.println(s12 + "\n" );



    String str = "Welcome to string handling tutorial";
    String str1 = "String method tutorial";
    String str2 = " compareTo method example";

    // String methods
    char ch1 = str.charAt(11); //charAt
    int  i1 =  str1.compareTo(str2);
    boolean startsWith = str1.startsWith("String");
    boolean startsWithIndex = str1.startsWith("String",1);
    boolean endsWith = str2.endsWith("example");
    int lastindex = str1.lastIndexOf("t");

    System.out.println("******String Methods Results******** \n");

    System.out.println(ch1);
    System.out.println(i1);
    System.out.println(startsWith);
    System.out.println(startsWithIndex);
    System.out.println(endsWith);
    System.out.println(str2.trim());
    System.out.println(lastindex);

    String substring = str.substring(7);
    System.out.println(substring);

    String substr = str.substring(7,9);
    System.out.println(substr);

    substr = substr.replace("t","y");

    System.out.println(str);
    System.out.println(substr);

    //String intern
    String str11 = "Hello";

    //Java automatically interns this
    String str12 = "Hello";

    //This is same as creating string using string literal
    String str3 = "Hello".intern();

    //This will create a new instance of "Hello" in memory
    String str4 = new String("Hello");



    if ( str11 == str12 ){
        System.out.println("String str1 and str2 are same");
    }

    if ( str12 == str3 ){
        System.out.println("String str2 and str3 are same" );
    }

    if ( str1 == str4 ){
        //This will not be printed as the condition is not true
        System.out.println("String str1 and str4 are same" );
    }


    //char

    char a= 89;
    char b= 'm';
    System.out.println(a+ " "+ b);
    a++;
    System.out.println(a);

}
}

package com.stringpractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Solutions {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {

        StringBuffer result = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                char ch = (char) (((int) s.charAt(i) + k - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) s.charAt(i) +
                        k - 97) % 26 + 97);
                result.append(ch);
            }
        }

        System.out.println(result.toString());
        return result.toString();
    }

    static int stringConstruction(String s) {

        System.out.println((int) s.chars().distinct().count());
        return (int) s.chars().distinct().count();
    }


    static boolean palindrome(String s) {

        boolean palindromeOrNot = false;
        StringBuffer sb = new StringBuffer(s);
        if (sb.reverse().toString().equals(s)) {
            palindromeOrNot = true;
        }
        System.out.println("palindrome " + palindromeOrNot);
        return palindromeOrNot;
    }

    static boolean palindromeFor(String s) {

        StringBuilder sb = new StringBuilder();
        char[] schars = s.toCharArray();

        for (int i = schars.length - 1; i >= 0; i--) {
            sb.append(schars[i]);
        }
        if (sb.toString().equals(s)) {
            return true;
        }

        return false;
    }

    static boolean palindromeRecursive(String s) {

        String reverse = reverseRecursive(s);

        if (reverse.equals(s)) {
            return true;
        }

        return false;
    }

    static String reverseRecursive(String sg) {
        if (sg.length() < 2) {
            return sg;
        }

        return reverseRecursive(sg.substring(1)) + sg.charAt(0);
    }

    private static final Scanner scanner = new Scanner(System.in);

    static String removeChar(char c, String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != c) {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }

    static String removeRecursive(String s, char c) {

        int index = s.indexOf(c);

        if (index == -1) {
            return s;
        }

        return removeRecursive(s.substring(0, index) + s.substring(index + 1, s.length()), c);
    }

    public static void permutation(String s) {
        permutation("", s);
    }

    private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.err.println(perm + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
            }
        }
    }

    public static void main(String[] args) throws IOException {

        String result = caesarCipher("middle-Outz", 2);

        int cost = stringConstruction("abcd");

        String[] arr = {"abcdde", "baccd", "eeabg"};

        Student student1 = new Student();
        Class c1 = student1.getClass();
        Student student2 = new Student();
        Class c2 = student2.getClass();
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.hashCode() == c2.hashCode());

        palindrome("mam");
        System.out.println("palindrome for " + palindromeFor("mam"));
        System.out.println("palindrome for recursive " + palindromeRecursive("mam"));

        System.out.println("remove char c " + removeChar('c', "pac"));
        System.out.println("remove recursive c " + removeRecursive("pac", 'c'));
        permutation("123");
    }

}

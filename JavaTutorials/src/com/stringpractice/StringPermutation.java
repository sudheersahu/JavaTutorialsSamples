package com.stringpractice;

import java.util.*;

import static com.stringpractice.Solutions.permutation;

public class StringPermutation {

    public static void main(String args[]) {
      //  permutation("123");
        System.out.println("nonRepeatedChar " + getNonRepeatedChar("sully"));

        System.out.println("Is Anagram or not: " + isAnagram("army", "mary"));
        System.out.println("Is loop Anagram or not: " + iAnagram("army", "mary"));
        int[] iArray = new int[]{1, 2, 3, 5};
        int missing = getMissingNumber(iArray, 5);
        System.out.println("missing "+missing);

        printMissingNumber(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10}, 10);

    }

    public static char getNonRepeatedChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>(s.length());

        for (char c : s.toCharArray()) {
            map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("didn't find any non repeated Character");
    }

    public static boolean isAnagram(String word, String anagram) {
        char[] wordArray = word.toCharArray();
        char[] anagramArray = anagram.toCharArray();
        Arrays.sort(wordArray);
        Arrays.sort(anagramArray);
        return Arrays.equals(wordArray, anagramArray);
    }

    public static boolean iAnagram(String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }

        char[] chars = word.toCharArray();
        for (char c : chars) {
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            } else {
                return false;
            }
        }
        return anagram.isEmpty();
    }

    public static int getMissingNumber(int[] a, int b){
        int expectedSum = b*((b+1)/2);
        int actualSum = 0;
        for (int i : a){
            actualSum+= i ;
        }
        return expectedSum-actualSum;
    }

    public static void printMissingNumber(int[] numbers, int count){
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);

        for (int number : numbers){
            bitSet.set(number-1);
        }
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",Arrays.toString(numbers),count);
        int lastMissingIndex = 0;

        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }

}

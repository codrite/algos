package com.codrite;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReverseVowels {

    public static void main(String[] args) {
//        System.out.println(reverseVowels("a."));
//        System.out.println(reverseVowels("abcde"));
//        System.out.println(reverseVowels("aaaaaa"));
//        System.out.println(reverseVowels("abcbce,,,,,"));
        int[][] len = new int[][]{{ 1,2 }, {1,3}, {1,4}};
        System.out.println(len.length);
        System.out.println(insert("abc"));
    }

    public static String reverseVowels(String s) {

        if(s == null || s.length() == 0)
            return s;

        // set of vowels
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('A');
        vowels.add('e');
        vowels.add('E');
        vowels.add('i');
        vowels.add('I');
        vowels.add('o');
        vowels.add('O');
        vowels.add('u');
        vowels.add('U');

        char[] array = s.toCharArray();// LEETCODE
        List<Integer> list = new ArrayList<>();
        for(int count = 0; count < array.length; count++)
            if(vowels.contains(array[count]))
                list.add(count);

        while(true) {
            if(list.size() >= 2) {
                swap(array, list.get(0), list.get(list.size() - 1));
                list.remove(0);
                list.remove(list.size() - 1);
            } else break;
        }

        StringBuilder sb = new StringBuilder();
        for(char c : array){
            sb.append(c);
        }

        return sb.toString();
    }

    static void swap(char[] array, int left, int right) {
        char t = array[left];
        array[left] = array[right];
        array[right] = t;
    }

    static String insert(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : s.toCharArray())
            stringBuilder.insert(0, c);
        return stringBuilder.toString();
    }

}

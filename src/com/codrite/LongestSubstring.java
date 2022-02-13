package com.codrite;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static void main(String[] args) {
        //System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring("abcabcabcabcbbdefg"));
    }

//    public static int lengthOfLongestSubstring(String input) {
//
//        if (input == null || input.length() == 0)
//            return 0;
//
//        Set<Character> matchingCharacters = new HashSet<>();
//        Set<Character> tempSet = new HashSet<>();
//
//        int count = 0;
//        char[] array = input.toCharArray();
//
//        while (count < array.length) {
//            int temp = count;
//            while (temp < array.length && !tempSet.contains(array[temp])) {
//                tempSet.add(array[temp]);
//                temp++;
//            }
//
//            if (matchingCharacters.size() < tempSet.size()) {
//                matchingCharacters.clear();
//                matchingCharacters.addAll(tempSet);
//                tempSet.clear();
//            } else {
//                tempSet.clear();
//            }
//            count++;
//        }
//
//        return matchingCharacters.size();
//
//    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }

}

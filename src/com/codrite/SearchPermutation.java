package com.codrite;


import java.util.Comparator;
import java.util.List;

public class SearchPermutation {

    public static void main(String[] args) {
        findPermutation("abbaaabbdabbdddabcbcbaabaaabbbbaaabbaabbabbabbaaabb", "abba");
        findPermutation("abba123332434123", "123");
        findPermutation("abba123332434-123-", "-123-");
        findPermutation("abba", "abb");
        findPermutation("abba", "a");
        findPermutation("abba", "b");
    }

    static void findPermutation(String target, String searchString) {
        if(target == null || searchString == null)
            throw new RuntimeException();

        int searchStringLength = searchString.length(); // 4
        long sumOfSearchStringCharacters = calculateSum(searchString); // x
        int position = 0;

        while( (position + searchStringLength - 1) < target.length() ) {
            String subString = target.substring(position, position+searchStringLength);
            if(calculateSum(subString) == sumOfSearchStringCharacters)
                System.out.println(position + " : " + (position + searchStringLength - 1));

            position++;
        }

        System.out.println("-------------------");
    }

    static long calculateSum(String input) {
        long sum = 0;
        for(char c : input.toCharArray())
            sum += c;
        return sum;
    }

}
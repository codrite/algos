package com.codrite;

public class FindDuplicates {

    public static void main(String[] args) {
//        System.out.println(isPalindrome("abbaabba"));
//        System.out.println(isPalindrome("madam"));
//        System.out.println(isPalindrome("abcddcba"));
//        duplicates(new int[]{1,2,3,4,4,4});

        System.out.println(longestPalindrome("aba"));
        System.out.println(longestPalindrome("ab"));
        System.out.println(longestPalindrome("abbba"));
        System.out.println(longestPalindrome("abb"));
        System.out.println(longestPalindrome("babad"));
        System.out.println("abcd".substring(1, 4));
        System.out.println(find("abcd".toCharArray(), 'd', 0));
    }

    public static String longestPalindrome(String s) {

        if(s == null || s.length() == 0)
            return "";

        if(s.length()==1)
            return s;

        if(s.length() == 2 && s.toCharArray()[0] != s.toCharArray()[1])
            return s.toCharArray()[0]+"";

        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++){
            int index = -1;
            while(i < c.length && index == -1){
                index = find(c, c[i], i++);
            }

            if(index == -1)
                return "";

            String maxLenString = s.substring(i-1, index+1);
            if( isPalindrome(maxLenString) )
                return maxLenString;
        }

        return "";
    }

    static int find(char[] c, int a, int b){
        for(int i = 0; i < c.length; i++)
            if(c[i] == a && i != b)
                return i;

        return -1;
    }


    static void duplicates(int[] array){
        int[] temp = new int[10];

        for(int i : array)
            temp[array[i]]++;

        for(int j = 0; j < temp.length; j++)
            if(temp[j] > 1)
                System.out.println(j);
    }

    static boolean isPalindrome(String input) {

        if(input.length() == 1)
            return true;

        int index = 0;
        char[] c = input.toCharArray();
        int len = c.length;
        while(index < len){
            if(c[index] == c[len-1-index])
                index++;
            else
                break;
        }

        return index == len;

    }

}

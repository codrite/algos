package com.codrite;

public class Multiply2String {

    public static void main(String[] args) {
        System.out.println(multiply("1", "1"));
        System.out.println(multiply("0", "21"));
        System.out.println(multiply("1", "21"));
        System.out.println(multiply("11", "11"));
        System.out.println(multiply("111", "111"));
        System.out.println(multiply("66", "6"));
        System.out.println(multiply("666", "6"));
        System.out.println(multiply("6666", "6"));
        System.out.println(multiply("66666", "6"));
        System.out.println(multiply("666666", "6"));
    }

    public static String multiply(String num1, String num2) {
        return String.valueOf(toNumber(num1)*toNumber(num2));
    }

    static long toNumber(String in){
        long val = 0;
        int len = in.length()-1;
        for(char c : in.toCharArray()){
            val += (c-'0')*(long)Math.pow(10, len--);
        }
        return val;
    }

}

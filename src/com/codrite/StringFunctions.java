package com.codrite;

public class StringFunctions {

    public static void main(String[] args) {
        String string = "abcdefa";

        System.out.println(string.contains("bcdef"));

        System.out.println(string.substring(0, 1));
        System.out.println(string.contentEquals("abcdef"));

        System.out.println(string.indexOf("a", 1));
        System.out.println(string.lastIndexOf("a"));
        System.out.println(string.lastIndexOf("a",1));

        System.out.println(string.repeat(2));


    }

}

package com.codrite;

import java.util.regex.Pattern;

public class PatternExtractor {

    public static void main(String[] args) {
        assert 6 == eval("2*3");
    }

    private static int eval(String s) {
        Pattern pattern = Pattern.compile("[1-9*]");
        for(String e : pattern.split(s))
            System.out.println(e);
        return 0;
    }

}

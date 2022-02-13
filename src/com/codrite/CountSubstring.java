package com.codrite;

public class CountSubstring {

    public static void main(String[] args) {
        System.out.println(numSub("ddaabb"));
    }

    static public int numSub(String s) {
        int modulo = 1000000000 + 7;
        int ret = 0;
        int one = 0;
        char[] c = s.toCharArray();
        for(int i = 0; i < s.length(); i++) {
            if(c[i] == 'd') one = 0;
            else one++;
            ret += one;
            ret %= modulo;
        }
        return ret;
    }

}

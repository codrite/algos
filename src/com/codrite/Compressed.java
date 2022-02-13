package com.codrite;

public class Compressed {

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x){
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)res;
        }
    }

    static String compressed(String input){
        int[] l = new int[input.length()];
        int[] r = new int[input.length()];

        char[] c = input.toCharArray();
        for(int i = 1; i+1 < c.length; ){
            if(c[i] == c[i+1] ) {
                l[i] = c[i];
                r[i] += 1;
            }
        }
        return "";
    }

}

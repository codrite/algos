package com.codrite;

public class LeetCodeContest2 {

    public static void main(String[] args) {
//        System.out.println(delete("abcde", 0, 2));
        /*
        "bbabbbabbbbcbb"
        */
        System.out.println(getLengthOfOptimalCompression("bbabbbabbbbcbb", 4));
    }

    static public int getLengthOfOptimalCompression(String s, int k) {
        if(s.length() == k)
            return 0;

        String eval = null;
        for (int i = 0; i < s.length(); i++) {
            String comp = create(delete(s, i, k));
            if (eval == null || eval.length() > comp.length())
                eval = comp;
        }
        return eval == null ? 0 : eval.length();
    }

    static String delete(String s, int i, int j) {
        if (j + i >= s.length())
            return "";

        if (i == 0)
            return s.substring(j);

        return s.substring(0, i) + s.substring(i + j);
    }

    static String create(String s) {
        String n = "";
        char[] c = s.toCharArray();
        Character e = null;
        int d = 0;
        for (int i = 0; i < c.length; i++) {
            if (e == null) {
                e = c[i];
                d = 1;
                continue;
            }
            if (e == c[i]) {
                d++;
            } else {
                if (d > 1)
                    n += "" + e + "" + d;
                else
                    n += "" + e;
                e = c[i];
                d = 1;
            }
        }
        if (d > 1)
            n += "" + e + "" + d;
        else
            n += "" + e;
        return n;
    }

}

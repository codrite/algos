package com.codrite;

import java.util.*;

public class MaxNumberOfSubstring {

    public static void main(String[] args) {
        System.out.println(maxNumOfSubstrings("adefaddaccc"));
    }

    public static Set<String> maxNumOfSubstrings(String s) {

        List<String> l = mns(s);
        Set<String> f = new HashSet<>();
        for(int i = 0; i < l.size(); i++)   {
            for(int j = i+1; j < l.size(); j++) {
                if (!l.get(i).contains(l.get(j)))
                    f.add(l.get(j));
            }
        }

        return f;

    }

    static List<String> mns(String s) {
        if(s.length() == 0)
            return Collections.emptyList();

        List<String> l = new ArrayList<>();

        char c = s.charAt(0);
        int li = s.lastIndexOf(c);
        if(li > 0)
            l.add(s.substring(0, li+1));
        else
            l.add(c+"");

        l.addAll(mns(s.replaceAll(c+"", "")));

        return l;
    }


}

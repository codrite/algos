package com.codrite;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class LeetCodeContest1 {

    public static void main(String[] args) {
        System.out.println(getLengthOfOptimalCompression("aabaabbcbbbaccc",6));
    }

    static public String restoreString(String s, int[] indices) {
        char[] n = new char[s.length()];
        char[] c = s.toCharArray();
        int e = 0;
        for(int a : indices)
            n[a] = c[e++];
        String k = "";
        for(char h : n)
            k += h;
        return k;
    }

    static public int getLengthOfOptimalCompression(String s, int k) {
        Map<Character, Integer> map = new ConcurrentHashMap<>();

        char[] c = s.toCharArray();
        for(Character e : c){
            if(map.containsKey(e))
                map.put(e, map.get(e)+1);
            else
                map.put(e, 1);
        }

        int j = 1;
        while(k > 0){
            for(Character p : map.keySet()) {
                if(map.get(p) == j){
                    map.remove(p);
                }
                k--;
                if(k < 1)
                    break;
            }
            j++;
        }

        StringBuilder sb = new StringBuilder();
        for(Character g : map.keySet())
            sb.append(g + map.get(g));

        return sb.length();
    }




    static String create(String s){
        String n = "";
        char[] c = s.toCharArray();
        Character e = null;
        int d = 0;
        for(int i = 0 ; i < c.length; i++){
            if(e == null){
                e = c[i];
                d = 1;
                continue;
            }
            if(e == c[i]){
                d++;
            } else {
                if(d>1)
                    n += ""+e+""+d;
                else
                    n += ""+e;
                e = c[i];
                d = 1;
            }
        }
        if(d>1)
            n += ""+e+""+d;
        else
            n += ""+e;
        return n;
    }


}

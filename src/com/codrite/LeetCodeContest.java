package com.codrite;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class LeetCodeContest {

    public static void main(String[] args) {
        System.out.println(getLengthOfOptimalCompression("aabaabbcbbbaccc",6));
//        System.out.println(restoreString("ab", new int[]{1,0}));
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

        // case k = 0

        Map<Character, Integer> map = new ConcurrentHashMap<>();
        char[] c = s.toCharArray();
        for(Character e : c){
            if(!map.containsKey(e))
                map.put(e, 1);
            else
                map.put(e, map.get(e)+1);
        }

        if(map.size() == 1 && k == 1){
            return 0;
        }

        Set<Character> set = new HashSet<>();

        for(Character e : map.keySet()){
            if(map.containsKey(e)) {
                int g = map.get(e);
                if (k >= g) {
                    k -= g;
                    map.remove(e);
                    set.add(e);
                }
            }
            if(map.size() == 1)
                break;
        }

        for(char f : set){
            s = s.replaceAll(f+"", "");
        }

        return create(s).length();

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

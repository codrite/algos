package com.codrite;

import java.util.HashMap;
import java.util.Map;

public class Strobic {

    public static void main(String[] args) {
        System.out.println(isStrobogrammatic("962"));
    }

    public static boolean isStrobogrammatic(String num) {

        // 1 test cases
        /*
        0,1,6,8,9 = true
        2,3,4,5,7 = false
        */

        // 2 null, empty?
        if(num == null || num.isEmpty() || num.isBlank())
            return false;

        // 3 mapping of numbers
        /*
          6-9, 1-1, 8-8, 9-6, 0-0
        */
        Map<Integer, Integer> m = new HashMap<>();
        m.put(6,9);
        m.put(9,6);
        m.put(8,8);
        m.put(1,1);
        m.put(0,0);

        // 4 algo
        // 69
        // 000
        // 666999
        boolean sb = true;
        char[] c = num.toCharArray();
        int len = c.length;
        int acc = c.length-1;
        for(int i = 0; i < len/2; i++){
            if(!m.containsKey(Integer.parseInt(""+c[i])) && !m.containsKey(Integer.parseInt(""+c[acc-i]))){
                sb = false;
                break;
            }
            if(Integer.parseInt(""+c[i]) != m.get(Integer.parseInt(""+c[acc-i]))){
                sb = false;
                break;
            }
        }

        return sb;
    }

}

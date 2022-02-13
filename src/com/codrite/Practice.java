package com.codrite;

import java.util.HashSet;
import java.util.Set;

public class Practice {

    public static void main(String[] args) {
        //System.out.println(countOdds(-3,-3));
//        System.out.println(build());

//        long s = System.currentTimeMillis();
//        System.out.println(numSplits("abacd"));
//        System.out.println(System.currentTimeMillis()-s);

//        System.out.println(minNumberOperations(new int[]{1,2,3,2,1}));
        System.out.println(isPowerOfN(16));
        System.out.println(isPowerOfN(8));
        System.out.println(isPowerOfN(128));
        System.out.println(isPowerOfN(5));



    }

    static boolean isPowerOfN(int n) {

        int i = 1;
        int count = 0;
        while (n > 0) {
            int j = n & i;
            if (j == 1)
                count++;
            n = n >> 1;
        }

        return (count == 1);

    }

    static public int countOdds(int low, int high) {
        if(low > high)
            return 0;

        if(low == high)
            return low%2 == 1 ? 1 : 0;

        if(low%2==0)
            low++;

        if(high%2==0)
            high--;

        return (high-low)/2+1;
    }

    static public int numSplits(String s) {
        int gs = 0;
        for(int i = 1; i < s.length(); i++){
            String a = s.substring(0, i);
            String b = s.substring(i);
            if(distinct(a)==distinct(b))
                gs++;
        }
        return gs;
    }

    static public int distinct(String s){
        Set<Character> set = new HashSet<>();
        for(Character c : s.toCharArray())
            set.add(c);
        return set.size();
    }

    static public Set<Character> build(){
        Set<Character> set = new HashSet<>();
        for(char c = 'a'; c <= 'z'; c++)
            set.add(c);
        return set;
    }

    public static int minNumberOperations(int[] target) {
        int[] init = new int[target.length];

        int min = findMin(target);
        int max = findMax(target);

        int incr = 0;
        boolean once = false;
        while(min++ != max){
            for(int i = 0; i < target.length; i++){
                if(target[i]<init[i]){
                    init[i]++;
                    if(!once){
                        incr++;
                        once = true;
                    }
                }
            }
            once = false;
        }

        return incr;
    }

    static int findMin(int[] a){
        int i = Integer.MAX_VALUE;
        for(int c : a)
            if(i > c)
                i = c;
        return i;
    }

    static int findMax(int[] a){
        int i = Integer.MIN_VALUE;
        for(int c : a)
            if(i < c)
                i = c;
        return i;
    }


}

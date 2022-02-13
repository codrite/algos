package com.codrite;

public class IBT2 {

    public static void main(String[] args) {
        int[] a = new int[20000];
        for(int i = 0, b =-10000; i < 20000; i++, b++) {
            if(b == 0)
                b++;
            a[i] = b;
        }

        long s = System.currentTimeMillis();
        System.out.println(solution(a));
        System.out.println(System.currentTimeMillis()-s);
    }

    static public int solution(int[] A) {
        // write your code in Java SE 8

        if(A == null || A.length == 0)
            return 1;

        int negative = 0;
        for(int i : A){
            if(i < 0)
                negative++;
            else if(i == 0)
                return 0;
        }

        if(negative%2 == 0)
            return 1;

        return -1;

    }


}

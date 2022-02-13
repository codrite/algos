package com.codrite;

public class Happy {

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    static public boolean isHappy(int n) {
        if(n == 1)
            return true;

        long sum = sumOfSquares(n);
        while(sum != 1){
            System.out.println(sum);
            sum = sumOfSquares(sum);
        }

        return true;
    }

    // 19
    static long sumOfSquares(long m){
        if(m == 1 || m == 0)
            return m*m;
        else {
            long n = m%10;//9
            long square = n*n;//81
            m = m/10;//1
            return square + sumOfSquares(m);//81+1 => 82
        }
    }

}

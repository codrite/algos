package com.codrite;

public class MTBank {

    public static void main(String[] args) {
        solution(100000010);
    }

    static public void solution(int N) {
        System.out.println(N);
        int enable_print = (N > 0 && N < 1000000001 ? 1 : 0);
        while (N > 0) {
            enable_print += N%10;
            if (enable_print == 0 && N%10 != 0) {
                enable_print = 1;
            } else if (enable_print > 1) {
                System.out.print(N%10);
            }
            N = N / 10;
        }
    }

}

package com.codrite;

public class Max {

    public static void main(String[] args){

        int[] A = {6,1,4,6,3,2,7,4};
        int L = 3, M = 2;

//        int[] A = {10, 19, 15};
//        int L = 2, M = 2;

        System.out.println(solution(A, L, M));

    }

    public static int solution(int[] A, int K, int L) {
        if (A==null || A.length < K+L) return -1;
        int[] sum = new int[A.length];

        sum[0]=A[0];
        for(int i=1; i< A.length;i++){
            sum[i] = findMax(A[i],sum[i-1] + A[i]);
        }

        int maxK = sum[K-1];
        int maxL = sum[L-1];
        int maxApples = sum[K+L-1];
        for(int counter=K+L; counter < sum.length; counter++){
            maxK = findMax(maxK, sum[counter-L]-sum[counter-L-K]);
            maxL = findMax(maxL, sum[counter-K]-sum[counter-L-K]);
            maxApples = findMax(maxApples, findMax(maxK + sum[counter] - sum[counter-L],
                    maxL + sum[counter] - sum[counter-K]));
        }
        return maxApples;
    }

    static int findMax(int a, int b){
        return a>b ? a : b;
    }

}
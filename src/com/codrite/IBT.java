package com.codrite;

import java.util.Arrays;

public class IBT {

    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 6, 4, 1, 2};
        a[1] = a[2];
        System.out.println(a);


        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a, 11));

        System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(solution(new int[]{-1,-3}));
        System.out.println(solution(new int[]{1,2, 3}));
    }

    static public int solution(int[] A){
        int diff = 0;
        int smallest = 0;
        Arrays.sort(A);

        if(A[0] < 0)
            return 1;

        for(int i = 0; i < A.length-1; i++){
            diff = abs(A[i+1] - A[i]);
            if(diff > 1) {
                smallest = A[i] + 1;
                break;
            } else {
                smallest = A[i+1];
            }
        }

        if(smallest == 0)
            return 1;

        if(diff == 1)
            smallest = A[A.length-1]+1;

        return smallest;
    }

    static int abs(int a){
        return a < 0 ? a*-1 : a;
    }

}

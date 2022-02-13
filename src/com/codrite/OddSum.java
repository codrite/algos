package com.codrite;

public class OddSum {

    public static void main(String[] args) {
        System.out.println(sumOddLengthSubarrays(new int[]{10, 11, 12}));
        System.out.println(sumOddLengthSubarrays(new int[]{1, 2}));
        System.out.println(sumOddLengthSubarrays(new int[]{1, 4}));
        System.out.println(sumOddLengthSubarrays(new int[]{1, 4, 2}));
        System.out.println(sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3}));
        System.out.println("=========");
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int k = 1; k < arr.length+1; k+=2) {
            for (int i = 0; i+k < arr.length+1; i++) {
                sum += calculate(arr, i,i+k);
            }
        }
        return sum;
    }

    public static int calculate(int[] array, int s, int e) {
        int sum = 0;
        for (int i = s; e < array.length+1 && i < e; i++) {
            sum += array[i];
        }
        return sum;
    }

}

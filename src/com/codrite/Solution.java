package com.codrite;

public class Solution {

    public static void main(String[] args) {

        int[] array1 = {1,2,0,0};
        int[] array2 = {3,4};

        merge(array1, array2);

        for(int a : array1)
            System.out.println(a + ",");

    }

    static void merge(int[] target, int[] source) {

        if(target == null || target.length == 0)
            return;

        if(source == null || source.length == 0)
            return;

        // loop over source and target
        for(int i = 0, j = 0; i < target.length && j < source.length ; ){

            // [1,2,0,0] [3,4]
            if(target[i] < source[j] && target[i] != 0){
                i++;
            } else {
                System.arraycopy(target, i, target, i+1, target.length-i-1);
                target[i] = source[j];
                i++;j++;
            }

        }

    }

}

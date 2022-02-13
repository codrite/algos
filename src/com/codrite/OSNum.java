package com.codrite;


public class OSNum {


    public static void main(String[] args){
        int[] a = {19,11,12,11,23,36,48};
        System.out.println(kMin(a, 5));
    }

    // 9,11,2,1,3,6,8
    static int kMin(int[] arr, int k){

        int min = arr[0];
        int left = 0;
        int right = 0;
        int lm = 0;
        int rm = 0;
        boolean leftMove = false, rightMove = false;
        for(int i = 0; i < k; i++){
            if(right == 0 || leftMove)
                lm = leftMin(arr, left, k);
            if(right == 0 || rightMove)
                rm = rightMin(arr, right, k);
            if(lm < rm){
                min = lm;
                left++;
                rightMove = false;
                leftMove = true;
            } else {
                min = rm;
                right++;
                rightMove = true;
                leftMove = false;
            }
        }
        return min;

    }

    // 9,11,2
    static int leftMin(int[] arr, int s, int k){
        int min = arr[s];
        int idx = s;
        for(int i = s; i < k; i++){
            if(arr[i] < min){
                min = arr[i];
                idx = i;
            }
        }
        int t = arr[idx];
        arr[idx] = arr[s];
        arr[s] = t;

        return min;
    }

    // 1,3,6,8
    static int rightMin(int[] arr, int s, int k){
        int min = arr[s+k];
        int idx = s+k;
        for(int i = s+k; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                idx = i;
            }
        }
        int t = arr[idx];
        arr[idx] = arr[s+k];
        arr[s+k] = t;

        return min;
    }

}

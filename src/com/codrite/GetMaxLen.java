package com.codrite;

public class GetMaxLen {

    public static void main(String[] args) {

        int[] a = {-1,2};
        System.out.println(getMaxLen(a));

    }

    public static int getMaxLen(int[] nums) {

        int len = 0;
        for(int i = 0, j = nums.length ; i < nums.length; i++) {
            int end = isProductPositive(nums, i, j);
            len = Math.max(len, end);
        }

        return len;

    }

    public static int isProductPositive(int[] a, int s, int e) {
        int n = 0, p = 0, ni = 0;
        for(int i = s; i < e; i++) {
            if(a[i] < 0){
                n++;
                ni = i;
            }
            if(a[i] > 0)
                p++;
        }

        if(n%2 == 0)
            return n+p;

        return ni-s;
    }


//    public static int getMaxLen(int[] nums) {
//
//        if(nums.length == 0)
//            return 0;
//
//        if(nums.length == 1 && nums[0] < 0)
//            return 0;
//
//        int len = 0, start = 0;
//        for(int i = 0; i < nums.length; i++){
//            start = i;
//            while(i < nums.length && nums[i] != 0){
//                i++;
//            }
//
//            if(i != start)
//                len = Math.max(len, getMaxLen(nums, start, i));
//        }
//
//        return len;
//
//    }
//
//    public static int getMaxLen(int[] a, int s, int e) {
//        int n = 0, p = 0, ni = 0;
//        for(int i = s; i < e; i++) {
//            if(a[i] == 0)
//                break;
//            if(a[i] < 0){
//                n++;
//                ni = i;
//            }
//            if(a[i] > 0)
//                p++;
//        }
//
//        if(n%2 == 0)
//            return n+p;
//
//        return ni-s;
//    }

}

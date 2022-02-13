package com.codrite;

public class ArrayDup {

    public static void main(String[] args) {
        int[] a = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(a));
    }

    static public int removeDuplicates(int[] nums) {
        int i = 0;
        int len = nums.length;
        while(i+1 < len){
            if(nums[i] == nums[i+1]){
                for(int j = i; j+1 < len; j++)
                    nums[j] = nums[j+1];
                len--;
            } else i++;
        }

        return len;
    }



}

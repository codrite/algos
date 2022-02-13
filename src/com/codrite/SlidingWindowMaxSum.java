package com.codrite;

import java.util.List;

public class SlidingWindowMaxSum {

    public static void main(String[] args) {
        System.out.println("0111".split("0"));
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(a));
    }

    static public int maxSubArray(int[] nums) {

        int maxIndex = findMaxIndex(nums);

        int[] minMax = findOptimalMinMaxIndex(nums, maxIndex);

        int sum = 0;
        for(int i = minMax[0]; i < minMax[1]; i++)
            sum += nums[i];

        return sum;
    }

    // [-2,1,-3,4,-1,2,1,-5,4]
    static int[] findOptimalMinMaxIndex(int[] nums, int index){                // index = 3
        int left = findLeft(nums, index);
        int right = findRight(nums, index);
        return new int[]{left, right};
    }

    static int findRight(int[] nums, int index){
        return common(nums, index+1, nums.length-1);
    }

    static int findLeft(int[] nums, int index){
        return common(nums, 0, index);
    }

    private static int common(int[] nums, int from, int to) {
        int maxIndex = findMaxIndex(nums, from, to);
        int max = nums[to];
        int mark = -1;
        int sum = nums[to];
        while(maxIndex < to){
            sum += nums[maxIndex];
            if(sum > max)
                mark = maxIndex;
            maxIndex++;
        }
        return (mark == -1) ? to : mark;
    }

    static int findMaxIndex(int[] nums, int from, int to){
        int max = nums[from];
        int index = from;
        for(int i = from; i < to; i++){
            if(max < nums[i]) {
                index = i;
                max = nums[i];
            }
        }
        return index;
    }

    static int findMaxIndex(int[] nums){
        int max = nums[0];
        int index = 0;
        for(int i = 1; i < nums.length; i++){
            if(max < nums[i]){
                index = i;
                max = nums[i];
            }
        }
        return index;
    }

}

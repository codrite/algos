package com.codrite;

import java.util.ArrayList;
import java.util.List;

public class DuplicateN {

    public static void main(String[] args) {

    }



    public List<Integer> majorityElement(int[] nums) {

        if(nums == null || nums.length == 0)
            return new ArrayList<>();

        int len = nums.length;
        int times = len/3;

        List<Integer> list = new ArrayList<>();

        int[] temp = new int[20];

        for(int i = 0; i < nums.length; i++){
            int t = 0;
            if(nums[i] < 0){
                t = nums[i]*-1+10;
                temp[t]++;
            } else
                temp[nums[i]]++;
        }

        for(int i = 0; i < temp.length; i++){
            if(temp[i] > times){
                if(i > 9)
                    list.add(i%10*-1);
                else
                    list.add(i);
            }
        }

        return list;
    }


}

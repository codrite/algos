package com.codrite;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MaxDiv {

    public static void main(String[] args) {
        System.out.println(minSubarray(new int[]{3,6,8,1}, 8));
        System.out.println(minSubarray(new int[]{1,2,3}, 6));
        System.out.println(minSubarray(new int[]{1,2,3}, 7));
        System.out.println(minSubarray(new int[]{1000000000,1000000000,1000000000}, 3));
        System.out.println(minSubarray(new int[]{6,3,5,2}, 9));
    }

    public static int minSubarray(int[] nums, int p) {
        long sum = 0;
        Arrays.sort(nums);
        for (long i : nums) {
            sum += i;
        }
        if(sum < p)
            return -1;

        long mod = sum%p;
        if (mod > 0){
            int size = findSmallest(nums, mod).size();
            return size == 0 ? -1 : size;
        }
        return 0;
    }

    public static Set<Integer> findSmallest(int[] nums, long mod) {
        Set<Integer> set = new HashSet<>();
        int index = Arrays.binarySearch(nums, (int)mod);
        if (index > -1)
            return Collections.singleton(1);
        else {
            long search = mod - 1;
            while (search > 0) {
                int idx = Arrays.binarySearch(nums, (int)search);
                if (idx > -1) {
                    set.add(nums[idx]);
                    int key = (int) mod - nums[idx];
                    int ni = Arrays.binarySearch(nums, key);
                    if (ni != idx && ni > -1) {
                        set.add(nums[ni]);
                        break;
                    } else {
                        Set<Integer> smallest = findSmallest(nums, mod - nums[idx]);
                        long p = 0;
                        for(int a : smallest)
                            p += a;
                        if(p < mod)
                            set.remove(nums[idx]);
                        else
                            set.addAll(smallest);
                    }
                }
                search--;
            }
        }
        return set;
    }


}

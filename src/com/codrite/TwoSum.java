package com.codrite;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoSum {

    public static void main(String[] args) {

        System.out.println(build("abcccee"));

        int[] nums = {2,7,11,15};
        System.out.println(findIndex(nums, 0, 7));
        for(int a : twoSum(nums, 9)) {
            System.out.print(a + ",");
        }

    }

    static String build(String input) {
        Set<Character> set = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(Character c : input.toCharArray()) {
            if(!set.contains(c)) {
                stringBuilder.append(c);
                set.add(c);
            }
        }
        return stringBuilder.toString();
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        int firstIndex = 0, secondIndex = 0;
        while(firstIndex < nums.length){
            secondIndex = findIndex(nums, firstIndex, target - nums[firstIndex]);
            if(secondIndex > -1)
                break;
            firstIndex++;
        }

        if(secondIndex != -1){
            result[0] = firstIndex;
            result[1] = secondIndex;
        }

        return result;

    }

    static int findIndex(int[] nums, int skipIndex, int number) {

        int index = 0;
        while(index < nums.length) {
            if(index == skipIndex){
                index++;
                continue;
            }

            if(nums[index] == number)
                return index;

            index++;
        }

        return -1;

    }


}

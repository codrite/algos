package com.codrite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int[] a = {1,-1,2};
        System.out.println(majorityElement(a));
    }

    static public List<Integer> majorityElement(int[] nums) {

        int occ = nums.length / 3;

        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (!map.containsKey(n))
                map.put(n, 1);
            else {
                map.put(n, map.get(n) + 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (Integer key : map.keySet())
            if (map.get(key) > occ)
                list.add(key);

        return list;

    }

}

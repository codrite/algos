package com.codrite;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestSet {

    public static void main(String[] args) {

        Set<Integer> p = new LinkedHashSet<>();
        p.add(3);
        p.add(1);
        p.add(2);

        for (Integer k : p)
            System.out.print(k + ",");

        Set<Integer> set = new HashSet<>();
        set.add(0);
        set.add(3);
        set.add(2);
        set.add(1);

        for (Integer k : set)
            System.out.print(k + ",");



    }




}

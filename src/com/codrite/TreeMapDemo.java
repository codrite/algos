package com.codrite;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        int[] a = { 5, 18, 2, 13, 21, 90 };

        int even = 0, lastIndex = -2;
        for(int i = 0; i+1 < a.length; i+=2){
            int value = Math.max(a[i], a[i+1]);
            int currentIndex = (a[i] == value ? i : i+1);
            if(currentIndex == lastIndex+1){
                even += a[currentIndex+1];
                lastIndex = currentIndex+1;
            } else {
                even += a[currentIndex];
                lastIndex = currentIndex;
            }
        }
        System.out.println(even);

    }



}

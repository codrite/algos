package com.codrite;

import java.util.*;

public class MergeSortedArray {

    public static void main(String[] args){
        test1();
        test2();
        test3();
    }

    private static void test1() {
        int[] a = {1,2,3,0,0,0};
        int[] b = {4,5,6};
        merge(a, 3, b, 3);
        for(int e : a){
            System.out.println(e);
        }
    }

    private static void test2() {
        int[] a = {-1,0,1,0,0};
        int[] b = {-3, -2};
        merge(a, 3, b, 2);
        for(int e : a){
            System.out.println(e);
        }
    }

    private static void test3() {
        int[] a = {1,5,6,0,0,0};
        int[] b = {2,3,4};
        merge(a, 3, b, 3);
        for(int e : a){
            System.out.println(e);
        }
    }

    static public void merge(int[] target, int m, int[] source, int n){
        System.arraycopy(source, 0, target, m, n);
        Arrays.sort(target);
    }

}

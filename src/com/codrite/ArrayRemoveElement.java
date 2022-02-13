package com.codrite;

public class ArrayRemoveElement {

    public static void main(String[] args) {
        char c = 0x90;
        System.out.println((int)c);
        System.out.println(Byte.MIN_VALUE);

//        int[] a = {3, 2, 2, 3};
//        //shiftLeft(a, 0);
//        System.out.println(removeElement(a, 3));
//        print(a);
//        System.out.println(Long.MAX_VALUE);
    }

    static int max(int a, int b){
        return (a>b) ? a : b;
    }

    private static void print(int[] a) {
        for (int e : a)
            System.out.print(e + ",");
    }

    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == val) {
                shiftLeft(nums, i);
                len--;
            }
        }
        return len;
    }

    static public void shiftLeft(int[] a, int i) {
        while (i + 1 < a.length) {
            a[i] = a[i + 1];
            i++;
        }
    }

}

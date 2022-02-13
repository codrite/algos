package com.codrite;

public class MinArray {

    public static void main(String[] args) {
        int[] a = {3,2,11,15,19,17};
        int min = 6;
        int val = a[min-1];
        arrangeArray(a, min);
        assert val == a[min-1];
    }

    private static void arrangeArray(int[] array, int M) {
        for(int i = 0;  i < M; i++){
            int minIndex = findMin(array, i);
            swap(array, minIndex, i);
        }
    }

    private static void swap(int[] array, int source, int target) {
        int temp = array[source];
        array[source] = array[target];
        array[target] = temp;
    }

    private static int findMin(int[] array, int from) {
        int min = array[0];
        int index = from;
        for(int i = from; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

}

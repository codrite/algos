package com.codrite;

public class Main {

    public static void main(String[] args) {
//        System.out.println("my name is arnab".replace(" ", "%20"));
//        System.out.println(solution(new Integer[]{1, 3, -4, 5}));
//        System.out.println(solution(new Integer[]{-1, 3, -4, 5, 1, -6, 2, 1}));
        System.out.println(Math.log10(321));
        int[] array = {1,0,0,4,5,6};// 1,0,0,0,0,4
        shift(array, 0);
        for(int a : array) {
            System.out.print(a + ",");
        }
    }

    static void shift(int[] array, int number) {

        for(int i = 0; i < array.length;) {
            if(array[i] == 0) {
                System.arraycopy(array, i, array, i + 1, array.length - i - 1);
                i += 2;
            } else {
                i++;
            }
        }

    }

    static Integer solution(Integer[] array) {
        if (array.length > 100000)
            throw new IllegalArgumentException("Array ...");

        int count = 0, save = 0;
        while (save < array.length) {
            long sumOfLowerIndices = sum(array, 0, save + 1);
            while (count < array.length) {
                long sumOfHigherIndices = sum(array, count + 1, array.length);
                if (sumOfLowerIndices == sumOfHigherIndices)
                    return count;
                count++;
            }
            save++;
            count = save;
        }

        return -1;
    }

    static long sum(Integer[] array, int start, int end) {
        long sum = 0L;

        if (start == array.length)
            return -1;

        if (start == 0 && end == 0) {
            sum += array[0];
            return sum;
        }

        while (start < end) {
            sum += array[start++];
        }
        return sum;
    }

}

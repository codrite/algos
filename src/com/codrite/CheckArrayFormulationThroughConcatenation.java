package com.codrite;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class CheckArrayFormulationThroughConcatenation {

    public static void main(String[] args) {

        System.out.println(Optional.ofNullable(null).map(b -> (String)b).orElseGet(() -> "input was null"));
        System.out.println(Optional.ofNullable("b").filter(b -> b.startsWith("c")).map(b -> (String)b).orElseGet(() -> "input was null"));

        /*
        [2,82,79,95,28]
        [[2],[82],[28],[79,95]]
         */
//        int[] a = {2,82,79,95,28};
//        int[][] b = {{2},{82},{28},{79,95}};
//        System.out.println(execute(a,b));
    }

    public static boolean execute(int[] array, int[][] pieces) {
        if(pieces.length > 1) {
            Arrays.sort(array);
            Arrays.sort(pieces, Comparator.comparingInt(o -> o[0]));
        }

        int[] tPieces = Stream.of(pieces).flatMapToInt(Arrays::stream).toArray();
        if (array.length > tPieces.length)
            return false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != tPieces[i])
                return false;
        }

        return true;
    }


    // 1,2,3
    // 1,2 - 3,4
    // 0,1 - 2,3
    public boolean check(Integer[] required, Integer[][] array) {
        int i = 0, size = required.length, last = 0;
        while (i < size) {
            for (int j = 0; j < array.length; j++) {
                Integer[] temp = array[j];
                for (int k = 0; k < temp.length && i < size; k++) {
                    if (temp[k].equals(required[i])) {
                        i++;
                    } else {
                        i = last;
                        break;
                    }
                }
            }
            last = i;
        }
        return i == size;
    }

}

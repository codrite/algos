package com.codrite;


public class DistanceToNearestTaxi {

    public static void main(String[] args) {

        int[][] m = {
                {0,1,0},
                {0,0,0},
                {0,0,1}
        };

        int[][] res = calculateDistanceToTaxi(m);
        System.out.println("--- Taxi Location ---");
        print(m);
        System.out.println("--- Distance To Taxi ---");
        resetToZero(res);
        print(res);

    }

    private static void resetToZero(int[][] res) {
        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < res[i].length; j++){
                if(res[i][j] == -1)
                    res[i][j] = 0;
            }
        }
    }

    static int[][] calculateDistanceToTaxi(int[][] m) {
        int[][] t = init(m);
        for(int i =0 ; i < t.length; i++){
            for(int j = 0; j < t[i].length; j++){
                if(m[i][j] == 1){
                    updateDistanceToTaxi(t, i, j);
                }
            }
        }
        return t;
    }

    static void updateDistanceToTaxi(int[][] t, int i, int j) {
        if(i < 0 || j < 0 || i == t.length || j == t[i].length)
            return;

        t[i][j] = -1;
        for(int m = 0; m < t.length; m++){
            for(int n = 0; n < t[m].length; n++){
                int dist = Math.abs(m - i) + Math.abs(n - j);
                if(t[m][n] == 0)
                    t[m][n] = dist;
                else
                    t[m][n] = Math.min(t[m][n], dist);
            }
        }
    }

    static int[][] init(int[][] m){
        int[][] t = new int[m.length][];
        for(int i = 0; i < m.length; i++){
            t[i] = new int[m[i].length];
        }
        return t;
    }

    // to print the matix for debugging
    static void print(int[][] res){
        for (int[] re : res) {
            System.out.print("[ ");
            for (int j = 0; j < re.length; j++) {
                if (j + 1 != re.length)
                    System.out.print(re[j] + ",");
                else
                    System.out.print(re[j] + " ");
            }
            System.out.println("]");
        }
    }

}


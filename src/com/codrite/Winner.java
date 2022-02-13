package com.codrite;



import java.util.*;

public class Winner {

    public static void main(String[] args){
        Collections.addAll(new ArrayList<>(),1,2,3);
        int[] a = {2,1,3,5,4,6,7};
        System.out.println(winner(a, 2));
    }

    static int winner(int[] num, int k){

        int max = Math.max(num[0], num[1]);
        List<Integer> list = new ArrayList<>();
        for(int i : num){
            list.add(i);
        }

        while(true){
            int t = k;
            int i = 0;
            while(t > 0){
                if( max == Math.max(max, list.get(i+1)) ){
                    int v = list.remove(i+1);
                    list.add(v);
                    t--;
                } else {
                    max = list.get(i+1);
                    int v = list.remove(i);
                    list.add(v);
                    break;
                }
            }
            if(t == 0)
                break;
        }

        return max;
    }

}

package com.codrite;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WinnerArray {

    public static void main(String[] args) throws IOException {
        HttpURLConnection http = (HttpURLConnection) new URL("http://google.com").openConnection();
        System.out.println(http.getResponseCode());
        System.out.println(HttpURLConnection.HTTP_NOT_FOUND);
        int[] a = {1,9,8,2,3,7,6,4,5};
        //moveToEnd(a, 0);
        //System.out.println(a[0]);

        System.out.println(winner(a, 7));
    }

    static int winner(int[] arr, int k){


        int value = arr[0];
        int p = k;
        while(p>0){
            if(value == Math.max(arr[0], arr[1])){
                moveToEnd(arr, 1);
                value = arr[0];
                p--;
            } else {
                value = arr[1];
                moveToEnd(arr, 0);
                p = k-1;
            }
        }
        return value;
    }

    static public void moveToEnd(int[] array, int index){
        int temp = array[index];
        for(int i = index; i < array.length-1; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = temp;
    }

}

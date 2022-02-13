package com.codrite;

public class IntegerPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(1000021));

    }

    static public boolean isPalindrome(int x) {

        if(x == 0)
            return true;

        if(x < 0)
            return false;

        if(x > Integer.MAX_VALUE && x < Integer.MIN_VALUE)
            return false;

        boolean isPalindrome = true;

        // loop while end of array
        int[] a = toArray(x);

        int len = a.length;
        for(int i = 0; i < len/2; i++){
            if(a[i] != a[len-1-i]){
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;

    }

    // 1001
    static int[] toArray(int x){
        int len = (int)Math.log10(x)+1;//4
        int[] arr = new int[len];

        while(len > 0){ // 4
            int rem = x%10;
            arr[len-1] = rem;
            x = x/10;
            len--;
        }

        return arr;
    }

}

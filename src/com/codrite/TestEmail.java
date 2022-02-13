package com.codrite;

import java.util.*;

public class TestEmail {

    public static void main(String[] args) {
//        String s = "abc+abc.";
//        s = s.replaceAll("(\\+)(.*?)(\\.)", "");
//        s = s.replaceAll("(\\+)(.*?)(@)", "");
//        System.out.println(s.replaceAll("(\\+)(.*?)(\\.)", ""));
//        System.out.println(s.replaceAll("(\\+)(.*?)(@)", ""));
//        System.out.println(numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.email.leet+alex@code.com"}));
//        System.out.println(Arrays.binarySearch(new int[]{1,2,3},0));
//        System.out.println(median(new int[]{1,2}));
        System.out.println(merge(new int[]{1,2,3}, new int[]{4,5,6}));
        System.out.println(merge(new int[]{7,8,9}, new int[]{4,5,6}));
        System.out.println(merge(new int[]{1,3,5}, new int[]{2,6,7}));
    }

    static List<Integer> merge(int[] a, int[] b){

        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0, k = i + j;
        while(k < a.length + b.length){
            if(a[i] == b[j]){
                list.add(a[i]);
                i++;j++;
            } else if(a[i] > b[j]) {
                list.add(b[j]);
                j++;
            } else {
                list.add(a[i]);
                i++;
            }
            k = i+j;
            if(i == a.length || j == b.length)
                break;
        }

        while(i < a.length){
            list.add(a[i++]);
        }

        while(j < b.length) {
            list.add(b[j++]);
        }

        return list;

    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for(String email : emails){
            String[] parts = email.split("@");
            String emailString = parts[0].replaceAll("\\.", "");
            emailString = emailString.replaceAll("(\\+)(.*?)(\\.)", "");
            emailString = emailString.replaceAll("(\\+)(.*?)(@)", "");
            int index = emailString.indexOf("+");
            if(index > -1)
                emailString = emailString.substring(0, index);
            set.add(emailString + " " +parts[1]);
        }
        System.out.println(set);
        return set.size();
    }

    static double median(int[] array){
        int len = array.length;
        double d = 0;
        if(len%2==0)
            d = (double)array[len/2]+(double)array[len/2-1]/2;
        else
            d = array[len/2];
        return d;
    }

}

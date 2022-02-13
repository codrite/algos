package com.codrite;

import java.util.HashMap;
import java.util.Map;

public class AlienDictionary {

    public static void main(String[] args) {
        String[] words = {"aaaaaaaaaaaaab", "aaaaaaaaaaaaaa", "cat", "tab"};
        Character[] alphabets = {'a', 'b', 'c', 't'};

        AlienDictionary alienDictionary = new AlienDictionary();
        System.out.println(alienDictionary.isSorted(words, alphabets));
    }

    public boolean isSorted(String[] words, Character[] alphabets) {

        Map<Character, Integer> index = buildIndex(alphabets);

        for(int i = 0; i+1 < words.length; i++){
            if(!isGreater(index, words[i], words[i+1]))
                return false;
        }

        return true;
    }

    // cat catt
    public boolean isGreater(Map<Character, Integer> map, String left, String right){

        char[] l = left.toCharArray();
        char[] r = right.toCharArray();

        int i = 0, j = 0;
        while(i < l.length && j < r.length){
            if( map.get(l[i]) < map.get(r[j]) )
                return true;
            else if( map.get(l[i]) > map.get(r[j]) )
                return false;
            else {
                i++;
                j++;
            }
        }

        if(i < l.length)
            return false;

        return j >= r.length;
    }


    public Map<Character, Integer> buildIndex(Character[] array) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < array.length; i++)
            map.put(array[i], i);

        return map;
    }


}

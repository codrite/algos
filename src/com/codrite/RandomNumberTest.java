package com.codrite;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class RandomNumberTest {

    Random random = new Random(5);

    public int next(){
        int i = 0, j = 0;
        while(i == 0) {
            i = random.nextInt(5);
            j += i;
        }
        System.out.println(i);
        return (i+5)%8;
    }

    public static void main(String[] args) {
        RandomNumberTest randomNumberTest = new RandomNumberTest();
        System.out.println(randomNumberTest.next());
        System.out.println(randomNumberTest.next());
        System.out.println(randomNumberTest.next());
        System.out.println(randomNumberTest.next());
        System.out.println(randomNumberTest.next());
        System.out.println(randomNumberTest.next());
        System.out.println(randomNumberTest.next());
        System.out.println(randomNumberTest.next());
        System.out.println(randomNumberTest.next());
        System.out.println(randomNumberTest.next());
        System.out.println(randomNumberTest.next());
        System.out.println(randomNumberTest.next());
    }

}

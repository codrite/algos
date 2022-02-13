package com.codrite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamDemo {

    public static void main(String[] args) throws InterruptedException {
        List<String> names = new ArrayList<>(Arrays.asList("ac", "b", "c", "d", "e", "f", "g", "z", "er", "345", "343", "67", "3435", "44f"));

        names.parallelStream().peek(s -> {System.out.println(s + "- " + Thread.currentThread().getId() + " - " + Thread.currentThread().getName()); }).collect(Collectors.toList());
        Thread.sleep(10000);
        System.out.println("Done");
        names.parallelStream().forEach(s -> {System.out.println(s + "- " + Thread.currentThread().getId() + " - " + Thread.currentThread().getName()); });
    }

}

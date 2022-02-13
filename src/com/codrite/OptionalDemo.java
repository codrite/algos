package com.codrite;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalDemo {

    public static void main(String[] args) {
        System.out.println(combine());
    }

    static List<String> combine() {
        String commaSeparated = "arnab, saurabh";
//        return Optional.ofNullable(commaSeparated)
//                       .map(cs -> Arrays.stream(cs.split(","))
//                                        .map(this::getOptionalListOfString));
        return Arrays.stream(commaSeparated.split(",")).map(OptionalDemo::getOptionalListOfString).flatMap(List::stream).collect(Collectors.toList());
    }

    

    static List<String> getOptionalListOfString(String val) {
        return Collections.singletonList(val);
    }

    static List<String> getListOfString(String val) {
        return Collections.singletonList(val);
    }

}

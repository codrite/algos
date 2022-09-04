package com.codrite;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class CanCollectionToSetBeEmpty {

    public static void main(String[] args) {
        System.out.println((new ArrayList<>().stream().filter(Objects::nonNull).collect(Collectors.toSet())));
    }

}

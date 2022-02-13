package com.codrite;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMax {

    public static void main(String[] args) {

        Map<String, List<String>> ans = Stream.of("res1", "res1", "res1", "res2").collect(Collectors.groupingBy(Function.identity()));
        ans.keySet().stream().map(e -> ans.get(e).size()).max((left, right) -> left < right ? -1 : 1);


    }

}

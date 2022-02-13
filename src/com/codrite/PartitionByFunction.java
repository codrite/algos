package com.codrite;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitionByFunction {

    public static void main(String[] args) {
        LogData[] logData = new LogData[]{
                new LogData(Long.parseLong("100"), "user_1", "resource_1"),
                new LogData(Long.parseLong("200"), "user_1", "resource_1"),
                new LogData(Long.parseLong("201"), "user_1", "resource_1"),
                new LogData(Long.parseLong("201"), "user_1", "resource_1"),
                new LogData(Long.parseLong("201"), "user_1", "resource_3"),
                new LogData(Long.parseLong("201"), "user_1", "resource_3"),
                new LogData(Long.parseLong("201"), "user_1", "resource_3"),
                new LogData(Long.parseLong("201"), "user_1", "resource_3"),
                new LogData(Long.parseLong("203"), "user_1", "resource_1"),
                new LogData(Long.parseLong("199"), "user_1", "resource_2"),
                new LogData(Long.parseLong("100"), "user_1", "resource_2"),
                new LogData(Long.parseLong("1000"), "user_1", "resource_1")
        };

        Map<String, List<LogData>> set = Stream.of(logData).filter(new SimplePredicate(0, 300)).collect(Collectors.groupingBy(LogData::resource));
        List<List<LogData>> ld = set.values().stream().sorted((o1, o2) -> o1.size() > o2.size() ? -1 : 1).collect(Collectors.toList());
        System.out.println(ld.get(0).get(0).resource());
        Arrays.sort(logData, (o1, o2) -> o1.time < o2.time ? -1 : 1);
    }

    static class SimplePredicate implements Predicate<LogData> {

        long start;
        long end;

        public SimplePredicate(long start, long end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public boolean test(LogData logData) {
            return logData.time >= start && logData.time < end;
        }

    }

}

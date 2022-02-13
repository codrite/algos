package com.codrite;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapTest {

    public MapTest() {
    }

    public static void main(String[] args) {
        Map<String, Set<String>> m1 = new HashMap<>();
        m1.put("A", Stream.of("Tiger", "Leopard").collect(Collectors.toSet()));
        m1.put("B", Stream.of("Lion", "Leopard").collect(Collectors.toSet()));

        BiConsumer<HashMap<Animal, Set<String>>, ? super Map.Entry<String, Set<String>>> accumulator =
                (BiConsumer<HashMap<Animal, Set<String>>, Map.Entry<String, Set<String>>>)
                        (animalSetHashMap, stringSetEntry) -> stringSetEntry.getValue().stream().map(Animal::new).peek(a -> {
            if(animalSetHashMap.containsKey(a)){
                animalSetHashMap.get(a).add(stringSetEntry.getKey());
            } else {
                animalSetHashMap.put(a, new HashSet<>(Collections.singleton(stringSetEntry.getKey())));
            }
        }).collect(Collectors.toSet());

        System.out.println(m1.entrySet().stream().collect(HashMap::new, accumulator, HashMap::putAll));
    }

    static class Animal {
        String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Animal animal = (Animal) o;
            return Objects.equals(name, animal.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

}

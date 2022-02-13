package com.codrite;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorTest {

    public static void main(String[] args) {
        Set<Input> inputs = Stream.of(new Input("Zebra", "M"), new Input("Zebra", "Y"), new Input("Elephant", "T")).collect(Collectors.toSet());
        Set<Animal> result = inputs.stream()
                                   .map(input -> new Animal(input.name, input.type))
                                   .collect(HashSet::new,
                                           (left, right) -> {
                                                        if (left.contains(right))
                                                            left.stream().reduce((l, r) -> l.add(r.tags)); else left.add(right);
                                                    },
                                            HashSet::addAll);





//                collect(HashSet::new,
//                (left, right) -> {
//                    if (left.contains(right))
//                        left.stream().reduce((l, r) -> l.add(r.tags)); else left.add(right);
//                } ,
//                HashSet::addAll);
        System.out.println(result);
    }

}

class Animal {

    String name;
    Set<String> tags;

    public Animal(String name, String tag) {
        this.name = name;
        this.tags = new HashSet<>(Collections.singletonList(tag));
    }

    Animal add(Set<String> tags) {
        this.tags.addAll(tags);
        return this;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", tags=" + tags +
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

class Input {

    String name;
    String type;

    public Input(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

}

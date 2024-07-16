package org.example.Lesson71_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String... args) {
        List<Integer> list = new ArrayList<>();
        // Add new element into List
        list.add(10);
        list.add(200);
        list.add(30);
        list.add(50);

        testMap(list);
        testFilter(list);
        testReduce(list);

        // List<Integer> $list = list.stream().sorted().filter(i -> i > 30).map(i -> i * 2).collect(Collectors.toList()); // chaining
//        List<Integer> greaterThan30 = list.stream().filter(i -> i > 30).map(i -> i * i).toList();
//        $list.stream().forEach(integer -> System.out.println(integer));
//        List<Integer> half = list.stream().map(i -> i / 2).toList();


    }

    private static void testReduce(List<Integer> list) {

        int total = list.stream().reduce((i1, i2) -> i1 + i2).get();
    }

    private static void testFilter(List<Integer> list) {
        List<Integer> $list = list.stream().filter(i -> i > 50).toList();
    }

    private static void testMap(List<Integer> list) {
        List<Integer> $list = list.stream().map(i -> i * 2).toList();
    }

    // varargs
    public static void print(int... ints) {
        for (int i : ints) {
            System.out.println(i);
        }
    }

}

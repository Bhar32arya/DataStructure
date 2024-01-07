package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface Test {
    void add();
}
public class Java8Features {
    public static void main(String[] args) {
        //stateful
        Stream.iterate(15, n -> n * 2)
                .limit(5)
                .forEach(System.out :: print);

        //stateless
        Stream.generate(() -> new Random().nextInt(100))
                .limit(10)
                .forEach(System.out :: print);

        System.out.println("******************");
        Stream.generate(() -> new Random().nextInt(1000))
                .takeWhile(n -> n <= 500)
                .forEach(System.out :: print);

        Map<Boolean, List<Integer>> partitionMap = Stream.of(1,23,4,6,79,80)
                .collect(Collectors.partitioningBy(m -> m % 2 == 0));

        partitionMap.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
        partitionMap.entrySet()
                .stream()
                .forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));

        String input = "check frequency";
        Map<Character, Long> charMap = input.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charMap.forEach((k, v) -> System.out.println(k + " = " + v));

        int []arr = new int[]{5};
        System.out.println(Arrays.binarySearch(arr, 0));
    }
}

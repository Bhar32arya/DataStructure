package org.example;

import java.util.*;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaEight {
    public static void main(String[] args) {
        //a. even number
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        list.stream().
                filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("*********");
        //a. start with 1

        list.stream().
                map(num -> num + "" ).
                filter(s -> s.startsWith("1")).
                collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("*********");
//c. find duplicate number
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        HashSet<Integer> set = new HashSet<>();
        myList.stream().filter(num -> !set.add(num)).collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("*********");
        //D. find first element of stream

        myList.stream().findAny().ifPresent(System.out::println);

        System.out.println("*********");
        //E. find total number of element in stream

        long n = list.stream().count();
        System.out.println(n);

        System.out.println("*********");
        //F. find max number of element in stream
        myList.stream().max(Comparable::compareTo).ifPresent(System.out::println);
        System.out.println("*********");
        //G. sort number of element in stream
        myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

        System.out.println("*********");
        //H. word count of element in stream

        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String, Long> namesCount = names
                .stream()
                .collect(Collectors.groupingBy(
                                Function.identity()
                                , Collectors.counting()
                        ));
        System.out.println(namesCount);

        Map<String, Long> map = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        Optional<String> opt = Optional.of("bhar32");
        opt.ifPresent(System.out::print);
        if(opt.isPresent() && opt.get().contains("q")) {

        }


        int arr[] = {1,2,3,4,5,5};
        Arrays.stream(arr)
                        .distinct()
                                .forEach(System.out::println);
        Map<Boolean, List<Integer>> listMap = Stream.of(1,23,4,5,56)
                        .collect(Collectors.partitioningBy(m -> m % 2 == 0));

        System.out.println(listMap);
        opt.filter(s -> !s.isEmpty()).
                map(s -> s.charAt(0)).
                orElseThrow(IllegalArgumentException::new);

        Arrays.asList("AA", "BB", "AA", "CC").stream().forEach(e -> System.out.print(e + ","));
        Stream.of("one", "two", "three", "four").map(String :: toUpperCase).forEach(e -> System.out.println(e + ","));
        Stream.of(list, myList).flatMap(lists -> lists.stream()).collect(Collectors.toList()).forEach(e -> System.out.print(e + ","));
        Map<String, Long> mapHai = Stream.of("one", "two", "three", "four").collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        mapHai.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));

        String str = "my name is bhar32";

        str = Stream.of(str).collect(Collectors.joining("", "", ""));
        System.out.println(str);

    }
}

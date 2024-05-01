package org.example;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ReverseString {
    public static void main(String[] args) {
        String str = "bhartendu Arya";
        int len = str.length();
        IntStream.range(0, len)
                .map(i -> len - 1 - i)
                .mapToObj(j -> str.charAt(j))
                .forEach(System.out::print);

        int l = str.length();
        IntStream.range(0, l)
                .map(i -> l - 1 -i)
                .mapToObj(j -> str.charAt(j))
                .map(Object::toString)
                .collect(Collectors.joining());

        String str3 = "Aniruddh";

        Stream.iterate(str3.length()-1, n-> n >= 0, n-> n-1)
                .map(str3::charAt)
                .forEach(System.out::print);

        String s = Stream.iterate(str3.length() -1, n -> n >= 0, n -> n -1)
                .map(str3::charAt)
                .map(Object::toString)
                .collect(Collectors.joining());
        System.out.println("*************" + s);

        String input = "hello world";

        String res = "";
        res = input.chars()
                .mapToObj(c -> (char) c)
                .map(Object::toString)
                .collect(joining());
        System.out.println(res);

        Stream.iterate(input.length() - 1, n -> n >= 0, n -> n - 1)
                .map(input :: charAt)
                .map(Object :: toString)
                .collect(joining());

        Stream.iterate(14, n -> n + 2)
                .limit(10)
                .forEach(System.out :: print);

    }
}

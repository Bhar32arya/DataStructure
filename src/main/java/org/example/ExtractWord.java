package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ExtractWord {
    public static void main(String[] args) {
        String str = "a 123 good125   example";
        String collected = Arrays.stream(str.split("\\s"))
                .filter(word -> word.matches("^[a-z]+"))
                .collect(Collectors.joining(" "));
        System.out.println(collected);
    }
}

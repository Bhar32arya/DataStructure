package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ExtractWord {
    public static void main(String[] args) {
        String str = "a 123 good125   example";
        String collected = Arrays.stream(str.split("\\s"))
                .filter(word -> word.matches("^[a-z]+"))
                .collect(Collectors.joining(" "));
        System.out.println(collected);
    }

    public static String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        List<String> list = Arrays.asList(arr);
        Collections.reverse(list);
        return String.join(" ", list);
    }
}

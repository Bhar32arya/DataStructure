package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class SecoendLargestElement {
    public static void main(String[] args) {
        int arr[] = new int[]{50,23,7,12,8};

        int result = Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted((a, b) -> b - a)
                //.sorted(Comparator.reverseOrder())
                //.sorted(Comparator.naturalOrder())
                .limit(2)
                .skip(1)
                .findFirst()
                .get();
        System.out.println(result);
    }
}

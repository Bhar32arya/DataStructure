package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestElement {
    public static void main(String[] args) {
        int arr [] = new int[]{500,1,234,45,5,50, 60, 7};
        int asInt = Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .findFirst()
                .get();

        System.out.println(asInt);

        System.out.println(Arrays.toString(arr));

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}

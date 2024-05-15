package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = new int[]{3,0,1};
        //System.out.println(missingNumber(arr));
        System.out.println(majorityElement(new int[]{3,3,4}));
    }

    public static int missingNumber(int[] arr) {
        int sum=0;
        int max=(arr.length*(arr.length+1))/2;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return max-sum;
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Long> map2 = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        LinkedHashMap<Integer, Long> collect = map2.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        collect.forEach((k, v) -> System.out.println(k + " " +v));
        return collect.keySet().iterator().next();
    }
}

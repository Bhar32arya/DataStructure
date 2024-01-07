package org.example;
import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int []nums = new int[]{2,7,11,15};
        int target = 9;
        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if(!map.containsKey(compliment)) {
                map.put(nums[i], i);
            } else {
                return new int[]{map.get(compliment), i};
            }
        }
        throw new IllegalArgumentException("No target found");
    }
}

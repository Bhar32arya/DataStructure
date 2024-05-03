package org.example;

import java.util.HashMap;

public class LongestSubArrayWithSumK {

    public static int longestSubArrayWithSumK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum == k) {
                maxLength = i + 1;
            }
            else {
                if (map.containsKey(sum - k)) {
                    maxLength = Math.max(maxLength, i - map.get(sum - k));
                }
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println("Length of the longest subarray with sum " + k + " is: " + longestSubArrayWithSumK(nums, k));
    }
}


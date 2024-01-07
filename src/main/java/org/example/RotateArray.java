package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        for(int i : nums) {
            System.out.println(i);
        }
    }
    public static void reverse(int []nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

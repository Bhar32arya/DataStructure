package org.example;

public class StoreNumberInArrayIndex {
    public static void main(String[] args) {
        // Initializing an array
        System.out.println(firstMissingPositive(new int[]{3,4,-1,1}));
    }

    public static int firstMissingPositive(int[] nums) {
        int arr[] = new int [nums.length];

        for(int i = 0; i<nums.length; i++) {
            if(nums[i] > 0 && nums[i] < nums.length) {
                arr[nums[i]] = nums[i];
            }
        }
        for(int i = 1; i<arr.length; i++) {
            if(i != arr[i]) {
                return i;
            }
        }
        return -1;
    }
}

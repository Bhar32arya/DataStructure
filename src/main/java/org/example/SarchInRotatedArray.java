package org.example;

import java.util.Arrays;

public class SarchInRotatedArray {
    public static void main(String[] args) {
        SarchInRotatedArray sarchInRotatedArray = new SarchInRotatedArray();
        System.out.println(sarchInRotatedArray.search(new int[]{4,5,6,7,0,1,2}, 7));
    }
        public int search(int[] nums, int target) {
            int res = 0;
            if(nums.length == 0) {
                return -1;
            } else {
                int start = 0;
                int end = nums.length - 1;
                int mid = start + (end - start)/2;

               int a = binarySearch(nums, target, start, mid);
               int b = binarySearch(nums, target, mid + 1, end);
               res = a > b ? a : b;
            }
            return res;
        }

    private int binarySearch(int[] nums, int target, int start, int end) {
        int mid = start + (end - start)/2;
        if(nums[mid] == target) {
            return mid;
        }
        if(target < nums[mid]) {
            end = mid;
            binarySearch(nums, target, start, end);
        } else {
            start = mid + 1;
            binarySearch(nums, target, start, end);
        }
        return -1;
    }
}

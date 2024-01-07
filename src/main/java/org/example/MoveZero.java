package org.example;

public class MoveZero {
    public static void main(String[] args) {
        int nums[]  = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        for(int i : nums) {
            System.out.print(i + " ,");
        }
    }
        public static void moveZeroes(int[] nums) {
            int a = 0;
            int b = 1;
            while(b < nums.length) {
                if(nums[a] == 0 && nums[b] != 0) {
                    swap(nums, a, b);
                    a = a + 1;
                    b = b + 1;
                }
                if(b < nums.length && nums[a] == 0 && nums[b] == 0) {
                    b = b + 1;
                }
            }
        }
        public static void swap(int[] nums, int start, int end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
}

package org.example;

import java.util.Arrays;

public class MoveZeroWithOrder {
    public static void main(String[] args) {
        int arr[] = new int[]{0, 2, 0, 0, 3, 14};

        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = 1;

        while(right < arr.length) {
            if(arr[left] == 0 && arr[right] != 0) {
                swap(arr, left, right);
                left++;
                right++;
            }
            if(right < arr.length && arr[right] == 0) {
                right++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
}

package org.example;

public class MoveZeroWithOrder {
    public static void main(String[] args) {
        int arr[] = new int[]{0,2,0,0,3,14};

        int start = 0;
        int end = 0;
        while (end < arr.length) {
            if(arr[end] == 0) {
                end++;
            } else {
                swap(arr, start ,end);
                start++;
                end++;
            }
        }
        for(int i : arr) {
            System.out.print(i);
        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

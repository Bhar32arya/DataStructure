package org.example;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr = {1,2,34,50,64,77,88};
        System.out.println(binarySearch(arr, 0, arr.length, 77));
    }
    public static int binarySearch(int []arr, int start, int end, int targt) {
        int mid = start + (end - start)/2;
        if(arr[mid] == targt) {
            return arr[mid];
        }
        if(targt < arr[mid]) {
            end = mid;
            return binarySearch(arr, start, end, targt);
        }
        if(targt > arr[mid]) {
            start = mid;
            return binarySearch(arr, start, end, targt);
        }
        return -1;
    }
}

package org.example.arrays.binarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr =  {-18, -12, -4, 0, 2,3 ,4 ,5,8,9,12,14,17,19,22,24,28,31,35,89,99,102};
        int target = 22;
        int result = binarySearch(arr, target);
        System.out.println(result);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + ((end-start)/2);
            if(target < arr[mid]) {
                end = mid -1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

package org.example.arrays.binarySearch.recurssion;

public class BsWithRecursion {
    public static void main(String[] args) {
        int[] arr =  {-18, -12, -4, 0, 2,3 ,4 ,5,8,9,12,14,17,19,22,24,28,31,35,89,99,102};
        int target = 22;
        int result = binarySearch(arr, 0, arr.length-1, target);
        System.out.println(result);
    }

    public static int binarySearch(int[] arr,int start, int end, int target) {
        if(start > end) {
            return -1;
        }
        int mid = start + ((end-start)/2);
        if(arr[mid] == target)
            return mid;
        if(target < arr[mid])
            return binarySearch(arr, start, mid-1, target);
        else
            return binarySearch(arr, mid+1, end, target);
    }
}

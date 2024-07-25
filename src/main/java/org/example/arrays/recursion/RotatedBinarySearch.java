package org.example.arrays.recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2,3};
        int target = 7;
        System.out.println(rotatedSearch(arr, target));
    }

    private static int rotatedSearch(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length-1);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        if(start >end)
            return -1;
        int mid = start + (end-start)/2;
        if(arr[mid] > arr[end] && arr[mid] > arr[mid+1]) {
            return mid;
        }
        if(arr[mid] > arr[end] && arr[mid-1] > arr[mid]) {
            return mid-1;
        }
        if(start == end){
            return start;
        }
        if(arr[mid] <= arr[start]) {
            end = mid -1;
        } else {
            start = mid+1;
        }
        return binarySearch(arr, target, start, end);
    }
}

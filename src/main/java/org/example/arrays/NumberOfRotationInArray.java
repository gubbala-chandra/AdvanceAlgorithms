package org.example.arrays;

public class NumberOfRotationInArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int pivot = findPivot(arr);
        System.out.println(pivot+1);
    }

    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(start == end) {
                return mid;
            }
            if(arr[mid]> arr[end] && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if(arr[mid] > arr[end] && arr[mid-1] > arr[mid]) {
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            } else {
                start = mid +1;
            }
        }
        return -1;
    }
}

package org.example.arrays;

import java.util.Arrays;
import java.util.List;

public class findInMountainArray {

    public static void main(String[] args) {
     List<Integer> arrayList  = Arrays.asList(1,2,3,4,5,3,1);
     int target = 2;
     int peakIndex = getPeakIndex(arrayList);
        System.out.println(arrayList.get(peakIndex));
        int result = binarySearch(arrayList, target, 0, peakIndex);
        if(result == -1)
            result = binarySearch(arrayList, target, peakIndex+1, arrayList.size()-1);
       System.out.println(result);
    }

    public static int getPeakIndex(List<Integer> arr) {
        int start = 0;
        int end = arr.size() -1;
        while(start < end) {
            int mid = start + (end-start)/2;
            if(arr.get(mid) < arr.get(mid +1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public static int binarySearch(List<Integer> arr, int target, int start, int end) {

        while(start <= end) {
            int mid = start + (end-start)/2;
            if(target < arr.get(mid)) {
                end = mid -1;
            } else if(target > arr.get(mid)) {
                start = mid +1;
            } else {
                return mid;
            }
        }
        return -1;
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

package org.example.arrays.binarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr =  {-18, -12, -4, 0, 2,3 ,4 ,5,8,9,12,14,17,19,22,24,28,31,35,89,99,102};
        int[] arr1 = {102,99,89,35,31,28,26,22,18,15,12,11,9,8,5,3,0,-1,-5,-11,-20,-28};
        int target = 22;
        int result = orderAgnosticBinarySearch
                (arr, target);
        System.out.println(result);
        System.out.println(orderAgnosticBinarySearch(arr1, target));
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean asc = arr[start] <= arr[end];
        while(start <= end) {
            int mid = start + ((end-start)/2);
            if(arr[mid] == target) {
                return mid;
            }
            if (!asc) {
               if(arr[mid] > target) {
                   start = mid + 1;
               } else if(arr[mid] < target) {
                   end = mid -1;
               }
           } else {
               if (arr[mid] < target) {
                   start = mid + 1;
               } else if (arr[mid] > target) {
                   end = mid - 1;
               }
           }
        }
        return -1;
    }
}

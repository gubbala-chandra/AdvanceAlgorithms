package org.example.arrays;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,9,10,12,14,15,16,20,30,33,34,35,36,37,38,41,44,46};
        int target = 15;
        int start = 0;
        int end = 1;
        int value = -1;
        while(target > arr[end]) {
                int temp = end +1;
                end = end + (end - start +1) * 2;
                start = temp;
        }
        value = binarySearch(arr, target, start, end);
        System.out.println(value);
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

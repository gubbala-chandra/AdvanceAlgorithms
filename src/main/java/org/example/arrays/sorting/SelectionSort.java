package org.example.arrays.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for(int i = 0; i< arr.length; i++){
            // find the max item and swap it with correct index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

    public static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = start; i<=end; i++){
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}

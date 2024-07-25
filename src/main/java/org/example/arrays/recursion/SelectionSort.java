package org.example.arrays.recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {4,3,2,8,1};
        selectionSort(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr, int r, int c, int max) {
        if(r == 0){
            return;
        }
        if(c < r) {
            if(arr[max] < arr[c+1]){
               max = c+1;
            }
            selectionSort(arr, r, c+1, max);
        } else {
            if(max != r)
                swap(arr, max, r);
            selectionSort(arr, r-1, 0, 0);
        }

    }

    private static void swap(int[] arr, int cursor, int i) {
        int temp = arr[cursor];
        arr[cursor] = arr[i];
        arr[i] = temp;
    }
}

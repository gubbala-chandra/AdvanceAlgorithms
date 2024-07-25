package org.example.arrays.recursion;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {12,10,7,9,3,4,2,1};
        bubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        helper(arr, 1, 0);
    }

    private static void helper(int[] arr, int i, int cursor) {
        if(cursor== arr.length-1){
            return;
        }
        if(i == arr.length) {
            helper(arr, cursor+2, cursor + 1);
            return;
        }
        if(arr[cursor] > arr[i]) {
            swap(arr, cursor, i);
        }
        helper(arr, i+1, cursor);
    }

    private static void swap(int[] arr, int cursor, int i) {
        int temp = arr[cursor];
        arr[cursor] = arr[i];
        arr[i] = temp;
    }

    public static void bubbleSort(int[] arr, int r, int c) {
        if(r == 0) {
            return;
        }
        if(c < r) {
            if(arr[c] > arr[c+1]) {
                swap(arr, c, c+1);
            }
            bubbleSort(arr, r, c+1);
        }
        bubbleSort(arr, r-1, 0);
    }
}

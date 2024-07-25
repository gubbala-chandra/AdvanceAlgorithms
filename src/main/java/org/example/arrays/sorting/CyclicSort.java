package org.example.arrays.sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclicSortBest(arr);
    }

    public static void cyclicSort(int[] arr) {
        int i=0;
        for(int j=1; j<arr.length; j++) {
            while(arr[i] != j) {
                swap(arr, arr[i], i);
                System.out.println("Sorting after each Swap:::%s"+ Arrays.toString(arr));
            }
            i++;
        }
    }

    public static void cyclicSortBest(int[] arr) {
        int i=0;
        while(i< arr.length) {
            if(arr[i] != i+1) {
                swap(arr, arr[i], i);
                System.out.println("Sorting after each Swap:::%s"+ Arrays.toString(arr));
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int element, int index) {
        int temp = arr[index];
        arr[index] = arr[element-1];
        arr[element-1] = temp;
    }
}

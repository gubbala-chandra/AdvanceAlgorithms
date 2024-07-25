package org.example.arrays.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        insertionSort(arr);

    }

    public static void insertionSort(int[] arr) {
        for(int i=0; i<= arr.length-2; i++) {
            for(int j=i+1; j>0; j--) {
                if(arr[j] > arr[j-1]) {
                    break;
                } else {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            System.out.println("Array after pass:"+i+", :::"+ Arrays.toString(arr));
        }
    }
}

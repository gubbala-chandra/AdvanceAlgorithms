package org.example.arrays.sorting;

public class CountSort {
    public void countSort(int[] arr) {
        if(arr == null || arr.length <=1) {
            return;
        }
        int largest = arr[0];
        for(int i=1;i<arr.length;i++) {
            largest = Math.max(arr[i], largest);
        }
        int[] countArr = new int[largest+1];
        for(int num : arr) {
            countArr[num]++;
        }

    }
}

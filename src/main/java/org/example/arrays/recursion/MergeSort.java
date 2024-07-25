package org.example.arrays.recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {8,3,4,12,5,6};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] mergeSort(int arr[]) {
        if(arr.length == 1)
            return arr;
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] arr = new int[left.length + right.length];
        int i=0,j=0,k=0;
        while(i< left.length && j < right.length) {
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while(i< left.length) {
            arr[k++] = left[i++];
        }
        while(j < right.length) {
            arr[k++] = right[j++];
        }
        return arr;
    }

    private static void mergeSortInPlace(int[] arr, int start, int end) {
        if(end - start == 1)
            return;
        int mid = start + (end-start)/2;
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);
        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] newArr = new int[end - start];
        int i = start, j= mid, k=0;
        while(i < mid && j< end) {
            if(arr[i] < arr[j]) {
                newArr[k++] = arr[i++];
            } else {
                newArr[k++] = arr[j++];
            }
        }
        while(i< mid) {
            newArr[k++] = arr[i++];
        }
        while(j< end) {
            newArr[k++] = arr[j++];
        }

        for(int l=0; l < newArr.length; l++) {
            arr[start+l] = newArr[l];
        }
    }

}

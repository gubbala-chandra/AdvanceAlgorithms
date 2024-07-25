package org.example.arrays.recursion;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9,12,11};
        System.out.println(checkIfSorted(arr, 0));
    }

    private static boolean checkIfSorted(int[] arr, int i) {
        if(i == arr.length-1) {
            return true;
        }
        return arr[i] > arr[i+1] && checkIfSorted(arr, i+1);
    }
}

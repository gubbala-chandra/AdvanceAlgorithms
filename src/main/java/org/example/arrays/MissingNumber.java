package org.example.arrays;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {0,2,3};
        System.out.println(missingNumber(arr));

    }

    public static int missingNumber(int[] nums) {
        int i=0;
        while(i< nums.length) {
            if(nums[i]< nums.length &&  nums[i] != i) {
                swap(nums, nums[i], i);
                System.out.println("Sorting after each Swap:::%s"+ Arrays.toString(nums));
                continue;
            }
            if(nums[i] == i+1 ) {
                return i;
            }
            i++;
        }
        return -1;
    }
    public static void swap(int[] arr, int element, int index) {
        int temp = arr[index];
        arr[index] = arr[element];
        arr[element] = temp;
    }
}

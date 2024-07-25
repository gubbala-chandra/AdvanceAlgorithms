package org.example.arrays;

import java.util.Arrays;
//https://leetcode.com/problems/first-missing-positive/description/
public class MissingPositiveNumber {

    public static void main(String[] args) {
        int arr[] = {7,8,9,11,12};
        System.out.println(missingNumber(arr));

    }

    public static int missingNumber(int[] nums) {
        int i=0;
        while(i< nums.length) {
            int correct = nums[i] -1;
            if(nums[i] > 0 &&  nums[i]< nums.length &&  nums[i] != nums[correct]) {
                swap(nums, i, correct);
                System.out.println("Sorting after each Swap:::%s"+ Arrays.toString(nums));
            } else {
                i++;
            }
        }
        for(i=0; i<nums.length; i++) {
            if(nums[i] != i+1)
                return i+1;
        }
        return nums.length+1;
    }
    public static void swap(int[] arr, int element, int index) {
        int temp = arr[index];
        arr[index] = arr[element];
        arr[element] = temp;
    }
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i< nums.length) {
            int correct = nums[i] -1;
            if(nums[i] >= 1 &&  nums[i]< nums.length &&  nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for(i=0; i<nums.length; i++) {
            if(nums[i] != i+1)
                return i+1;
        }
        return  nums[nums.length-1] == nums.length  ? nums.length+1 : nums.length;
    }

}

package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findAllDuplicates(nums));
    }
    public static int findDuplicate(int[] nums) {
        int i =0;
        while(i < nums.length) {
            if(nums[i] != i+1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else
                    return nums[i];
            }else {
                i++;
            }
        }
        return -1;
    }
    public static void swap(int[] arr, int element, int index) {
        int temp = arr[index];
        arr[index] = arr[element];
        arr[element] = temp;
    }

    public static List<Integer> findAllDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int i =0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for(i=0;i<nums.length;i++) {
            if(nums[i] != i+1)
                result.add(nums[i]);
        }
        return result;
    }
}

package org.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicSortBest(nums);
        List<Integer> result = new ArrayList<>();
        for(int i=0; i< nums.length; i++) {
            if(nums[i] != i+1)
                result.add(i);
        }
        return result;

    }

    public static void cyclicSortBest(int[] arr) {
        int i=0;
        while(i< arr.length) {
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);
                System.out.println("Sorting after each Swap:::%s"+ Arrays.toString(arr));
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int element, int index) {
        int temp = arr[index];
        arr[index] = arr[element];
        arr[element] = temp;
    }
}

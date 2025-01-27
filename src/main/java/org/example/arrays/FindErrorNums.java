package org.example.arrays;

public class FindErrorNums {
    public static void main(String[] args) {

    }

    public static int[] findErrorNums(int[] nums) {
        int i =0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for(i=0; i<nums.length; i++) {
            if(nums[i] != i+1) {
                return new int[]{nums[i], i+1};
            }
        }

        return new int[]{-1,-1};
    }

    public static void swap(int[] arr, int element, int index) {
        int temp = arr[index];
        arr[index] = arr[element];
        arr[element] = temp;
    }

}

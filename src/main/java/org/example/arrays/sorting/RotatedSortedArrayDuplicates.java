package org.example.arrays.sorting;

public class RotatedSortedArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = {5,1,3};
        int target = 3;
        System.out.println(search(arr, target));
    }
    public static int search(int[] nums, int target) {
        int peakIndex = getPeakIndex(nums);
        if(peakIndex == -1){
            return getElementIndex(nums, target, 0, nums.length-1, true);
        }
        if(nums[peakIndex] == target)
            return target;
        int result = getElementIndex(nums, target, 0, peakIndex, true);
        if(result == -1)
            result = getElementIndex(nums, target, peakIndex+1, nums.length-1, true);
        return result;
    }
    public static int getPeakIndex(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(mid< end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return  mid-1;
            }
            if(nums[mid] <= nums[start]){
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static int getPeakIndexWithDuplicates(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(mid< end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return  mid-1;
            }
            if(nums[mid] <= nums[start]){
                end = mid-1;
            } else {
                start = mid + 1;
            }
            if(nums[mid] == nums[start] && nums[start] == nums[end]) {
                if(nums[start] > nums[start +1]){
                    return start;
                }
                start++;
                if(nums[end] < nums[end-1]){
                    return end-1;
                }
                end--;
            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid+1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }
    public static  int getElementIndex(int[] nums, int target, int start, int end, boolean asc) {
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target) {
                return mid;
            }
            if(asc) {
                if(nums[mid] > target) {
                    end = mid -1;
                } else {
                    start = mid +1;
                }
            } else {
                if(nums[mid] > target) {
                    start = mid +1;
                } else {
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}

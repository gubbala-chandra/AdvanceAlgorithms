package org.example.arrays.binarySearch;

public class SearchElements {

    public int[] searchRange(int[] nums, int target) {
        return new int[]{seachElement(nums, target, true), seachElement(nums, target, false)};

    }
    public int seachElement(int[] nums, int target, boolean first) {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(target < nums[mid]) {
                end = mid -1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(first) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

package org.example.strings.subsets;

import org.example.arrays.binarySearch.BS_2D_SortedArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(subSetDuplicate(arr));
    }

    // Time Complexity O(N * 2^N) space complexity: O(2^N * 2);
    /*
        ** when you find a duplicate element, only add it to newly created subsets of previous steps
        ** because of above points duplicate has to be together, if not sort the array before operation.
     */
    private static List<List<Integer>> subSet(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : arr) {
            int size = outer.size();
            for(int i=0; i<size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    private static List<List<Integer>> subSetDuplicate(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start =0, end =0;
        for(int i=0; i< arr.length; i++) {
            start = 0;
            if(i>0 && arr[i] == arr[i-1]) {
                start = end+1;
            }
            end = arr.length-1;
            int size = outer.size();
            for(int j=start; j<size; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}

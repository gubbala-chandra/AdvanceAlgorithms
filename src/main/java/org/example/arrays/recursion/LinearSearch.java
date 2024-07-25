package org.example.arrays.recursion;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,18,18,9};
        int target = 18;
        List<Integer> list = new ArrayList<>();
        System.out.println(linearSearchForAllOccurences(arr, target, arr.length-1));
    }

    private static int linearSearch(int[] arr, int target, int i) {
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i] == target)
            return i;
        return linearSearch(arr,target,i+1);
    }

    private static boolean find(int[] arr, int target, int i) {
        if(i == arr.length-1){
            return false;
        }
        return arr[i] == target || find(arr,target,i+1);
    }
    private static int linearSearchFromLast(int[] arr, int target, int i) {
        if(i == -1){
            return -1;
        }
        if(arr[i] == target)
            return i;
        return linearSearchFromLast(arr,target,i-1);
    }

    private static List<Integer> linearSearchForAllOccurences(int[] arr, int target, int i, List<Integer> list) {
        if(i == -1){
            return list;
        }
        if(arr[i] == target)
            list.add(i);
        return linearSearchForAllOccurences(arr,target,i-1, list);
    }


    // not a good approach
    private static List<Integer> linearSearchForAllOccurences(int[] arr, int target, int i) {
        List<Integer> list = new ArrayList<>();
        if(i == -1){
            return list;
        }
        if(arr[i] == target)
            list.add(i);
        List<Integer> forEachList = linearSearchForAllOccurences(arr,target,i-1);
        list.addAll(forEachList);
        return list;
    }

}

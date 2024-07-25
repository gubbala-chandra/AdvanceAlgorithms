package kunal.assignments.arrays;

import org.example.strings.subsets.Permutation;

import java.util.Arrays;

public class PremutationArray {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        PremutationArray array = new PremutationArray();
        System.out.println(Arrays.toString(array.buildArray(arr)));

    }
    public int[] buildArray(int[] nums) {

        change(nums,0);
        return nums;

    }
    static void change(int[] nums,int index)
    {
        if(index<nums.length)
        {
            int temp=nums[index];
            int chng=nums[temp];
            change(nums,index+1);
            nums[index]=chng;
        }
        return;
    }
}

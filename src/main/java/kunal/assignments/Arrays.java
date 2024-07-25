//https://leetcode.com/problems/build-array-from-permutation/
package kunal.assignments;

public class Arrays {
    public static void main(String[] args) {

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
    }
}

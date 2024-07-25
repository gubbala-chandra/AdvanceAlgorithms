package kunal.assignments.arrays;

import java.util.Arrays;

public class GetConcatenation {
    public static void main(String[] args) {
        GetConcatenation gc = new GetConcatenation();
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(gc.getConcatenation(arr)));
    }
    public int[] getConcatenation(int[] nums) {
        int[] result = Arrays.copyOf(nums, nums.length*2);
        for(int i= nums.length; i<result.length; i++) {
            result[i] = nums[i-nums.length];
        }
        return result;
    }

    public int[] getConcatenation1(int[] nums) {
        int length = nums.length;
        int newArr[] = new int[length * 2];
        System.arraycopy(nums , 0 , newArr , 0 ,length);
        System.arraycopy(nums , 0 , newArr , length , length);
        return newArr;
    }
}

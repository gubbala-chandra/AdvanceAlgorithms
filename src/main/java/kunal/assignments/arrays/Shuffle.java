//https://leetcode.com/problems/shuffle-the-array/
package kunal.assignments.arrays;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        Shuffle s =new Shuffle();

        System.out.println(Arrays.toString(s.shuffle(new int[]{2,5,1,3,4,7}, 3)));
    }
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int x =0;
        int y = n;
        for(int i=0; i<result.length; i+=2) {
            result[i] = nums[x++];
            result[i+1] = nums[y++];
        }
        return result;
    }
}

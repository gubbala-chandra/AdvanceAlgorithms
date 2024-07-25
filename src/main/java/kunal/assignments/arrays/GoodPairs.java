//https://leetcode.com/problems/number-of-good-pairs/description/
package kunal.assignments.arrays;

public class GoodPairs {

    public int numIdenticalPairs(int[] nums) {
        int ans[] = new int[100];
        for (int i = 0; i<nums.length; i++) {
            ans[nums[i]-1]++;
        }
        int pairs = 0;
        for (int i = 0; i<ans.length; i++) {
            if(ans[i] == 0 || ans[i] == 1) continue;
            pairs += binomialCoefficient(ans[i]);
        }
        return pairs;
    }

    int binomialCoefficient(int n) {
        return (n*(n-1))/2;
    }
}

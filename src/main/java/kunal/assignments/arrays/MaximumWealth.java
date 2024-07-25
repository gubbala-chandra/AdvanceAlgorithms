//https://leetcode.com/problems/richest-customer-wealth/submissions/1330828644/
package kunal.assignments.arrays;

public class MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0; i<accounts.length; i++) {
            int sum =0;
            for(int j=0; j < accounts[i].length; i++) {
                sum+=accounts[i][j];
            }
            max =Math.max(sum,max);
        }
        return max;
    }
}

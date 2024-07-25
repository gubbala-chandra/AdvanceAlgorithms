//https://leetcode.com/problems/sum-root-to-leaf-numbers/
package org.example.trees;

public class SumNumbers {
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    private int helper(TreeNode root, int sum) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return sum;
        }
        int leftSum = helper(root.left, sum*10 + root.val);
        int rightSum = helper(root.right, sum*10 + root.val);
        return leftSum+rightSum;
    }
}

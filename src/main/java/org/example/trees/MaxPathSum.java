//https://leetcode.com/problems/binary-tree-maximum-path-sum/
package org.example.trees;

public class MaxPathSum {
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }

    private int helper(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int left = helper(node.left);
        int right = helper(node.right);

        left = Math.max(left,0);
        right = Math.max(right, 0);

        int pathSum = left + right + node.val;
        ans = Math.max(pathSum, ans);

        return Math.max(left , right) + node.val;
    }

}

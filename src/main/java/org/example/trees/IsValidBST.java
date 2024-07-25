package org.example.trees;

public class IsValidBST {

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    private boolean helper(TreeNode node, Integer low, Integer high) {
        if(node == null) {
            return true;
        }
        if(low != null && node.val <= low) {
            return false;
        }
        if(high != null && node.val >= high) {
            return false;
        }
        boolean leftTree = helper(node, low, node.val);
        boolean rightTree =helper(node, node.val, high);
        return leftTree && rightTree;
    }
}

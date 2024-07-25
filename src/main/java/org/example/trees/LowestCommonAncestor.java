package org.example.trees;

public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return null;
        }
        if(root == p || root == q) {
            return root;
        }
        TreeNode leftTree = lowestCommonAncestor(root.left, p,q);
        TreeNode rightTree = lowestCommonAncestor(root.right, p, q);
        if(leftTree != null && rightTree != null) {
            return root;
        }
        return leftTree != null ? leftTree : rightTree;
    }
}

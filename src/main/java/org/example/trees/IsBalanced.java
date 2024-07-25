package org.example.trees;

public class IsBalanced {

    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        return Math.abs(height(root.left) - height(root.right)) <=1 &&
                isBalanced (root.left) && isBalanced(root.right);
    }

    private int height(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}

package org.example.trees;

public class IsCousins {
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);
        return (level(xx, root,0) == level(yy, root,0) && !isSibling(root, xx, yy));
    }

    private boolean isSibling(TreeNode root, TreeNode xx, TreeNode yy) {
        if(root == null) {
            return false;
        }
        return (
                (root.left == xx && root.right == yy) ||
                        (root.left == yy && root.right == xx) || isSibling(root.left, xx, yy) ||
                        isSibling(root.right, xx, yy) );
    }

    private int level(TreeNode xx, TreeNode node, int level) {
        if(node == null) {
            return 0;
        }
        if(node == xx) {
            return level;
        }
        int result = level(xx, node.left, level++);
        if(result != 0)
            return  result;
        return level(xx, node.right, level++);
    }

    private TreeNode findNode(TreeNode node, int x) {
        if(node == null) {
            return null;
        }
        if(node.val == x) {
            return node;
        }
        TreeNode result = findNode(node.left, x);
        if(result != null) {
            return result;
        }
        return findNode(node.right, x);
    }
}

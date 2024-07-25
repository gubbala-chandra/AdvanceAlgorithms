package org.example.trees;

public class SortedListToBST {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private TreeNode root;
    public TreeNode sortedListToBST(ListNode head) {
        while(head != null) {
            insert(head.val);
            head = head.next;
        }
        return root;
    }

    private void insert(int val) {
        root = insert(root, val);
    }

    private TreeNode insert(TreeNode node, int value) {
        if(node == null) {
            return new TreeNode(value);
        }
        if(value < node.val) {
            node.left = insert(node.left, value);
        }

        if(value > node.val) {
            node.right = insert(node.right, value);
        }
        return rotate(node);
    }
    private int height(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    private TreeNode rotate(TreeNode node) {
        if(height(node.left) - height(node.right) > 1) {
            if(height(node.left.left) - height(node.left.right) > 0) {
                //left-left case
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0) {
                //left-right case
                return leftRotate(node);
            }
        }
        if(height(node.left) - height(node.right) <  -1) {
            //left heavy
            if(height(node.right.left) - height(node.right.right) < 0) {
                //right-right case
                return leftRotate(node);
            }

            if(height(node.right.left) - height(node.right.right) > 0) {
                //left-right case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private TreeNode leftRotate(TreeNode p) {
        TreeNode c = p.right;
        TreeNode t = c.left;
        c.left = p;
        p.right = t;
        return c;
    }
    private TreeNode rightRotate(TreeNode p) {
        TreeNode c = p.left;
        TreeNode t = c.right;
        c.left = p;
        p.left = t;
        return c;
    }
}

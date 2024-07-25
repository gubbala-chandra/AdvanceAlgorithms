package org.example.trees;

import java.util.LinkedList;
import java.util.Queue;

public class FlattenBT {
    //approach 1
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        preOrder(root, queue);
        root = queue.poll();
        root.left = null;
        TreeNode node = root;
        while(!queue.isEmpty()) {
            node.right = queue.poll();
            node = node.right;
            node.left=null;
        }
    }

    private void preOrder(TreeNode node, Queue<TreeNode> queue) {
        if(node == null) {
            return;
        }
        queue.add(node);
        preOrder(node.left, queue);
        preOrder(node.right, queue);
    }

    //approach2
    public void flatten1(TreeNode root) {
        TreeNode curr = root;
        while(curr != null) {
            if(curr.left != null) {
                TreeNode temp = curr.left;
                while(temp.right != null) {
                    temp = temp.right;
                }
                temp.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }
}

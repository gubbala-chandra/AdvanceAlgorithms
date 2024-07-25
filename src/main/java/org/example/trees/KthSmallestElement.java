package org.example.trees;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElement {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();

        inOrder(root,result);
        return result.get(k-1);
    }

    private void inOrder(TreeNode node, List<Integer> list) {
        if(node == null) {
            return;
        }
        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);
    }

    int count =0;
    public int kthSmallest1(TreeNode root, int k) {
        return helper(root, k).val;
    }

    private TreeNode helper(TreeNode node, int k) {
        if(node == null) {
            return null;
        }

        TreeNode left = helper(node.left, k);
        if(left != null) {
            return left;
        }
        count++;

        if(count == k) {
            return node;
        }

        return helper(node.right, k);
    }
}

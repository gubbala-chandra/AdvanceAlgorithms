package org.example.trees;

import java.util.*;

public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i< level; i++) {
                TreeNode curr = queue.poll();
                if(curr.left != null) {
                    queue.add(curr.left);
                    list.add(curr.left.val);
                } else {
                    list.add(null);
                }
                if(curr.right != null) {
                    queue.add(curr.right);
                    list.add(curr.right.val);
                } else {
                    list.add(null);
                }
            }
            if(!queue.isEmpty() && !isSymmetric(list)) {
                return false;
            }
        }
        return true;
    }

    private boolean isSymmetric(List<Integer> list) {
        return list.equals(list.reversed());
    }


    public boolean isSymmetri2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while(!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if(left == null && right == null) {
                continue;
            }
            if(left == null || right == null) {
                return false;
            }

            if(left.val != right.val) {
                return false;
            }
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }
}

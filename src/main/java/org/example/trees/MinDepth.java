package org.example.trees;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepth {

    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int level =1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i< size; i++) {
                TreeNode node = queue.poll();

                if(node.left == null && node.right == null) {
                    return level;
                }
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            level+=1;
        }
        return level;
    }
}

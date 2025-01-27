package org.example.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            double averageLevel = 0;
            for(int i=0; i< levelSize; i++) {
                TreeNode currentNode = queue.poll();
                averageLevel +=currentNode.val;
                if(currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            averageLevel = averageLevel/levelSize;
            result.add(averageLevel);
        }
        return result;
    }
}

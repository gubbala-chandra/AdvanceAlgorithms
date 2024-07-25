package org.example.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class NoOfPaths {
    public List<List<Integer>> findPaths(TreeNode node, int sum) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new LinkedList<>();
        helper(node, sum,path, paths);
        return paths;
    }

    private void helper(TreeNode node, int sum, List<Integer> path,  List<List<Integer>> paths) {
        if(node == null) {
            return;
        }

        path.add(node.val);
        if(node.val == sum && node.left == null && node.right == null) {
            paths.add(path);
        } else {
            helper(node.left, sum-node.val, path, paths);
            helper(node.right, sum-node.val, path, paths);
        }

        // backtrack
        path.remove(path.size()-1);
    }
}

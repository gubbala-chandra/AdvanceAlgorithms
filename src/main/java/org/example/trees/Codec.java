//https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
package org.example.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Codec {
    public String serialize(TreeNode root) {
        StringBuilder result = new StringBuilder();
        helper(root, result);
        return result.substring(0, result.length()-1).toString();
    }

    private void helper(TreeNode node, StringBuilder result) {
        if(node == null) {
            result.append("null").append(",");
            return;
        }
        result.append(node.val).append(",");
        helper(node.left, result);
        helper(node.right, result);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null || data.startsWith("n")) {
            return null;
        }
        List<String> list =  new ArrayList<>(Arrays.asList(data.split(",")));
        Collections.reverse(list);
        return helper2(list);
    }

    private TreeNode helper2(List<String> list) {

        String val = list.remove(list.size()-1);
        if(val.startsWith("n")) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.valueOf(val));

        node.left = helper2(list);
        node.right = helper2(list);

        return node;
    }
}

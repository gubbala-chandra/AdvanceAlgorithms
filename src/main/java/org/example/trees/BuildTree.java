//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
package org.example.trees;

import java.util.Arrays;

public class BuildTree {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0) {
            return null;
        }
        int index =0;
        for(int i=0; i<inorder.length; i++) {
            if(inorder[i] == preorder[0]) {
                index = i;
                break;
            }
        }
        TreeNode node = new TreeNode(preorder[0]);
        node.left = buildTree(Arrays.copyOfRange(preorder, 1, index+1), Arrays.copyOfRange(inorder, 0, index));
        node.right = buildTree(Arrays.copyOfRange(preorder, index+1, preorder.length), Arrays.copyOfRange(inorder, index+1, preorder.length));
        return node;
    }
}

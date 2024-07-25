package org.example.trees;

import java.util.LinkedList;
import java.util.Queue;

public class SuccessorNode {
  public TreeNode getSuccessorNode(TreeNode root, int key) {
      if(root == null) {
          return null;
      }

      Queue<TreeNode> queue = new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty()) {
          TreeNode currentNode = queue.poll();
          if(currentNode.left != null) {
              queue.add(currentNode.left);
          }
          if(currentNode.right != null) {
              queue.add(currentNode.right);
          }
          if(key == currentNode.val)
              break;
      }
      return queue.peek();
  }
}

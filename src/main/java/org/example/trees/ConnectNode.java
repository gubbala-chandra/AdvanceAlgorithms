package org.example.trees;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectNode {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        if(root == null) {
            return root;
        }
        Node leftMost = root;

            while(leftMost.left != null) {
                Node current = leftMost;
                while(current != null) {
                    current.left.next = current.right;
                    if(current.next != null) {
                        current.right.next = current.next.left;
                    }
                    current = current.next;
                }
                leftMost = leftMost.left;
            }
        return root;
    }

    public Node unBalancedConnect(Node root) {
        if(root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {

            int level = queue.size();
            for(int i=0; i< level; i++) {
                Node current = queue.poll();
                if(i != level-1 && !queue.isEmpty()) {
                    current.next = queue.peek();
                }
                if(current.left != null) {
                    queue.add(current.left);
                }
                if(current.right != null) {
                    queue.add(current.right);
                }
            }
        }


        return root;
    }
}

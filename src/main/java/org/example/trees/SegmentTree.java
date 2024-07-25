package org.example.trees;

import java.util.Arrays;

public class SegmentTree {

    public static void main(String[] args) {
        int[] arr = {3,8,6,7,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);
    }

    private class Node {
        private int value;
        private int startInterval;
        private int endInterval;
        private Node left;
        private Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    private Node root;

    public SegmentTree(int[] arr) {
        // create a segment tree
        this.root = constructSegmentTree(arr, 0, arr.length-1);
    }

    private Node constructSegmentTree(int[] arr, int start, int end) {
        if(start == end) {
            Node leaf = new Node(start, end);
            leaf.value = arr[start];
            return leaf;
        }
        Node  node = new Node(start, end);
        int mid = (start + end)/2;
        node.left = constructSegmentTree(arr, start, mid);
        node.right = constructSegmentTree(arr, mid+1, end);
        node.value =  node.left.value + node.right.value;
        return node;
    }

    public void display() {
        display(root);
    }

    public void display(Node node) {
        String str = "";
        if(node.left != null) {
            str = str + "inteval =[" + node.left.startInterval + "-" + node.left.endInterval + " ] and data: " + node.left.value + "+ =>";
        } else{
            str = str + "No left child";
        }
        // for current node
        str = str + "inteval =[" + node.startInterval + "-" + node.endInterval + " ] and data: " + node.value + "+ <=";

        if(node.right != null) {
            str = str + "inteval =[" + node.right.startInterval + "-" + node.right.endInterval + " ] and data: " + node.right.value + "+ =>";
        } else {
            str = str + "No right child";
        }

        System.out.println(str);

        if(node.left != null) {
            display(node.left);
        }

        if(node.right != null) {
            display(node.right);
        }
    }

    public int query(int qsi, int qei) {
        return query(root, qsi, qei);
    }
    private int query(Node node, int qsi, int qei) {
        if(node.startInterval <= qsi && node.endInterval >= qei) {
            // node is habing data required for query
            return node.value;
        } else if (node.startInterval > qei || node.endInterval < qsi) {
            return 0;
        } else {
            return query(node.left, qsi, qei) + query(node.right,  qsi, qei);
        }
    }

    public void update(int index, int value) {
        //if()
    }
}

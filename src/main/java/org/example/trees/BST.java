package org.example.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST {

    private static class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
     }

     private Node root;

    public BST() {}

    public int height(Node node) {
        if(node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void display() {
        display(root, "Root Node:");
    }

    private void display(Node node, String details) {
        if(node == null) {
            return;
        }

        System.out.println(details + node.getValue());
        display(node.left, "Left child of " + node.getValue() + " :");
        display(node.right, "Right child of " + node.getValue() + " :");
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if(node == null) {
            return new Node(value);
        }

        if(value < node.getValue()) {
            node.left = insert(node.left, value);
        }

        if(value > node.getValue()) {
            node.right = insert(node.right, value);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

     public boolean balanced() {
        return balanced(root);
     }

     private boolean balanced(Node node) {
        if(node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <=1 && balanced(node.left) && balanced(node.right);
     }

     public void populate(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            insert(nums[i]);
        }
     }

     public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
     }

     private void populateSorted(int[] nums, int start, int end) {
        if(start >= end) {
            return;
        }
        int mid = (start+end)/2;
        insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);
     }

     public void topView() {
        topView(root);
     }
    public void topView(Node root) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        Node node = root.left;
        while(node != null) {
            stack.add(node.value);
            node = node.left;
        }
        node = root;
        while(node != null) {
            queue.add(node.value);
            node = node.right;
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        while(!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

    }

    public static void main(String[] args) {
        BST tree = new BST();

        /*int[] nums = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
        tree.populate(nums);*/
        int[] nums = {37,23,108,59,86,64,94,14,105,17,111,65,55,31,79,97,78,25,50,22,66,46,104,98,81,90,68,40,103,77,74,18,69,82,41,4,48,83,67,6,2,95,54,100,99,84,34,88,27,72,32,62,9,56,109,115,33,15,91,29,85,114,112,20,26,30,93,96,87,42,38,60,7,73,35,12,10,57,80,13,52,44,16,70,8,39,107,106,63,24,92,45,75,116,5,61,49,101,71,11,53,43,102,110,1,58,36,28,76,47,113,21,89,51,19,3};
        //tree.populateSorted(nums);
        tree.populate(nums);
        tree.topView();

        //System.out.println(tree.balanced());
    }
}

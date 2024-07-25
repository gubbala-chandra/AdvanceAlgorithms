package org.example.trees;

import java.util.List;
import java.util.stream.Collectors;

public class AVL {

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

    public AVL() {}

    public int height() {
        return height(root);
    }

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
        return rotate(node);
    }

    private Node rotate(Node node) {
        if(height(node.left) - height(node.right) > 1) {
            //left heavy
            if(height(node.left.left) - height(node.left.right) > 0) {
                //left-left case
                return rightRotate(node);
            }

            if(height(node.left.left) - height(node.left.right) < 0) {
                //left-right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        } if(height(node.left) - height(node.right) <  -1) {
            //left heavy
            if(height(node.right.left) - height(node.right.right) < 0) {
                //right-right case
                return leftRotate(node);
            }

            if(height(node.right.left) - height(node.right.right) > 0) {
                //left-right case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node leftRotate(Node p) {
        Node c = p.right;
        Node t = c.left;
        c.left = p;
        p.right = t;
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        return c;
    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;
        c.left = p;
        p.left = t;
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        return c;
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

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println(sum);


        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Process a subrange of the list (for example, indices 2 to 6)
        List<Integer> squaredSubList = list.subList(2, 7)  // subList is from index 2 to 6 inclusive
                .stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(squaredSubList);

        /*AVL tree = new AVL();

        *//*int[] nums = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
        tree.populate(nums);*//*
        *//*int[] nums = {1,2,3,4,5,6,7,8,9,10};
        tree.populateSorted(nums);*//*
        for(int i=1; i<=1000; i++) {
            tree.insert(i);
        }
       // tree.display();

        System.out.println(tree.height());*/
    }
}

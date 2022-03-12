package com.binarysearchtrees;

public class Tree {
    
    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        }
        else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
        System.out.println("");
    }

    public void traversePreOrder() {
        if (root != null) {
            root.traversePreOrder();
        }
        System.out.println("");
    }

    public void traversePostOrder() {
        if (root != null) {
            root.traversePostOrder();
        }
        System.out.println("");
    }

    public TreeNode get (int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        else {
            return root.min();
        }
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        else {
            return root.max();
        }
    }

    public void delete(int value) {
        root = delete (root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) {
            return subtreeRoot;
        }
        if (value < subtreeRoot.getData()) {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        }
        else if (value > subtreeRoot.getData()) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        }
        else {
            //we found the node to be deleted. handle case 1 - no children or  2 - has one child
            if  (subtreeRoot.getLeftChild()== null) {
                return subtreeRoot.getRightChild();
            }
            else if (subtreeRoot.getRightChild() == null) {
                return subtreeRoot.getLeftChild();
            }

            // case 3 - node has 2 children
            //replace the value in the subtreeNode (to be deleted) node with the smallest value
            //from the right subtree
            subtreeRoot.setData(subtreeRoot.getRightChild().min());

            //delete the node that has the smallest value in the right subtree
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
         }
        return subtreeRoot;
    }
}

package com.binarysearchtrees;
/**
 * BinaryTree - every node has 0, 1 or 2 nodes
 * // left child or right child
 * // in practise, we use binary tree
 * 
 * //complete binary tree - each node has left and right child and the leaf node are all to the left as possible.
 * // every level except the last level is completely filled. 
 * 
 * //full binary tree - complete tree 
 * 
 * BinarySearchTree - insertions, deletion and retrievals n O(logn) time
 * // faster searching than unsorted arrays do
 * // equivalent time complexity to sorted arrays
 * // left child always has a smaller value than its parent
 * // right child always has a larger value than its parent
 * 
 * // duplicates - not allowed 
 * // | all duplicates either to the left of the tree or to the right of the tree 
 * // | use the nodes with counter and then increment the counter
 * 
 * // for min value follow the left edges and for max same to the edges on the right
 * 
 * //binary tree with sorted inserion order -> equivalent as linked list
 * //self-balancing search-trees - AVL and redblack trees 
 * 
 * //Travrsal - 4 ways 
 *  //level - not used much, visit nodes on each level
 *  // pre-oder - visit the root of every subtree first - root, entire left subtree and then the right subtree
 * // post-order - visit the root of every sub-tree last - entire left sub tree, then right and then the root
 * // in-order - visit left child,then root, then right child - data is sorted 
 * 
 * // delete - 3 cases. node is a leaf, ode has one child, node has two children
 *  // delete node with 2 children is complex - miniml disruption, can take the replacement node from the deleted's node 
 *  // left subtree or right subtree. if taking from left subtree, take the largest value n the left subtree. if 
 *  // taking from the right subtree, take the smallest value in the right subtree
 * 
 */
public class BinarySearchTree {
    
    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);

        intTree.traverseInOrder();

        System.out.println();

        System.out.println(intTree.get(27));


        System.out.println("min - " + intTree.min());
        System.out.println("max - " + intTree.max());

        System.out.println("----------------------------------");
        //before
        intTree.traverseInOrder();
        // intTree.delete(27);
        //after
        intTree.traverseInOrder();
        System.out.println("----------------------------------");


        intTree.traversePreOrder();
        intTree.traversePostOrder();
        intTree.traverseInOrder();
    }
    
}

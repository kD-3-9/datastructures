package com.maxheaps;
/**
 * Heap is a special type of binary Tree - complete binary tree.
 * must satify heap property: 
 * max heap - every parent is greater than or equal to its children
 * min heap - every parent is less than or equal to its children
 * 
 * //childeren are added from left to right
 * // usually implemented as array
 * //maximum or minimum value will always be at the root of the tree. - the advantage of using heap
 * 
 * //heapify - process of converting a binary tree into a heap - often has to be done 
 * //after an indertion or deletion
 * //no ordering required between siblings
 * 
 * //can store binary heaps as array
 * //put the root at array[0], then traverse from left to right. so left child would go in array[1] 
 * //and right would go to array[2]
 * 
 * //for node at array[i], left child = 2i + 1, right child = 2i + 2. parent = floor ((i - 2) / 2 )
 * //always add new item to the end of the array and then fix the heap (heapify) - compare new item
 * // with its parent and if the item is greater than its parent, we swap it with its parent. 
 * // then rinse and repeat. 
 */
public class Heap {

    private int[] heap;
    private int size;

    public Heap(int capacity) {
        heap = new int[capacity];
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public int getParent(int index) {
        return (index - 1) / 2; //doesnt need floor since / will round it down to the lowest number
    }

    public void insert(int value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is full.");
        }
        heap[size] = value; //size = index of new value
        fixHeapAbove(size);
        size++;
    }

    public void fixHeapAbove(int index) {
        int newValue = heap[index];
        while (index > 0 && newValue > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = newValue;
    }
    
}

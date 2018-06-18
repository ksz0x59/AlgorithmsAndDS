package com.company.binary.search.tree;

public class Node {
    Node left;
    Node right;
    int item;
    public Node ()
    {
        item = 0;
        left = null;
        right = null;
    }
    Node (int item)
    {
        this.item = item;
        left = null;
        right = null;
    }
}

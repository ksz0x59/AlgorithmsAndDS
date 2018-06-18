package com.company.binary.search.tree;

public class TestTree {
    public static void main (String [] args)
    {
        BinarySearchTree mine = new BinarySearchTree();
        mine.insert(mine.root, new Node(10));
        mine.insert(mine.root, new Node(1));
        mine.insert(mine.root, new Node(8));
        mine.search(7 , mine.root);
        mine.search(8, mine.root);
    }
}

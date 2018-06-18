package com.company.binary.search.tree;

public class BinarySearchTree {
    Node root;
    BinarySearchTree ()
    {
        root = null;
    }
    public void insert (Node start, Node newNode)
    {
        if (root == null) {
            root = newNode;
            return;
        }
        else if (newNode.item > start.item) {
            if (start.right == null)
                start.right = newNode;
            insert(start.right, newNode);
        }
        else if (newNode.item < start.item)
        {
            if (start.left == null)
                start.left = newNode;
            insert(start.left, newNode);
        }
    }

    public void search (int element, Node start)
    {
        if (start == null) {
            System.out.println("Item not found ! ");
            return;
        }

        else if(start.item == element) {
                System.out.println("Item found !");
                return;
        }

        else if (element > start.item)
        {
            search(element, start.right);
        }

        else
            search(element, start.left);
    }
}

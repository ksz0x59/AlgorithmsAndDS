package com.company.linked.listu;

public class Node {
    Object item;
    Node next;
    public Node ()
    {
        item = null;
        next = null;
    }
    public Node (Object item)
    {
        this.item = item;
        this.next = null;
    }
}

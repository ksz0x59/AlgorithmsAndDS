package com.company.linked.listu;

public class LinkedListu <T> {

    Node head;

    public void add(Node newNode)
    {
        if (head == null)
            head = newNode;
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }
    public void search (Object item)
    {
        Node tmp = head;

        while (tmp != null)
        {
            if (tmp.item == item) {
                System.out.println("Item found !");
                break;
            }

            else
                tmp = tmp.next;
        }

        if (tmp == null)
            System.out.println("Item not found ! ");
    }

    public void deleteItem()
    {
        if (head == null) {
            System.out.println("List is empty - cannot delete");
            return;
        }

        head = head.next;
    }

    public void printElements ()
    {
        Node tmp = head;
        while (tmp != null)
        {
            System.out.println(tmp.item);
            tmp = tmp.next;
        }
    }

}

package com.company;

import com.company.linked.listu.LinkedListu;
import com.company.linked.listu.Node;

public class Main {

    public static void main(String[] args) {
        LinkedListu<String> mylist = new LinkedListu<String>();
        mylist.deleteItem();
        mylist.add(new Node("ala"));
        mylist.add(new Node("Alan"));
        mylist.add(new Node("As"));
        mylist.add(new Node("Buzz"));
        mylist.printElements();
        mylist.deleteItem();
        mylist.deleteItem();
        mylist.deleteItem();
        mylist.deleteItem();
        mylist.deleteItem();

    }
}

package com.company.linked.listu;

public class TestList {
    public static void main(String[] args) {
        LinkedListu<String> mylist = new LinkedListu<String>();
        mylist.deleteItem();
        mylist.add(new Node("Alex"));
        mylist.add(new Node("Alan"));
        mylist.add(new Node("Ashley"));
        mylist.add(new Node("Buzz"));
        mylist.printElements();
        mylist.deleteItem();
        mylist.deleteItem();
        mylist.deleteItem();
        mylist.deleteItem();
        mylist.deleteItem();
        mylist.add(new Node("Mike"));
        mylist.add(new Node("Chuck"));
        mylist.add(new Node("Kinley"));
        mylist.printElements();
        mylist.search("Chuck");
        mylist.search("Beef");

    }
}

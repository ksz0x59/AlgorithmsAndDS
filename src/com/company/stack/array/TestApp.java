package com.company.stack.array;

public class TestApp {
    public static void main (String [] args)
    {
        StackArray<String> mystack = new StackArray<String>(4);
        mystack.pop();
        mystack.push("Alex");
        mystack.push("David");
        mystack.push("Freddy");
        mystack.push("John");
        mystack.push("Justin");
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        mystack.pop();
        mystack.push("Anna");
        mystack.push("Emma");
        mystack.push("Ashley");
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());

    }
}

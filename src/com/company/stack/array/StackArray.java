package com.company.stack.array;

public class StackArray<T> {

    Object [] arr;
    int top;
    int size;

    public StackArray ()
    {
        arr = null;
        top = -1;
        size = 0;
    }
    public StackArray (int size)
    {
        arr = new Object[size];
        top = -1;
        this.size = size;
    }

    public void push(Object o)
    {
        if (top  + 1 == size ) {
            System.out.println("Stack is full !");
            return;
        }
        top = top + 1;
        arr[top] = o;
    }

    public T pop ()
    {
        if (top == -1) {
            System.out.println("Stack is empty, cannot pop");
            return null;
        }
        else
        {
            T tmp = (T)arr[top];
            top = top -1;
            return tmp;
        }
    }

}

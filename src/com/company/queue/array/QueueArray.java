package com.company.queue.array;

public class QueueArray <T> {

    Object [] arr;
    int front;
    int rear;
    int size;

    public QueueArray ()
    {
        arr = null;
        front = -1;
        rear = -1;
        size = 0;
    }

    public QueueArray (int size)
    {
        arr = new Object [size];
        front = -1;
        rear = -1;
        this.size = size;
    }

    public void enQueue (Object item)
    {
        if (rear + 1 == size){
            System.out.println("Queue is full - cannot enqueue");
            return;
        }

        if (front == -1)
            front = front + 1;

        rear = rear + 1;
        arr[rear] = item;
    }

    public T deQueue ()
    {
        if (front == -1 || front > rear){
            System.out.println("Queue is empty - cannot dequeue");
            front = -1;
            rear = -1;
            return null;
        }

        T tmp = (T) arr[front];
        front = front + 1;
        return tmp;
    }

}

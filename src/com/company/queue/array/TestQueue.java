package com.company.queue.array;

public class TestQueue {
    public static void main ( String [] args )
    {
        QueueArray<String> myQueue = new QueueArray<String>(4);
        myQueue.deQueue();
        myQueue.enQueue("Alex");
        myQueue.enQueue("David");
        myQueue.enQueue("Freddy");
        myQueue.enQueue("John");
        myQueue.enQueue("Justin");
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        myQueue.deQueue();
        myQueue.enQueue("Anna");
        myQueue.enQueue("Emma");
        myQueue.enQueue("Ashley");
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
    }
}

package org.example.stack.queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Example {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);

        queue.display();

        System.out.println(queue.remove());
        queue.display();
        queue.push(6);
        queue.display();


    }
}

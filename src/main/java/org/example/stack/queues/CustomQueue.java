package org.example.stack.queues;

public class CustomQueue {
    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public int push(int element) throws QueueException {
        if(isFull()) {
            throw new QueueException("Queue is full, cannot add elements");
        }
        data[end++] = element;
        return element;
    }

    public int remove() throws QueueException {
        if(isEmpty()) {
            throw new QueueException("Queue is already empty");
        }
        int removed = data[0];
        for(int i =1; i< end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int peek()  throws QueueException{
        if(isEmpty()) {
            throw new QueueException("Queue is already empty");
        }
        return data[0];
    }

    public void display() {
        for(int i = 0; i< end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public boolean isFull() {
        return end == data.length;
    }

    private boolean isEmpty() {
        return end == 0;
    }
}

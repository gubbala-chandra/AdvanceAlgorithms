package org.example.stack.queues;

public class CircularQueue {

    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    protected int start = 0;
    protected int end = 0;
    int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public int push(int element) throws QueueException {
        if(isFull()) {
            throw new QueueException("Queue is full, cannot add elements");
        }
        data[end++] = element;
        end = end % data.length;
        size++;
        return element;
    }

    public int remove() throws QueueException {
        if(isEmpty()) {
            throw new QueueException("Queue is  empty");
        }
        int removed = data[start++];
        start = start % data.length;
        size--;
        return removed;
    }

    public int peek() {
        if(isEmpty()) {
            throw new QueueException("Queue is  empty");
        }
        return data[start];
    }

    public void display() {
        if(isEmpty()) {
            return;
        }
        int i = start;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i%= data.length;
        } while(i != end);
        System.out.println("END");
       /* if(end < start) {
            for(int i = start; i< data.length;i++) {
                System.out.print(data[i] + " -> ");
            }
            for(int i =0 ; i< end; i++ ){
                System.out.print(data[i] + " -> ");
            }
            System.out.println("end");
        } else {
            for(int i = start; i<= end; i++) {
                System.out.print(data[i] + " -> ");
            }
            System.out.println();
        }*/

    }

    public boolean isFull() {
        return size == data.length;
    }

    private boolean isEmpty() {
        return size == 0;
    }
}

package org.example.stack.queues;

public class CustomStack {

    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public void addElement(int element) {
        if(isFull()) {
            System.out.println("Stack is full");
            return;
        }
        data[++ptr] = element;

    }

    public boolean isFull() {
        return ptr == data.length-1;
    }

    public int push(int element) {
        if(isFull()) {
            throw new StackException("Stack is full, cannot add elements");
        }
        data[++ptr] = element;
        return element;
    }

    public int pop() throws StackException {
        if(isEmpty()) {
            throw new StackException("Cannot Pop slack is already empty");
        }
        return data[ptr--];
    }

    public int peek()  throws StackException{
        if(isEmpty()) {
            throw new StackException("Cannot get Peek element, slack is already empty");
        }
        return data[ptr];
    }

    private boolean isEmpty() {
        return ptr == -1;
    }
}

package org.example.stack.queues;

public class DynamicQueue extends CircularQueue {

    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    public int push(int element) throws QueueException {
        if(this.isFull()) {
            int[] temp =  new int[2*data.length];
            for(int i=0; i< temp.length; i++) {
                temp[i] = data[(start + i) % data.length];
            }
            start =0;
            end = data.length;
            data = temp;
        }

        return super.push(element);
    }
}

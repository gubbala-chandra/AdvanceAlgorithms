package org.example.stack.queues;

public class DynamicStack extends CustomStack {

    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public void addElement(int element) {
        if(super.isFull()) {
            resize();
        }
        super.addElement(element);
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    @Override
    public int push(int element) {
        if(super.isFull()) {
            resize();
        }
        return super.push(element);
    }
}

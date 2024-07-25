package org.example.heaps;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public Heap() {
        list = new ArrayList<>();
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
    private int parent(int index) {
        return (index-1)/2;
    }
    private int left(int index) {
        return (2 * index) + 1;
    }
    private int right(int index) {
        return (2 * index) + 2;
    }

    public void insert(T value) {
        list.add(value);
        upHeap(list.size()-1);
    }

    private void upHeap(int index) {
        if(index == 0) {
            return;
        }
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0) {
            swap(index, p);
        }
        upHeap(p);
    }

    public T remove() throws Exception {
        if(list.isEmpty()) {
            throw new Exception("Heap is Empty");
        }
        T temp = list.get(0);
        T last = list.remove(list.size()-1);
        if(!list.isEmpty()) {
            list.set(0, last);
            downHeap(0);
        }
        return temp;
    }

    private void downHeap(int index) {
        if(index == list.size()-1) {
            return;
        }
        int min = index;
        int l = left(index);
        int r = right(index);
        if(l < list.size() && list.get(l).compareTo(list.get(min)) < 0) {
           min = l;
        }
        if(r< list.size() && list.get(r).compareTo(list.get(index)) < 0) {
            min = r;
        }
        if(min != index) {
            swap(min, index);
            downHeap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList data = new ArrayList<>();

        while(!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }
}

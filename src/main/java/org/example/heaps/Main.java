package org.example.heaps;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();

        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);
        //ArrayList<Integer> result = heap.heapSort();
        System.out.println(heap.heapSort());
    }
}

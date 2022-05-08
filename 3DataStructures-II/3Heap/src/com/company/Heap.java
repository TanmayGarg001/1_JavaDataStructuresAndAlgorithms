package com.company;

import java.util.ArrayList;

public class Heap {
    ArrayList<Integer> heap;

    public Heap() {
        heap = new ArrayList<>();
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(12);
        heap.add(10);
        heap.add(-45);
        heap.add(0);
        heap.add(100);
        heap.add(-49);
        heap.add(541);
        System.out.println(heap);
        heap.remove(0);
        System.out.println(heap);
    }

    public void heapify(int index) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < heap.size() && heap.get(left) > heap.get(largest)) {
            largest = left;
        }
        if (right < heap.size() && heap.get(right) > heap.get(largest)) {
            largest = right;
        }
        if (largest != index) {
            int temp = heap.get(largest);
            heap.set(largest, heap.get(index));
            heap.set(index, temp);
            heapify(largest);
        }

    }

    public void add(int value) {
        if (heap.size() == 0) {
            heap.add(value);
        } else {
            heap.add(value);
            for (int i = heap.size() / 2 - 1; i >= 0; i--) {
                heapify(i);
            }
        }
    }

    public void remove(int value) {
        int i;
        for (i = 0; i < heap.size(); i++) {
            if (value == heap.get(i)) {
                break;
            }
        }
        int temp = heap.get(i);
        heap.set(i, heap.get(heap.size() - 1));
        heap.set(heap.size() - 1, temp);
        heap.remove(heap.size() - 1);

        for (int j = heap.size() / 2 - 1; j >= 0; j--) {
            heapify(j);
        }
    }

    @Override
    public String toString() {
        String output = "[ ";
        for (int i = 0; i < heap.size(); i++) {
            output = output + heap.get(i) + " ";
        }
        output = output + "]";
        return output;
    }

}

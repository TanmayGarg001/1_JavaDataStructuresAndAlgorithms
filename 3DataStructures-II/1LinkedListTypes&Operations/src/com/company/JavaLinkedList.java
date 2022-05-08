package com.company;

//Tasks to accomplish:-
// done = isEmpty
// done = size
// done = get
// done  = add
// done = remove
// done = remove at particular index
// done = set value at particular index
// done = print

public class JavaLinkedList<E> {

    Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            int count = 0;
            Node temp = head;
            while (temp.next != null) {
                count++;
                temp = temp.next;
            }
            return count + 1;
        }
    }

    public E get(int index) {
        if (index >= size()) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " out of bounds for length " + size());
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public void add(E data) {
        Node toAdd = new Node(data);
        if (isEmpty()) {
            head = toAdd;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toAdd;
    }

    public void add(int index, E data) {
        if (index >= size()) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " out of bounds for length " + size());
        } else {
            Node toAdd = new Node(data);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node temp2 = temp.next;
            temp.next = toAdd;
            toAdd.next = temp2;
        }
    }

    public void remove() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("List is empty!");
        } else {
            head = head.next;
        }
    }

    public void remove(int index) {
        if (index >= size()) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " out of bounds for length " + size());
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void set(int index, E item) {
        if (index >= size()) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " out of bounds for length " + size());
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.data = item;
        }
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        } else {
            String output = "[";
            Node temp = head;
            while (temp.next != null) {
                output = output + temp.data + " ";
                temp = temp.next;
            }
            output = output + temp.data + "]";
            return output;
        }
    }

    public class Node {
        E data;
        Node next;

        public Node(E data) {
            this.data = data;
            next = null;
        }
    }

}

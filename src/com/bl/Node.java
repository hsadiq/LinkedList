package com.bl;

public class Node<T> {
    T data;
    Node next;

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    public Node(T data) {
        this.data = data;
        this.next = next;
    }
}

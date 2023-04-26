package com.bl;

public class LinkedList {
    Node Head;
    static class Node{
        int data;
        Node next;
        public Node(int d) {
            data = d;
            next = null;
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Linked List Programme");
        LinkedList list = new LinkedList();

        list.Head= new Node(56);
        Node Second = new Node(30);
        Node Third = new Node(70);

        list.Head.next = Second;
        Second.next = Third;
        Third.next = null;

        //print LinkedList
        Node n = list.Head;
        while (n != null){
            System.out.println(n.data + " ");
             n = n.next;
        }
    }
}

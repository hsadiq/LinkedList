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
    public void printList(){
        Node n = Head;
        while (n != null){
            System.out.print(n.data + " ");
            n = n.next;
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

        list.printList();
    }
}

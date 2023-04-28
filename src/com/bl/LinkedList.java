package com.bl;


public class LinkedList<T> {
    Node<T> Head;
    Node<T> temp;

    public void addFirst(T data) {
        Node<T> Nd = new Node(data);
        Nd.next = Head;
        Head = Nd;
    }

    public void pop(T key) {
        if (Head == null) {
            return;
        }

        if (Head.data == key) {
            Head = Head.next;
            return;
        }

        Node prev = null;
        Node current = Head;

        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        prev.next = current.next;
    }


    public void printList(){
        Node<T> present = Head;
        while (present != null){
            System.out.print(present.data + " ");
            present = present.next;
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Linked List Programme");
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(56);
        list.addFirst(30);
        list.addFirst(70);

        list.pop(56);

        list.printList();


    }
}

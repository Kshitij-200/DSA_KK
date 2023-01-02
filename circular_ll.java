package com.company;

public class circular_ll {
    Node head;
    Node tail;

    public circular_ll() {
        this.head = null;
        this.tail = null;
    }

    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }
    public void insertFirst(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next =  node;
        node.next = head;
        tail = node;
    }

    public void printList(){
        Node node = head;
        if (head != null){
            do {
                System.out.print(node.data + "->");
                node = node.next;
            }while (node != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int data){

    }
    public static void main(String[] args) {
        circular_ll cll = new circular_ll();
        cll.insertFirst(56);
        cll.insertFirst(6);
        cll.insertFirst(5);
        cll.printList();
    }
}

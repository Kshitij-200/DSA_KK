package com.company;

public class doubly_ll {
    Node head;
    Node tail;
    private int size;
    public class Node{
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public void addFirst(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            return;
        }
        node.next = head;
        head.prev = node;
        node.prev = null;
        head = node;
    }

    public void addlast(int data){

        Node node = new Node(data);
        if (head == null){
            head = node;
            return;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;
    }

    public Node find(int val){
        Node node = head;
        while (node != null){
            if (node.data == val){
                return  node;
            }
            node = node.next;
        }
        return null;
    }

    public void addMiddle(int after , int data){
        Node p = find(after);
        if (p == null){
            System.out.println("Node not exist");
        }
        Node node = new Node(data);
        node.next = p.next;
        node.prev = p;
        p.next = node;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public void addindex(int data, int index){
        if (index == 0){
            addFirst(data);
        }
        Node temp = head;
        for (int i = 0; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(data);
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        node.next.prev = node;
    }

    public void printlist(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        System.out.print("NULL-><-");
        Node temp = head;
        Node last = null;
        while (temp != null){
            System.out.print(temp.data + "-><-");
            last = temp;
            temp = temp.next;
        }
        System.out.println("NULL");

        System.out.println("\nprinting in reverse");
        while (last != null){
            System.out.print(last.data + "<-");
            last = last.prev;
        }
//        System.out.println();
        System.out.print("NULL");
    }
    public static void main(String[] args) {
        doubly_ll dll = new doubly_ll();
        dll.addFirst(56);
        dll.addFirst(74);
        dll.addFirst(7);
        dll.addFirst(0);
        dll.addlast(1);
        dll.addlast(23);
//        dll.printlist();

        dll.addMiddle(23,5);
        dll.addindex(14,3);
        dll.printlist();

    }
}

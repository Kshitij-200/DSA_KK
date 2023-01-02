package com.company;

public class Linked_list_insertion {
    Node head;
    private int size;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = next;
        }
    }

    public void addfirst(int data){
        Node newnode = new Node(data);
        if (head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
        size++;
    }

    public void addlast(int data){
        Node newnode = new Node(data);
        if (head == null){
            head = newnode;
            return;
        }
        Node lastnode = head;
        while (lastnode.next != null){
            lastnode   = lastnode.next;
        }
        lastnode.next = newnode;
    }

    public void deletefirst(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    public void deletelast(){
        if (head.next == null){
            head = null;
            return;
        }
        else if (head == null){
            System.out.println("list is empty");
            return;
        }
        Node secondlast = head;
        Node last = head.next;
        while (last.next != null){
            secondlast = secondlast.next;
            last = last.next;
        }
        secondlast.next = null;
    }

    public void printlist(){
        if (head == null){
            System.out.println("list is empty so newnode == head");
            return;
        }
        Node currentnode = head;
        while (currentnode != null){
            System.out.print(currentnode.data + "->");
            currentnode = currentnode.next;
        }
        System.out.print("NULL");
    }

//    public void llInsertion(int data){
//        Node node = new Node(data);
//        if (head == null){
//            head = node;
//        }
//        head = node.next;
//        head = node;
//    }

//    public void printLl(){
//        Node temp = head;
//        while (temp != null){
//            System.out.print(temp.data + "->");
//            temp = temp.next;
//        }
//        System.out.println("NULL");
//    }

    public void insertLast(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
        }
        Node lastnode = head;
        while (lastnode.next != null){
            lastnode = lastnode.next;
        }
        lastnode.next = node;
        node.next = null;
    }

    public void insert(int data, int index){
        if (index == 0){
            addfirst(data);
            return;
        }
        if (index == size){
            addlast(data);
        }
//        Node node = new Node(data,index);
        Node temp = head;
        for (int i = 0; i<index; i++){
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
	// write your code here
        Linked_list_insertion linkedList = new Linked_list_insertion();
        linkedList.addfirst(45);
//        linkedList.addfirst(4);
//        linkedList.addfirst(47);
//        linkedList.addlast(20);
        linkedList.insertLast(25);
        linkedList.insertLast(56);

//        linkedList.deletefirst();


        linkedList.printlist();


    }
}


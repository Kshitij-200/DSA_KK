package com.company;

public class linkedlist {
    node1 head;
    private int size;

    class node1{
        int data;
        node1 next;

        node1(int data){
            this.data = data;
            this.next = next;
            size++;
        }
    }

    public void addfirst(int data){
        node1 node = new node1(data);
        if (head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void addlast(int data){
        node1 node = new node1(data);
        if (head == null){
            head = node;
        }
        node1 lastnode = head;
        while (lastnode.next != null){
            lastnode = lastnode.next;
        }
        lastnode.next = node;
    }

    public void printlist(){
        if (head == null){
            System.out.println("list is empty");
        }
        node1 currennode = head;
        while (currennode != null){
            System.out.print(currennode.data + " -> ");
            currennode = currennode.next;
        }
        System.out.println("NULL");
    }

    public void deletefirst(){
        if (head == null){
            System.out.println("list is empty");
        }
        else if (head.next == null){
            head = null;
        }
        head = head.next;
        size--;
    }

    public void deletelast(){
        if (head == null){
            System.out.println("list is empty");
        }
        size--;
        if (head.next == null){
            head = null;
        }
        node1 secondlast = head;
        node1 lastnode = head.next;
        while (lastnode.next != null){
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public void addmiddle(int data, int index){
        node1 node = new node1(data);
        if (head == null){
//            node.next = head;
            head = node;
            return;
        }
        if (head.next == null){
            head.next = node;
            node.next = null;
            return;
        }
        node1 temp = head;
        for (int i = 0; i<index; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;

//        node1 middlenode = head;
//        while (middlenode.next )
    }

    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addfirst(45);
        ll.addfirst(47);
        ll.addfirst(10);
        ll.printlist();

        ll.addlast(15);
        ll.addlast(89);
        ll.printlist();

//        ll.deletefirst();
//        ll.deletefirst();
//        ll.printlist();

//        ll.deletelast();

//        ll.printlist();

        ll.addmiddle(31,2);
        ll.printlist();
        ll.getSize();
        System.out.println(ll.getSize());


    }
}

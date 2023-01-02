package com.company;

public class reverse_ll {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = next;
        }
    }
    public void addfirst(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            return;
        }
        else {
            node.next = head;
            head = node;
            return;
        }
    }
    public void printlist(){
        if (head == null){
            System.out.println("list is empty");
        }
        Node currennode = head;
        while (currennode != null){
            System.out.print(currennode.data + " -> ");
            currennode = currennode.next;
        }
        System.out.println("NULL");
    }

    public Node reverseRecursive(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node newnode = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newnode;
    }


    public static void main(String[] args) {
        reverse_ll reverseLl = new reverse_ll();
        reverseLl.addfirst(56);
        reverseLl.addfirst(47);
        reverseLl.addfirst(41);
        reverseLl.addfirst(74);
        reverseLl.printlist();

       reverseLl.head = reverseLl.reverseRecursive(reverseLl.head);
       reverseLl.printlist();


    }
}

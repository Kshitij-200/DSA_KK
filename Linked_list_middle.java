package com.company;

public class Linked_list_middle {
    Node head;
    private int size;
    public class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public void addFirst(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void deletetMiddle(int index){
        if(index == 0){
            System.out.println("delete at first");
        }
        if (index == size){
            System.out.println("Insert at last");
        }
        Node temp = head;
        for (int i = 0; i<index; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
//        temp.next = null;
    }

    public void printList(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Linked_list_middle llm = new Linked_list_middle();
        llm.addFirst(54);
        llm.addFirst(74);
        llm.addFirst(78);
        llm.addFirst(1);
        llm.addFirst(23);
        llm.printList();
        llm.deletetMiddle(1);
        llm.printList();

    }
}

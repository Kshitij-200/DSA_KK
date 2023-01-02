package com.company;

public class llist {
    Node head;
     class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = next;
        }
    }

    public  void addfirst(int data){
        Node node = new Node(data);
        if ( head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
     }

     public void insertafternode(int data, int index){
         Node node = new Node(data);
         if (index == 0){
             addfirst(data);
             return;
         }
         Node temp = head;
         for (int i = 0; i<index-1; i++){
             temp = temp.next;
         }
         node.next = temp.next;
         temp.next = node;
     }

     public void printlist(){
         if (head == null){
             System.out.println("empty");
             return;
         }
         Node currenode = head;
         while (currenode!= null){
             System.out.print(currenode.data + "->");
             currenode = currenode.next;
         }
         System.out.println();
//         System.out.print("NULL");
     }

     public void reverselist(){
         if (head == null){
             System.out.println("empty");
         }
         Node currenode = head;
         while (currenode != null){
             currenode = currenode.next;
         }
         while (currenode != head){
             System.out.print(currenode.data + "<-");
             currenode = currenode.next;
         }
     }

     public void delete(int position){
         if (head == null){
             System.out.println("ll is empty");
         }
         if (head.next == null) {
             System.out.println("null");
         }
         Node temp = head;
         for (int i = 0; i<position-1; i++){
             temp = temp.next;
         }

             temp.next = temp.next.next;
     }
    public static void main(String[] args) {
        llist ct = new llist();
        ct.addfirst(56);
        ct.addfirst(74);
        ct.addfirst(45);
        ct.addfirst(12);
        ct.printlist();
        ct.insertafternode(88,2);
        ct.printlist();

        ct.delete(3);
        ct.printlist();

        ct.reverselist();
    }
}

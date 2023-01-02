package com.company;

public class stack_ll {
    public static class Node1{
        int data;
        Node1 next;

        Node1(int data){
            this.data = data;
            next = null;
        }
    }

    static class Stack{
        public static Node1 head = null;
        public static void push(int data){
            Node1 node = new Node1(data);
            if (head == null){
                head = node;
                return;
            }
            node.next = head;
            head = node;
        }

        public static boolean isempty(){
            return head == null;
        }

        public static int pop(){
            if (isempty()){
                return -1;
            }
            Node1 top = head;
            head = head.next;
            return top.data;
        }

        public static int peek(){
            if (isempty()){
                return -1;
            }
            Node1 top = head;
            return top.data;
        }



    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(45);
        stack.push(74);
        stack.push(41);
        stack.push(36);

        while (!stack.isempty()){
            System.out.println(stack.peek());
            stack.pop();

        }



    }
}

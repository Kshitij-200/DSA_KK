package com.company;
import  java.util.*;
import java.util.Stack;

public class stack_framework {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(74);
        s.push(96);
        s.push(12);
        s.push(56);
        s.pop();

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}

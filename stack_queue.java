package com.company;

import java.util.*;

public class stack_queue {
    public static void main(String[] args) {
//        Stack<Integer> st = new Stack<>();
//        st.push(56);
//        st.push(74);
//        System.out.println(st.pop());
        Queue<Integer> q = new LinkedList<>();
        q.add(56);
        q.add(74);
        System.out.println(q.remove());

        Deque<Integer> dq = new ArrayDeque<>();
    }
}

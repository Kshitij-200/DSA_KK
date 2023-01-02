package com.company;
import  java.util.*;
public class ll_framework {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(74);
        list.add(7);
        list.add(97);
        System.out.println(list);

        list.addFirst(15);
        System.out.println(list);
        System.out.println(list.get(0));

        if (list.get(2) == 7){
            System.out.println("found");
        }


    }
}

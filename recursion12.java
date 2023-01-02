package com.company;

public class recursion12 {

    static void recursion(int count){
        if (count == 5){
            return;
        }
        System.out.println(count);
        count++;
        recursion(count);
    }

    static void printName(String name, int n){
//        System.out.println("Kshitij Pratap Tomer");
        if (n == 11){
            return;
        }
        printName(name,n);
    }
    public static void main(String[] args) {
//        recursion(0);
        printName("Kshitij",10);
    }
}

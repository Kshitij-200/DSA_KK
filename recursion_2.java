package com.company;

public class recursion_2 {
    static void funBoth(int n){
        if (n == 0){
            return;
        }
        System.out.print(n + " ");
        funBoth(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        funBoth(5);
    }
}

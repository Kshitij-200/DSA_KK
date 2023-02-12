package com.company;

public class recursion_1 {
    static void printAll(int n){
        if (n == 6){
            return;
        }
        System.out.println(n + " ");
        printAll(n + 1);
    }

    static void nayatareeka(int n){
        if(n == 0){
            return;
        }
        nayatareeka(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        // print 5 to 1 (both inclusive)
        printAll(1);
//        nayatareeka(5);
    }
}

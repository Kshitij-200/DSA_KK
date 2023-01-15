package com.company;

public class bit_manupulations_1 {
    public static boolean isOdd(int n){
        return (n & 1) == 1;
    }
    public static void main(String[] args) {
        int n = 30;
        boolean ans = isOdd(n);
        System.out.println(ans);
    }
}

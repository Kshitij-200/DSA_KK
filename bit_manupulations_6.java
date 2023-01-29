package com.company;

public class bit_manupulations_6 {
    public static void main(String[] args) {
        int n = 17;
        boolean ans = (n & (n - 1)) == 0;
        System.out.println(ans);
    }
}

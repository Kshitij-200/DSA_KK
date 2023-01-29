package com.company;

public class bit_manupulations_5 {
    public static void main(String[] args) {
        int n = 4;
        int b = 10;

        int ans = (int)(Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
    }
}

package com.company;

public class recursion_5 {
    public static void main(String[] args) {
        int ans = productDigits(88);
//        System.out.println(ans);
        int n1 = 255;
        System.out.println(n1 / 10);
    }

    static int sumDigits(int n){
        if(n == 0){
            return 0;
        }

        return sumDigits(n / 10) + n % 10;
    }

    static int productDigits(int n){
        if (n % 10 == n){
            return n;
        }
        return (n % 10) * productDigits(n / 10);
    }
}

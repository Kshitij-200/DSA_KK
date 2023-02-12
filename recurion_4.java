package com.company;

public class recurion_4 {
    public static void main(String[] args) {
        int ans = sumAll(5);
        System.out.println(ans);
    }
    static int sumAll(int n){
        if(n == 0){
            return 0;
        }
        return n + sumAll(n - 1);
    }
}

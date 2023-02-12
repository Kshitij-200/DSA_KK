package com.company;

public class CountZeroes_recursion_9 {
    public static void main(String[] args) {
        int ans = countZeroes(3, 0);
        System.out.println(ans);
    }
    static int countZeroes(int n, int c){
        if(n == 0){
           return c;
        }
        int rem = n % 10;
        if (rem == 0){
            return countZeroes(n / 10, c+1);
        }
        return countZeroes(n / 10, c);
    }
}

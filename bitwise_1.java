package com.company;

public class bitwise_1 {
    public static void main(String[] args) {
        // Number entered is even or odd
        /*
        int a = 68;
        System.out.println(isOdd(a));
        */

        // Find the number in the given array which is appearing twice(approach when both +ve and -ve numbers are there)
        /*
        int [] arr = {-1,2,1,-2,4,-3,-4,3,5};
        System.out.println(Once(arr));
        */
        // Find the number in the given array which is appearing twice(General approach)
        int [] arr = {2 ,1 ,2 ,3 ,4 ,1 ,5 ,4 ,3};
        System.out.println(Primary(arr));
    }
    static boolean isOdd(int n){
        return (n&1) == 1;
    }
    static int Once(int [] n){
        int sum = 0;
        for (int i = 0; i < n.length; i++){
            sum = sum + n[i];
        }
        return sum;
    }
    static int Primary(int [] n){
        int unique = 0;
        for(int i : n){
            unique = unique ^ i;
        }
        return unique;
    }
}

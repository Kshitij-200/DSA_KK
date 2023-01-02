package com.company;

public class recursion {

    public static void print(int n){
        // 1 - 5
        if (n == 6){
            return;
        }
        System.out.print(n + "->");
        print(n+1);
    }

    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        if (n == 1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }

    public static void one25(int n){
        if (n == 6){
            return;
        }
        System.out.println(n);
        one25(n+1);

    }
    public static void reverse(int n){
        if (n == 0){
            return;
        }
        System.out.print(n + " ");
        reverse(n-1);
    }

    public static int sum(int n){
        if (n == 0){
            return 0;
        }
        return n + sum(n-1);
    }
    public static int sumOfDigits(int n){
        if (n == 0){
            return 0;
        }
        return (n%10) + sumOfDigits(n/10);
    }

    public static int product(int n){
        if (n == 0){
            return 1;
        }
        return n%10 * product(n/10);
    }
    public static void main(String[] args) {
    reverse(5);
    System.out.println("\n" + sum(100));
    System.out.println(sumOfDigits(55555));
    System.out.println(product(555));
    }
}

package com.company;

public class maths_for_dsa_1 {
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        else {
            int c = 2;
            while (c * c <= n){
                if (n % c == 0){
                    return false;
                }
                c++;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for (int i = 0; i<=10;i++){
            System.out.println(i + " " + isPrime(i) );
        }
    }
}

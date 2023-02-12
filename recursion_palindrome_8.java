package com.company;

public class recursion_palindrome_8 {
    static void palindrome(int n){
        int number = n;
        String str = Integer.toString(n);
        char firstDigit = str.charAt(0);
        int firstDigitInt = Character.getNumericValue(firstDigit);
        int start = firstDigitInt;
        int end = n % 10;
        while (start <= end){
            if (start == end) {
                start++;
                end++;
                System.out.println("Yes Palindrome");
                break;
            }
            else{
                System.out.println("Not Palindrome");
                break;
            }
        }

    }
    public static void main(String[] args) {
        palindrome(1);

    }
}

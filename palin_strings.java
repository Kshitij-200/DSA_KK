package com.company;

public class palin_strings {
    static boolean palinDrome(String str){
        if (str == null || str.length() == 0){
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i<=str.length()/2;i++){
            char a = str.charAt(i);
            char b = str.charAt(str.length() - 1 - i);
            if (a != b){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String name = "abcba";
        System.out.println(palinDrome(name));
    }
}

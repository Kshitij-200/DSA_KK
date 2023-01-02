package com.company;
import java.util.Scanner;
public class string_Search {

    static boolean Search(String name,char target){
        if (name.length() == 0){
            return false;
        }
        for (int i = 0; i<name.length(); i++){
            if (target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean Search2(String name,char target){
        if (name.length() == 0){
            return false;
        }
        for (char ch : name.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String name = "Kshitij";
        Scanner sc = new Scanner(System.in);
        char target = sc.next().charAt(0);
//        String target = sc.nextLine();
        boolean ans = Search2(name,target);
        System.out.println(ans);
    }
}

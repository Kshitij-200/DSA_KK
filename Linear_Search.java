package com.company;
import java.util.*;
public class Linear_Search {

    static boolean linearSearch(int arr[] ,int target){
        if (arr.length == 0){
            return false;
        }
        for (int element:arr){
            if (element == target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4,89,88,74,25,14,23,16,17,19};
        int target = sc.nextInt();
        boolean ans = linearSearch(arr , target);
        System.out.println(ans);
    }
}

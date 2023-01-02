package com.company;
import java.util.*;
public class Search_in_Range {

    static int searchRange(int arr[] ,int start, int end, int target){
        if (arr.length == 0){
            return -1;
        }
//        for (int element : arr){
//            if (target > start && target < end){
//                return 1;
//            }
        for (int i = 0; i<arr.length; i++){
            if (target >= arr[start] && target <= arr[end]){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {0,45,74,56,89,87,88,23,56};
        Scanner sc = new Scanner(System.in);

        System.out.println("Start value is:");
        int start = sc.nextInt();

        System.out.println("End value is");
        int end = sc.nextInt();
        int target = sc.nextInt();
        int ans = searchRange(arr,start,end,target);
        if (ans == 1){
            System.out.println("Present");
        }
        else {
            System.out.println("Not Present");
        }
    }
}

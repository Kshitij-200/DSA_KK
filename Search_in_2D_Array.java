package com.company;
import java.util.*;
public class Search_in_2D_Array {

    static int[] Search2d(int arr[][],int target){
        for (int row = 0; row< arr.length; row++){
            for (int col = 0; col<arr[row].length; col++){
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int Max2d(int arr[][]){
        int max = Integer.MIN_VALUE;
        for (int ints[] : arr){
            for (int elements : ints){
                if (elements > max){
                    max = elements;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[][] = {
                {45,74,89,25},
                {0,20,60,50},
                {0,1},
                {7,29}
        };
        Scanner sc = new Scanner(System.in);
//        int target = sc.nextInt();
//        int ans[] = Search2d(arr,target);
//        System.out.println(Arrays.toString(ans));
        int max = Max2d(arr);
        System.out.println(max);



    }
}

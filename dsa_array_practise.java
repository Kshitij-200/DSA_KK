package com.company;
import java.util.*;
public class dsa_array_practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        for (int row = 0; row<arr.length;row++){
            for (int col = 0; col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }

        for (int row = 0; row<arr.length;row++){
            for (int col = 0; col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}

package com.company;

import java.util.Arrays;

public class bubble_sort {
    public static void swap(int [] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void bubble(int [] arr){
        for (int i = 0; i<arr.length; i++){
            for (int j = 1; j< arr.length-i;j++){
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {8,1,5,6,0,7};
        bubble(arr);
        System.out.print(Arrays.toString(arr));

    }
}

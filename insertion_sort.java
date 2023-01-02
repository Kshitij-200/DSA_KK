package com.company;

import java.util.Arrays;

public class insertion_sort {
    public static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void insertion(int [] arr){
        for (int i = 0; i<arr.length-1;i++){
            for (int j = i+1; j>0; j--){
                if (arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {7, 8 , 2 ,3,5,7,6};
        insertion(arr);
        System.out.print(Arrays.toString(arr));


    }

}

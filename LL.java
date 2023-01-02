package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LL {
    public static void swap(int [] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static int Max(int [] arr,int first,int end){
        int max = first;
        for (int i = 0; i<=end; i++){
            if (arr[max]<arr[i]){
                max = i;
            }
        }
        return  max;
    }
    public static void SelectionSort(int [] arr){
        for (int i = 0; i< arr.length;i++){
            int last = arr.length -1-i;
            int max = Max(arr,0,last);
            swap(arr,max,last);
        }
    }
    public static void main(String[] args) {
        int [] arr = {8,1,7,2,0,5};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

package com.company;

import java.util.Arrays;

public class selection_sort {
    public static void swap(int [] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static int getMaxIndex(int [] arr, int start, int end){
        int max = start;
        for (int i = 0; i<=end; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void selection(int [] arr){
        for (int i = 0; i<arr.length; i++){
            int last =  arr.length - i - 1;
            int max = getMaxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,8,3,9,2,4,0,10};
        selection(arr);
        System.out.print(Arrays.toString(arr));
    }
}

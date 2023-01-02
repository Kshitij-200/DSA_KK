package com.company;

import java.util.Arrays;

//import static com.company.cyclic_sort.cyclic;


public class cyclic_sort_ques {
    public static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void cyclic(int [] arr){
        int i = 0;
        while (i<arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {5,2,3,1,0};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
}

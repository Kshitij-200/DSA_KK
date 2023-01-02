package com.company;

public class Min_num {

    static int Min(int arr[]){
        if (arr.length == 0){
            return -1;
        }
        int ans = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (ans>arr[i]){
                ans = arr[i];
//                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {0,45,74,56,89,87,88,23,56};
        int answ = Min(arr);
        if (answ == -1){
            System.out.println("Array size is 0");
        }
        else {
            System.out.println("Min Value is "+ answ);
        }
    }
}

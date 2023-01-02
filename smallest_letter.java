package com.company;

public class smallest_letter {
    public static int sml(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int size = arr.length;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid-1;
            }
        }
        return start % size;
    }
    public static void main(String[] args) {
        int [] arr = {5,10,15,20,25,30};
        int ans = sml(arr,29);
        System.out.println(ans);

    }
}

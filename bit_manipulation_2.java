package com.company;

public class bit_manipulation_2 {
    public static int findDuplicate(int [] arr){
        int ans = 0;

        for(int n:arr){
            ans = ans^n;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,3,2,4};
        System.out.println(findDuplicate(arr));
    }
}

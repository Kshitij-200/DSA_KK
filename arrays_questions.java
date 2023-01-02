package com.company;
import java.util.*;
public class arrays_questions {

    public static void swap(int a[],int start, int end){
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }

    public static void printArray(int array[]){
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void inputArray(int array[]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
    }
    public static int maxElement(int arr[]){
        int maxEle = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>maxEle){
                maxEle = arr[i];
            }
        }
        return maxEle;
    }
    public static void reverseArray(int a[]){
        int star = 0;
        int en = a.length-1;
        while (star<en){
            swap(a,star,en);
            star++;
            en--;
        }
    }
    public static void main(String[] args) {

        int [] array = new int[4];
        inputArray(array);
        printArray(array);
        swap(array,0,2);
        printArray(array);
        System.out.println(maxElement(array));
        reverseArray(array);









    }
}

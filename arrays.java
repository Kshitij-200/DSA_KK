package com.company;
import java.util.*;
public class arrays {
    public static void printList(int [] arr,int n){
        for (int i = 0; i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int insert,n,p ;
        System.out.println("Enter array size");
        n = sc.nextInt();
        int [] arr = new int[n];
        int [] arr1 = new int[n+1];


        System.out.println("Enter array elements");
        for (int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter index of inserted element");
        insert = sc.nextInt();

        System.out.println("Enter  inserted element");
        p = sc.nextInt();

        for (int i = 0; i<n+1; i++){                 // arr[] = 10, 20 ,30 ,40 ,50    m = 2 , p = 40
                                                     // arr1[] = 10, 20, 40,
            if (i<insert){
                arr1[i] = arr[i];
            }
            else if (i == insert){
                arr1[i] = p;
            }
            else {
                arr1[i] = arr[i-1];
            }
        }

        printList(arr1,n);





    }
}

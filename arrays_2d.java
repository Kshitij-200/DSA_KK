package com.company;
import java.util.*;
public class arrays_2d {
    public static void printArray(int a[]){
        for (int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void swapArray(int a[], int start, int end){
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }

    public static void reverseArray(int a[]){
        int start = a[0];
        int end = a.length -1;
        while (start < end){
            swapArray(a,start,end);
            start ++;
            end--;
        }
    }

    public static int Maximum(int a[]){
        int maxele = a[0];
        for (int i = 0 ; i<a.length; i++){
            if (a[i] > maxele){
                maxele = a[i];
            }
        }
        return maxele;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int [][] arr = new int[3][];

        for (int row = 0; row<arr.length; row++){
            for (int col = 0; col<arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        for (int row = 0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }




        int [][] arr = new int[3][3];

        System.out.println("Enter array_List elements");
        for (int row = 0; row<arr.length; row++){
            for (int col = 0; col<arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        for (int row = 0; row<arr.length; row++){
            for (int col = 0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        for (int row = 0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        for (int a[] : arr){
            System.out.println(Arrays.toString(a));
        }

        String [][] ar = new String[3][3];
        System.out.println("Enter elements in a string array_List");
        for (int row = 0; row<ar.length; row++){
            for (int col = 0; col<ar[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        for (String element[]:ar){
            System.out.println(Arrays.toString(ar));
        }
        */

//        int [][] arr = new int[3][3];
//
//        for (int i = 0; i< arr.length; i++){
//            for (int j = 0; j<arr[i].length; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i< arr.length; i++){
//            for (int j = 0; j<arr[i].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        for (int a[]:arr){
//            System.out.println(Arrays.toString(a));
//        }

//        int [] arra = new int[5];
//        System.out.println("Enter elements");
//        for (int i = 0; i< arra.length; i++){
//            arra[i] = sc.nextInt();
//        }
//
//        printArray(arra);
//        swapArray(arra,0,2);
//        printArray(arra);
//        System.out.println(Maximum(arra));
//        reverseArray(arra);


            Integer a = 100;
            Integer b = 100;
            System.out.println(a==b);
            a = 1000;
            b = 1000;
            System.out.println(a==b);













    }
}

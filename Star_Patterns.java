package com.company;

public class Star_Patterns {
    public static void pattern1(int n){
        for (int i = 1; i<=n;i++){
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for (int i = 1; i<=n;i++){
            for (int j = 1 ;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for (int i = 1; i<=n;i++){
            for (int j = 1; j<= n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for (int i = 1; i<=n;i++){
            for (int j = 1 ;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
        pattern3(5);
        pattern4(5);

    }

}

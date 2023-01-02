package com.company;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

public class hashing2 {
    static int distinct(int a[]){
        HashSet<Integer> s = new HashSet<>();
        for (int element : a){
            s.add(element);
        }
        return s.size();
    }

    static int intersect(int [] a,int [] b){
        int count = 0;
        HashSet<Integer> s = new HashSet<>();
        for (int element:a){
            s.add(element);
        }
        for (int element1:b){
            if (s.contains(element1)){
                count++;
                s.remove(element1);
            }
        }
        return s.size();
    }

    static int union(int [] a,int [] b){
        HashSet<Integer> s = new HashSet<>();
        for (int x:a){
            s.add(x);
        }
        for (int y:b){
            s.add(y);
        }
        return s.size();
    }
    public static void main(String[] args) {
        int [] a = {10,20,45,74,23,10};
        int [] b = {10,23,20,56,89,88};

        System.out.println(distinct(a));
        System.out.println(intersect(a,b));
        System.out.println(union(a,b));



    }
}

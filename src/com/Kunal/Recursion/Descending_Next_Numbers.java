package com.Kunal.Recursion;

public class Descending_Next_Numbers {
    public static void main(String[] args) {
       print(10);
    }
    public static void print(int n){
        if(n<1){
            return;
        }
        System.out.print(n +" ");
        print(n-1);
    }
}

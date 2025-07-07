package com.Kunal.Recursion;

public class Fibonacci_Number {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
    public static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-2)+fibo(n-1);
    }
}

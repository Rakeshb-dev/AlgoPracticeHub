package com.Kunal.Recursion;

public class Multiplication_Of_Digits {
    public static void main(String[] args) {
        System.out.println(multiply(121));
    }
    public static int multiply(int n){
        if(n<=9){
            return n;
        }
        return (n%10)*multiply(n/10);
    }
}

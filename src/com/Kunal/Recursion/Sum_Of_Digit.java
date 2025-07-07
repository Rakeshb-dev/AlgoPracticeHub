package com.Kunal.Recursion;

public class Sum_Of_Digit {
    public static void main(String[] args) {
        System.out.println(sum(121));
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sum(n/10);
    }
}

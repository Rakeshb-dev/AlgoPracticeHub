package com.geeks.Maths;

public class TrailingZeroOfFactorial {
    public static void main(String[] args) {
        System.out.println(countZero(251));
    }
    public static int countZero(int n){
        int res =0;
        for(int i =5;i<=n;i*=5){
            res = res+n/i;
        }
        return res;
    }
}


//time Complexity O(log N)
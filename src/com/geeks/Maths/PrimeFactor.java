package com.geeks.Maths;

public class PrimeFactor {
    public static void main(String[] args) {
        primePrimeFactor(450);
    }
    public static void primePrimeFactor(int n){
        if(n<=1) return;
        for(int i =2;i*i<=n;i++){
            while(n%i==0){
                System.out.print(i+" ");
                n/=i;
            }
        }
        if(n>1){
            System.out.print(n);
        }
    }
}

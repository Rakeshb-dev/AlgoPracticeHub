package com.geeks.Maths;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(4,6));
    }
    public static int lcm(int a ,int b){
        HCF h = new HCF();
        return a*b/ h.gcd(a,b);
    }
}

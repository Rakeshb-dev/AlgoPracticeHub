package com.General;

import java.util.Scanner;

public class String_Cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = sc.nextInt();
        System.out.println(cipher(s,a));
    }
    public static StringBuilder cipher(String s,int a){
        StringBuilder sc = new StringBuilder();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                char c= (char)(ch-a);
                if(c<'A'){
                    c+=26;
                }
                sc.append(Character.toLowerCase(c));
            }
            else if(Character.isLowerCase(ch)){
                char c= (char)(ch-a);
                if(c<'a'){
                    c+=26;
                }
                sc.append(Character.toUpperCase(c));
            }
            else{
                sc.append(ch);
            }
        }
        return sc;
    }
}

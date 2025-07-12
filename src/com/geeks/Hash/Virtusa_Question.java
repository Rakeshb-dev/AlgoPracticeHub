package com.geeks.Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/* Question is there is Array given with type integer we should sort them with the prime count of each value
 Example 121 mean count is 1, 999 means count is 0,721 mean count is 2
 So it should be sorted like this [999,121,721] */
public class Virtusa_Question {
    public static void main(String[] args) {
        int[] arr ={121,999,721};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int [] arr){
        Arrays.sort(arr);
        int count=0;
        int temp = arr[arr.length-1];
        while(temp>0){
            count++;
            temp/=10;
        }
        int Bucket=arr.length;
        ArrayList<LinkedList<Integer>> table = new ArrayList<>(Bucket);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i =0;i<Bucket;i++){
            table.add(new LinkedList<>());
        }
        for(int i =0;i<Bucket;i++){
            int j = prime(arr[i])%count;
            table.get(j).add(arr[i]);
        }
        for(int i =0;i<Bucket;i++){
            result.addAll(table.get(i));
        }
        for(int i =0;i<Bucket;i++){
            arr[i]=result.get(i);
        }
        return arr;
    }
    public static int prime(int a){
        int count =0;
        while (a>0){
            int digit = a%10;
            if(digit==2||digit==3||digit==5||digit==7){
                count++;
            }
            a/=10;
        }
        return count;
    }
}

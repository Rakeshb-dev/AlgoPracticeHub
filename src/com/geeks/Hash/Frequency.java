package com.geeks.Hash;
import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
     Array_Count a = new Array_Count();
     int[] arr = a.arr(14);
        frequency(arr);
    }
    public static void frequency(int[] arr){
       LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
       for(int x : arr){
           map.put(x,map.getOrDefault(x,0)+1);
       }
       for(Map.Entry<Integer,Integer> e: map.entrySet()){
           System.out.println(e.getKey()+" "+e.getValue());
       }
    }
}

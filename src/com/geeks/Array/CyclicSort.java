package com.geeks.Array;

import java.util.ArrayList;
import java.util.List;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr ={2,3,2,3,5};
        System.out.println(frequencyCount(arr));
    }
        public static List<Integer> frequencyCount(int[] arr) {
            ArrayList<Integer> list = new ArrayList<>();
            int[] ans = new int[arr.length+1];
            for(int i =0;i<arr.length;i++){
                ans[arr[i]]++;
            }
            for(int i =1;i<ans.length;i++){
                list.add(ans[i]);
            }
            return list;
        }
}

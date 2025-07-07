package com.geeks.Array;

public class Maximum_Consecutive_1s {
    public static void main(String[] args) {
     int[] arr ={1,0,1,1,1,1,0,1,1};
        System.out.println(count(arr));
    }
    public static int count(int[] arr){
        int max = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                count++;
            }
            else{
                max=Math.max(count,max);
                count =0;
            }
        }
       max= Math.max(count,max);

        return max;
    }
}

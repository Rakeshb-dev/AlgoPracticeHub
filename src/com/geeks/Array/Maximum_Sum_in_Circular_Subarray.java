package com.geeks.Array;
public class Maximum_Sum_in_Circular_Subarray {
    public static void main(String[] args) {
        int[] arr ={5,-2,3,4};
        System.out.println(sum(arr));
    }
    public static int sum(int[] arr){
        int result =arr[0];
        for(int i =0;i<arr.length;i++){
            int curMax=arr[i];
            int curSum= arr[i];
            for (int j = 1; j < arr.length; j++) {
                int index = (i+j)% arr.length;
                curSum+=arr[index];
                curMax=Math.max(curMax,curSum);

            }
            result = Math.max(result,curMax);
        }
        return result;
    }
}

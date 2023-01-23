package com.saumya;

public class binary_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 6;
        int res = search(arr,target);
        System.out.println(res);
    }
    public static int search(int[] arr, int target) {
        int start = 0 ;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] > target){
                end = mid-1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else
                return mid;
        }
        return -1;
    }
}

/*
Working:
1 2 3 4 5 6 target = 6
1) mid = 2  ( arr[2] != 6 , arr[2] < target == true)
2)start = 3 end = arr.length-1 (same) (start <= end)
3)4 5 6
4)mid = 4 (arr[4] != 6 , arr[4] < target == true
5)mid = 5 arr[5] == 6 (else condition will be executed)
 */


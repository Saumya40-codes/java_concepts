package com.saumya;

import java.util.Arrays;

public class max_heap {
    public static void max_heap(int[] arr , int n , int value){
        arr[n] = value;
        int i = n;
        while (i > 1){
           int parent_node  = (int)Math.floor(i/2);
           if(arr[parent_node] < arr[i]) {
               int temp = arr[parent_node];
               arr[parent_node] = arr[i];
               arr[i] = temp;
               i = parent_node;
           }
           else
               return;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 100;
        arr[1] = 90;
        arr[2] = 80;
        max_heap(arr,3,110);  //[100, 110, 80, 90]
    }
}
                       /*  Structure of nodes initially looks like this
                              100                    arr = {100,90,80}
                          90       80

                          But after insertion it should be looking like
                              110
                         100       80                arr = {110,100,80,90}
                      90
 */
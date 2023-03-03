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
    public static void del_max_heap(int[] arr , int n ,int i){
       int temp = arr[i];
       arr[i] = arr[n];
       while(i < n-1){
           int child1 = 2*i;
           int child2 = 2*i + 1;
           if(child1 < n-1 && child2 < n-1) {
               int large = arr[child1] > arr[child2] ? child1 : child2;
               if (arr[large] > arr[i]) {
                   int new_temp = arr[i];
                   arr[i] = arr[large];
                   arr[large] = new_temp;
                   i = large;
               }
           }
               else
                    break;
       }
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 100;
        arr[1] = 90;
        arr[2] = 80;
        max_heap(arr,3,110);  //[100, 110, 80, 90]

        // FOR DELETION
        int[] new_arr = {0,100,90,80,70,60,65,55};

        del_max_heap(new_arr, new_arr.length-1,1);
    }
}
                       /*   INSERTION

                        Structure of nodes initially looks like this
                              100                    arr = {100,90,80}
                          90       80

                          But after insertion it should be looking like
                              110
                         100       80                arr = {110,100,80,90}
                      90

                            DELETION

                         Structure of nodes initially looks like this:
                         {0,100,90,80,70,60,65,55};

                          AFTER DELETION IT SHOULD LOOK LIKE:
                          {0,90,70,80,55,60,65}

 */
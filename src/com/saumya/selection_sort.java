package com.saumya;

import java.util.Arrays;
import java.util.Scanner;

//In selection sort in every successive iteration smallest element comes to next first position of an array i.e. smallest element will come to first position , second smallest element to the second position and so on
public class selection_sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }                                // 20 10 40 30 50
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));  //10 20 30 40 50
    }
}
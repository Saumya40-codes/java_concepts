package com.saumya;

import java.util.Arrays;
import java.util.Scanner;

//bubble sort is another sorting algorithm and one of the efficient ones

public class bubblesort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt(); // 4 5 6 3
        }
        boolean hasSwap = true;
        while(hasSwap){
            hasSwap = false;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    hasSwap = true;
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr)); // 3 4 5 6
    }
}

// TIme complexity : O(n^2)
// Space complexity : O(1)

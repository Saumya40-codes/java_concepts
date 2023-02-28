package com.saumya;

import java.util.Arrays;

public class recursion {
    //factorial
    public static int fact(int n){
        if(n==1)
            return n;
        return n*fact(n-1);
    }
    //fibonacci
    public static int fib(int l){
        if(l==1 || l==0)
            return l;
        return fib(l-1) + fib(l-2);
    }

    //binary search
    public static int bs(int[] arr,int start,int end,int target){
        if(start>end)
            return -1;
        int mid = start + (end-start)/2;
        if(arr[mid]==target)
            return mid;
        if(arr[mid] > target) {
            return bs(arr, start, mid - 1, target);
        }
        return bs(arr,mid+1,end,target);
    }
    //palindrome
    public static boolean pal(String a,int end,int start){
        if(start >= end)
            return true;
        if(a.charAt(start) != a.charAt(end))
            return false;
        return pal(a,end-1,start+1);
    }
    //gcd
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    //lcm
    public static int lcm(int a , int b){
        return (a/gcd(a,b))*b;
    }

    //reversing array
    public static int[] rev(int[] arr , int s , int e){
        int temp = 0;
        if(s>=e)
            return arr;
        else {
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
        }
        return rev(arr, s + 1, e - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(4)); //24
        for (int i = 0; i < 10; i++) {
            System.out.print(fib(i)+" "); //first 10 fibonacci numbers
        } //0 1 1 2 3 5 8 13 21 34
        System.out.println();
        int[] arr = {1,2,3,4,5,6};
        System.out.println(bs(arr,0,arr.length-1,10)); //-1
       String a = "noon";
        System.out.println(pal(a,a.length()-1,0)); //true
        System.out.println(gcd(12,24)); //12
        System.out.println(lcm(12,24)); //24
        System.out.println(Arrays.toString(rev(arr,0,arr.length-1)));  //[6, 5, 4, 3, 2, 1]
    }
}

package com.saumya;
//solving fibonacci using dynamic programming: recurssion and memoization
public class DP {
    private static int fibo(int n, int[] dp){
        if(n == 1|| n==0){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = fibo(n-1, dp) + fibo(n-2, dp); // memoization
        return dp[n];
    }
    public static void main(String[] args) {
       int n = 10;
       int[] arr = new int[n+1];
        System.out.println(fibo(n, arr));
        // TC : O(n)
        // SC : O(n) + O(n) = O(n)

        // bottom up approach
        int x  = 10;
        int[] dp = new int[x+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= dp.length; i++) {
            dp[n] = dp[n-1] + dp[n-2];
        }

        // TC : O(n)
        // SC : O(n)

        //space optimized

        int y = 10;
        int prev2 = 0;
        int prev1 = 1;
        for (int i = 2; i <= y; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        System.out.println(prev1);
        // TC : O(n)
        // SC : O(1)
    }
}

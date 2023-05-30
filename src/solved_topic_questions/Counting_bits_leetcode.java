package solved_topic_questions;
//Leetcdode 338 : Counting Bits
//https://leetcode.com/problems/counting-bits/

import java.util.Arrays;

public class Counting_bits_leetcode {
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
        dp[0] = 0;
        if(n != 0){
            dp[1] = 1;
        }
        for(int i = 2; i< dp.length ; i++){
            if(i%2 == 0){
                int index = i/2;
                dp[i] = dp[index];
            }
            else{
                int index = i-1;
                dp[i] = dp[index] + 1;
            }
        }
        System.out.println(Arrays.toString(dp));
    }
}

/* leeetcode solution
class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        if(n != 0){
        dp[1] = 1;
        }
        for(int i = 2; i< dp.length ; i++){
            if(i%2 == 0){
                int index = i/2;
                dp[i] = dp[index];
            }
            else{
                int index = i-1;
                dp[i] = dp[index] + 1;
            }
        }
        return dp;
    }
}
 */
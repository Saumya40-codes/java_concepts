package solved_topic_questions;

/*
There is a frog on the '1st' step of an 'N' stairs long staircase.
The frog wants to reach the 'Nth' stair. 'HEIGHT[i]' is the height of the '(i+1)th' stair.
If Frog jumps from 'ith' to 'jth' stair, the energy lost in the jump is given by absolute value of ( HEIGHT[i-1] - HEIGHT[j-1] ).
If the Frog is on 'ith' staircase, he can jump either to '(i+1)th' stair or to '(i+2)th' stair.
Your task is to find the minimum total energy used by the frog to reach from '1st' stair to 'Nth' stair.


 */


public class FrogJump_dp3 {
    private static int minEnergy(int n, int[] arr, int[] dp){
        if(n  == 0){
            return 0;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        int left = minEnergy(n-1, arr, dp) + Math.abs(arr[n] - arr[n-1]);
        int right = Integer.MAX_VALUE;
        if(n > 1) {
            right = minEnergy(n - 2, arr, dp) + Math.abs(arr[n] - arr[n - 2]);
        }

        dp[n] = Math.min(left, right);
        return dp[n];
    }
    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 20};
        int n = arr.length - 1;
        int[] dp = new int[n+1];
        System.out.println(minEnergy(n, arr, dp)); //top down approach

        // TC : O(n)
        // SC : O(n) + O(n) = O(n)

        // bottom up approach
        int[] dp_temp = new int[n+1];
        dp_temp[0] = 0;

        for (int i = 1; i < n; i++) {
            int left = dp_temp[i-1] + Math.abs(arr[i] - arr[i-1]);
            int right = Integer.MAX_VALUE;
            if(i > 1) {
                right = dp_temp[i - 2] + Math.abs(arr[i] - arr[i - 2]);
            }
            dp_temp[i] = Math.min(left, right);
        }
        System.out.println(dp_temp[n-1]);

        // TC : O(n)
        // SC : O(n)

        // space optimized
        int prev1 = 0;
        int prev2 = 0;
        for(int i = 1; i < n ;i++){
            int left = prev1 + Math.abs(arr[i] - arr[i-1]);
            int right = Integer.MAX_VALUE;
            if(i > 1) {
                right = prev2 + Math.abs(arr[i] - arr[i - 2]);
            }
            int curr = Math.min(left, right);
            prev2 = prev1;
            prev1 = curr;
        }
        System.out.println(prev1);

        // TC : O(n)
        // SC : O(1)
    }
}






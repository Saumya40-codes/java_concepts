package solved_topic_questions;
//Leetcdode 121 : Best Time to Buy and Sell Stock
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class leetcode_121 {
    public static void main(String[] args) {
        int buy = Integer.MAX_VALUE;;
        int profit = 0;
        int[] tc_1_arr = {7,1,5,3,6,4};
        for (int i = 0; i < tc_1_arr.length; i++) {
            buy = Math.min(buy, tc_1_arr[i]);
            profit = Math.max(profit, tc_1_arr[i] - buy);
        }
        System.out.println(profit);
    }
}
// approach: buy the stock at the lowest price and sell it at the highest price
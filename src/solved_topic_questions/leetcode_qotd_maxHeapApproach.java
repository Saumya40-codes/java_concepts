/* Leetcode Question: 1046. Last Stone Weight
You are given an array of integers stones where stones[i] is the weight of the ith stone.

We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:

If x == y, both stones are destroyed, and
If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
At the end of the game, there is at most one stone left.

Return the weight of the last remaining stone. If there are no stones left, return 0.
 */

package solved_topic_questions;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class leetcode_qotd_maxHeapApproach {
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1}; //just for the reference of the question
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : stones) {
            queue.offer(i);
        }
        while(queue.size() > 1){
            int dif = queue.poll() - queue.poll();

            if(dif != 0){
                queue.offer(dif);
            }
        }
        System.out.println(queue.isEmpty() ? 0 : queue.poll());
    }
}
/*
Leetcode Solution:
class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i =0 ; i < stones.length ; i++){
            queue.offer(stones[i]);
        }
        while(queue.size() > 1){
            int dif = Math.abs(queue.poll() - queue.poll());
            if(dif != 0){
                queue.offer(dif);
            }
        }
        if(queue.size() > 0){
            return queue.poll();
        }
        return 0;
    }
}
 */
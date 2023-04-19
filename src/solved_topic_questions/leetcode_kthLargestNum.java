package solved_topic_questions;

/* Medium difficulty question
You are given an array of strings nums and an integer k. Each string in nums represents an integer without leading zeros.

Return the string that represents the kth largest integer in nums.

Note: Duplicate numbers should be counted distinctly. For example, if nums is ["1","2","2"], "2" is the first largest integer, "2" is the second-largest integer, and "1" is the third-largest integer.
 */



import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class leetcode_kthLargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] num = new String[10]; //default size here is just for reference
        int k = in.nextInt();

        for (int i = 0; i < num.length; i++) {
            num[i] = in.next();
        }

        //implementing
        Queue<String> queue = new PriorityQueue<>((a,b) -> a.length() == b.length() ? a.compareTo(b) : Integer.compare(a.length(),b.length()));
        for(String s: num){
            queue.offer(s);
            if(queue.size() > k){
                queue.poll();
            }
        }
        System.out.println(queue.peek()); //or queue.poll()
    }
}
// solution submitted on leetcode

/*
Leetcode Solution:
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Queue<String> queue = new PriorityQueue<>((a,b) -> a.length() == b.length() ? a.compareTo(b) : Integer.compare(a.length(),b.length()));

        for(String s : nums){
          queue.offer(s);
          if(queue.size() > k){
            queue.poll();
          }
        }
        return queue.poll();
    }
}
 */
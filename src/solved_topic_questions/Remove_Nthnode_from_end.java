package solved_topic_questions;

public class Remove_Nthnode_from_end {
}
// leetcode solution

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//class Solution {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        ListNode right = head;
//        ListNode left = dummy;
//
//        while(n > 0 && right != null){
//            right = right.next;
//            n--;
//        }
//        while(right != null){
//            left = left.next;
//            right = right.next;
//        }
//        left.next = left.next.next;
//
//        return dummy.next;
//    }
//}
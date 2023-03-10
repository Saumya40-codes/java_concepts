package solved_topic_questions;

/*
Merge Sort : In this there are two sorted array given A and B . You have to make one sorted array out of both of this

// leetcode question 88
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Code:
(using two pointers)
*/
import java.util.Arrays;
public class mergesort_leetcodequestion {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m+n-1 , a = m-1 ,b = n-1 ; b >= 0 ; i--){
            if(a>= 0 && nums1[a] > nums2[b])
            nums1[i] = nums1[a--];
            else
            nums1[i] = nums2[b--];
        }
        System.out.println(Arrays.toString(nums1));
    }
}

//Time complexity O(n+m)
//Space complexity O(1)
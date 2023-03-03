package solved_topic_questions;

/* daily question 3
You are given an array of n strings strs, all of the same length.

The strings can be arranged such that there is one on each line, making a grid. For example, strs = ["abc", "bce", "cae"] can be arranged as:

abc
bce
cae
You want to delete the columns that are not sorted lexicographically. In the above example (0-indexed), columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted while column 1 ('b', 'c', 'a') is not, so you would delete column 1.

Return the number of columns that you will delete.

 

Example 1:

Input: strs = ["cba","daf","ghi"]
Output: 1
Explanation: The grid looks as follows:
  cba
  daf
  ghi
Columns 0 and 2 are sorted, but column 1 is not, so you only need to delete 1 column.
Code:
*/ 
public class leetcode_dailyquestion3 {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        for(int i = 0 ; i < strs[0].length() ; i++){
            for(int j = 1 ; j < strs.length ; j++){
                if(strs[j-1].charAt(i) > strs[j].charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}

//for lexographically arranged every element in column 0 needs to be smaller then its respective element in column 1
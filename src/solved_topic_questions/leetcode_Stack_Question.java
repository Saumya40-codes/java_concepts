/* Question
You are given a string s, which contains stars *.

In one operation, you can:

Choose a star in s.
Remove the closest non-star character to its left, as well as remove the star itself.
Return the string after all stars have been removed.

Note:

The input will be generated such that the operation is always possible.
It can be shown that the resulting string will always be unique.


Leetcode Question 2390. Removing Stars From a String
Difficulty: Medium
 */
package solved_topic_questions;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

public class leetcode_Stack_Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        StringBuilder str = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i  < s.length() ; i++){
            char x = s.charAt(i);
            if(x == '*'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }

        //adding the remaining characters back to the main string
        while(!stack.isEmpty()){
            str.append(stack.peek());
            stack.pop();
        }

        str.reverse();

        System.out.println(str.toString());
    }
}

/*
Leetcode Solution:

class Solution {
    public String removeStars(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i  < s.length() ; i++){
            char x = s.charAt(i);
            if(x == '*'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }


        //adding the remaining characters back to the main string
        while(!stack.isEmpty()){
            str.append(stack.peek());
            stack.pop();
        }

        str.reverse();

        return str.toString();
    }
}
 */

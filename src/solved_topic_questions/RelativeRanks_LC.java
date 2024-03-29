package solved_topic_questions;

//Leetcdode 506 : Relative Ranks
//https://leetcode.com/problems/relative-ranks/

import java.util.*;
public class RelativeRanks_LC {
    public static void main(String[] args) {
        int[] score = {10,3,8,9,4};
        Queue<Integer> queue = new PriorityQueue<>((a,b) ->(score[b]-score[a]));
        String[] arr = new String[score.length];

        for(int i = 0 ; i < score.length ; i++){
            queue.add(i);
        }
        System.out.println(queue);


        int count = 1;
        while(!queue.isEmpty()){
            int curr = queue.poll();
            if(count == 1){
                arr[curr] = "Gold Medal";
                count++;
            }
            else if(count == 2){
                arr[curr] = "Silver Medal";
                count++;
            }
            else if(count == 3){
                arr[curr] = "Bronze Medal";
                count++;
            }
            else{
                arr[curr] = Integer.toString(count++);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
/*
Leetcode solution

class Solution {
    public String[] findRelativeRanks(int[] score) {
        Queue<Integer> queue = new PriorityQueue<>((a,b) ->(score[b]-score[a]));
        String[] arr = new String[score.length];

        for(int i = 0 ; i < score.length ; i++){
            queue.add(i);
        }
        int count = 1;
        while(!queue.isEmpty()){
            int curr = queue.poll();
            if(count == 1){
                arr[curr] = "Gold Medal";
                count++;
            }
            else if(count == 2){
                arr[curr] = "Silver Medal";
                count++;
            }
            else if(count == 3){
                arr[curr] = "Bronze Medal";
                count++;
            }
            else{
                arr[curr] = Integer.toString(count++);
            }
        }
        return arr;
    }
}
 */
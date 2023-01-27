/*
2244. Minimum Rounds to Complete All Tasks
Medium

You are given a 0-indexed integer array tasks, where tasks[i] represents the difficulty level of a task. In each round, you can complete either 2 or 3 tasks of the same difficulty level.

Return the minimum rounds required to complete all the tasks, or -1 if it is not possible to complete all the tasks.

 

Example 1:

Input: tasks = [2,2,3,3,2,4,4,4,4,4]
Output: 4
Explanation: To complete all the tasks, a possible plan is:
- In the first round, you complete 3 tasks of difficulty level 2. 
- In the second round, you complete 2 tasks of difficulty level 3. 
- In the third round, you complete 3 tasks of difficulty level 4. 
- In the fourth round, you complete 2 tasks of difficulty level 4.  
It can be shown that all the tasks cannot be completed in fewer than 4 rounds, so the answer is 4.

code:
*/
class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);   //sorting the elements
        HashMap<Integer , Integer> map = new HashMap<>();
        if(tasks.length < 2){   //as task >=2 wont be solved in this case
        return -1;
        }
        for (int t : tasks){    // here t will be value of tasks array from index 0 to tasks.length-1
        map.put(t, map.getOrDefault(t, 0) + 1);
        }
        int count = 0;
        for(int i : map.keySet()){   
            if(map.get(i) == 1){
            return -1;
            }
            if(map.get(i) == 2 || map.get(i) == 3){ 
                count++;
            }
            if(map.get(i)>3){
            count += (map.get(i)+2)/3;  //if it exceeds 3 the for e.g. (4+2)/3 = 2 i.e count will be incremented by 2 directly(alternative of ceil function )
            }   
    }
    return count;
}
}
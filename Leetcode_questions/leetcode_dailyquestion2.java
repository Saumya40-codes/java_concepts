/* 
We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

 

Example 1:

Input: word = "USA"
Output: true
-------------------------------------------------------------------------------------------------------------------
Approach:
Made a new String 'letter' which takes individual letters from string 'word' at index i and convert it to UpperCase
-> Now we will check if the character at index i is capital or not and if it is then we increase cap_count by one
-> According to the given question the given word is capital if:
all letters are capital i.e. (cap_count == words.length)
->None are capital i.e.(cap_count == 0)
or
->First letter is capital i.e. (cap_count == 1 && word.charAt(0) == letter.charAt(0))

Code :
*/
class Solution {
    public boolean detectCapitalUse(String word) {
        int cap_count = 0;
        String letter = "";
        for(int i = 0 ; i < word.length() ; i++){
            letter += word.charAt(i);
            letter =  letter.toUpperCase();
            char cr = letter.charAt(i);
            if(word.charAt(i) == cr)
            cap_count++;
        }
        if(cap_count == 0 || cap_count == word.length() || (cap_count == 1 && word.charAt(0) == letter.charAt(0))){
        return true;
        }
        return false;
    }
}

package solved_topic_questions;/*
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
for e.g.
Input: pattern = "abba", s = "dog cat cat dog"
Output: true

*/
import java.util.HashMap;
//Solution:
public class leetcode_dailyquestion1 {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");   //making String array to store the given string individually and also spliting white spaces in between them
        char[] txt = pattern.toCharArray(); //converting this String into char array
        if(txt.length != arr.length){        // if length of pattern and string isnt same then output will be false only
        return false;
        }
        HashMap<String , Character> strtochar = new HashMap<>();  // Made maps of key str and value char and
        HashMap<Character , String> chartostr = new HashMap<>();  // key char and value str
        for(int i = 0 ; i < txt.length ; i++){
            String wrd = arr[i];                            
            char cr = txt[i];

            if(!strtochar.containsKey(wrd)){                     //making a key or assigning it if there is no key of str 'wrd' in map 
                strtochar.put(wrd,cr);
            }
            if(!chartostr.containsKey(cr)){                      //making a key or assigning it if there is no key of char 'cr' in map 
                chartostr.put(cr,wrd);
            }
            if(!strtochar.get(wrd).equals(cr) || !chartostr.get(cr).equals(wrd)){  //if value mapped to wrd or to cr is not same as assigned value to cr and wrd at first output fill be false
                return false;
            }
        }
        return true;           // there will be same pattern if above all conditions are false
    }
}



/*
taking the first example....
for first itteration i.e. at i = 0
->wrd = dog and cr = a
now at first there will be no mapping of any of this therefore for first condition
->strtochar.put(wrd,cr) therefore dog = a
and similarly in secong condition
-> a = dog 
now in final if codition
if maping of wrd i.e dog is not same as cr i.e a and opposite for the OR condition if any one of this becomes false the output will be false
which in this case the condition isnt true
therefore there is a pattern
*/

/* problem 1097
Question:

Petr has just bought a new car. He's just arrived at the most known Petersburg's petrol station to refuel it when he suddenly discovered that the petrol tank is secured with a combination lock!
The lock has a scale of 360 degrees and a pointer which initially points at zero:


Petr called his car dealer, who instructed him to rotate the lock's wheel exactly n
 times. The i-th rotation should be ai degrees, either clockwise or counterclockwise, and after all n rotations the pointer should again point at zero.

This confused Petr a little bit as he isn't sure which rotations should be done clockwise and which should be done counterclockwise. As there are many possible ways of rotating the lock, help him and find out whether there exists at least one, such that after all n
 rotations the pointer will point at zero again.

 */


package solved_topic_questions;

import java.util.Scanner;

public class codeforces_1097B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int sum = 0;
        boolean lock = true;
        for (int i = 0; i < (1<<n); i++) {
            if(lock){
                for (int j = 0; j < n; j++) {
                    if((i&(1<<j)) != 0){
                        sum += arr[j];
                    }
                    else
                        sum -= arr[j];
                }
                if(sum % 360 == 0) {
                    lock = false;
                    break;
                }
                else
                    sum = 0;
            }
        }
        if(lock)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
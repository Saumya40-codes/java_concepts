import java.util.Scanner;
public class CC{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	for(int i = 0 ; i < N ; i++){
	   int Q = in.nextInt();
	   String bin = in.next();
           int count = 0;
	for(int j = 0 ; j < bin.length() ; j++){
           if(bin.charAt(j) == '1')
		count++;
	}
        if((count<=3 && count > 1) || (count == 1 && bin.length() >=3) )
	      System.out.println("YES");
        else
	      System.out.println("NO");
    }
}

/*
Question:
Chef is given a number in form of its binary representation S, having length N.
Determine if the number can be represented as a sum of exactly three non-negative powers of 2.Please refer to samples for further explanation.
Note that S will NOT contain leading zeros.
Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains a single integer 
N, the length of the binary string.
The next line contains the string S, the binary representation of a number.

Sample 1:
Input
4
1
1
4
1001
5
11001
7
1101101
Output
NO
YES
YES
NO
*/
/*
Approach
if number of ones in the given binary string is 2 or 3 then we can easily represent them in three of 2 powers form . In the case of one it is only possible if length 
of string is >= 3. if ones are > 3 it wont be possible to arrange them in three of 2 powers form.
*/

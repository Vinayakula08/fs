/*
You have d dice, and each die has f faces numbered 1, 2, ..., f.
Return the number of possible ways (out of fd total ways) modulo 10^9 + 7 to roll the dice so the
sum of the face up numbers equals target.

Example 1:
Input: d = 1, f = 6, target = 3
Output: 1
Explanation: 
You throw one die with 6 faces.  There is only one way to get a sum of 3.


input =
1 6 3
output = 1
first read d value, followed by f value and target value


Example 2:
2 6 7
output =6

d = 2, f = 6, target = 7
Output: 6
Explanation: 
You throw two dice, each with 6 faces.  There are 6 ways to get a sum of 7:
1+6, 2+5, 3+4, 4+3, 5+2, 6+1.

Example 3:
input =2 5 10
output =1

d = 2, f = 5, target = 10
Output: 1
Explanation: 
You throw two dice, each with 5 faces.  There is only one way to get a sum of 10: 5+5.

Example 4:
Input: d = 1, f = 2, target = 3
Output: 0
Explanation: 
You throw one die with 2 faces.  There is no way to get a sum of 3.
*/
import java.util.*;
class Main{
    static int result(int count, int d, int f, int k){
        if(count==d){
            if(k==0) return 1;
            return 0;
        }
        int res = 0;
        for(int i=1;i<=k;i++){
            if(i<=f) res = res + result(count+1,d,f,k-i);
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int f = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(result(0,d,f,k));
    }
}
/*

There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.

In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.

Your score is the sum of the points of the cards you have taken.

Given the integer array cardPoints and the integer k, return the maximum score you can obtain.

input =7
1 2 3 4 5 6 1
3
output =12

Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. 
The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.


input =3
2 2 2 
2
output =4

Explanation: Regardless of which two cards you take, your score will always be 4.

input =7
9 7 7 9 7 7 9
7
output =55
Explanation: You have to take all the cards. Your score is the sum of points of all cards.

*/
import java.util.*;
class Main{
    public static void main(String[] arf)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.print(result(n,a,k));
    }
    public static int result(int n, int[] a, int k)
    {
        int i = 0;
        int j = n-1;
        int s = 0;
        while(i<=j && k>0)
        {
            if(a[i]>a[j])
            {
                s = s + a[i++];
                k--;
            }
            else
            {
                s = s + a[j--];
                k--;
            }
        }
        return s;
    }
} 
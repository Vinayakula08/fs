// <!-- For Siddarth's Birthday his friends planned cake cutting.
// On top of the cake there are two lines of candles, 
// all the candles with different heights. 
// The lines are parallel lines, line-P and line-Q .
// Siddarth has to blow all the candles in one go.

// So, he can swap one candle at a time, from P and Q and 
// the position of the candles in their line should be same.

// At the end of the swaps, The candles in set P and set Q, 
// should be in ascending order of their heights.

// You will be heights of the candles initially in P and Q, after placing in parallel lines.

// Your task is to find the minimum number of swaps required
// to arrange the candles in P and Q in ascending orer.

// Note: It is guaranteed that the answer is always possible.

// Input Format:
// -------------
// Line-1: An integer N, num of candles in P and Q.
// Line-2: N space separated integers, heights of the candles in Line-P.
// Line-3: N space separated integers, heights of the candles in Line-Q.

// Output Format:
// --------------
// Print an integer, minimum number of swaps required.


// Sample Input-1:
// ---------------
// 4
// 1 3 5 4
// 1 2 3 7

// Sample Output-1:
// ----------------
// 1

// Explanation:
// ------------
// Swap the 4th candle in P and Q. 
// Then the heights of the candles in P = [1, 3, 5, 7],  Q = [1, 2, 3, 4]
// Both are in ascending order. -->

import java.util.*;
class Main{
    static ArrayList<Integer> l = new ArrayList<>();
    static boolean isValid(int[] a, int[] b){
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1] || b[i]<b[i-1]){
                return false;
            }
        }
        return true;
    }
    static void swap(int[] a, int[] b, int i, int j){
        int t = a[i];
        a[i] = b[j];
        b[j] = t;
    }
    static void result(int n, int[] a, int[] b,int i, int j){
        if(i==n){
            if(isValid(a,b)){
                l.add(j);
            }
            return;
        }
        swap(a,b,i,i);
        result(n,a,b,i+1,j+1);
        swap(a,b,i,i);
        result(n,a,b,i+1,j);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i] = sc.nextInt();
        }
        result(n,a,b,0,0);
        System.out.println(Collections.min(l));
        
    }
}
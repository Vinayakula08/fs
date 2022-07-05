// Gunith is interested in series and sequence problems in Maths.
// Gunith is given an array A of integers, he wants to find out 
// a Sequence, which is long and subsequence of given array.

// Subsequence AS is the list AS[i], AS[i1], AS[i2], .... AS[ik], from the array, 
// where 0 <= i< i1 < i2 < ..<ik < A.length

// The sequence S has to follow this rule, S[i+1] - S[i] are all the same value 
// (for 0 <= i < S.length - 1 ), and Sequence S can be formed from A

// Find out the Max possible length of the Longest Sequence.

// Input Format:
// -------------
// Line-1 -> An integer N, number of array elements
// Line-2 -> N space separated integers, elements of the array.

// Output Format:
// --------------
// Print an integer as your result.


// Sample Input-1:
// ---------------
// 4
// 2 6 10 14

// Sample Output-1:
// ----------------
// 4


// Sample Input-2:
// ---------------
// 7
// 2 5 6 8 10 11 14

// Sample Output-2:
// ----------------
// 5

// Explanation:
// ------------
// The longest possible arithmetic series is 2 5 8 11 14.
import java.util.*;
class Main{
    static int findmax(ArrayList<Integer> l, int diff){
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(int i=0;i<l.size();i++){
            if(map.containsKey(l.get(i)-diff)){
                map.put(l.get(i),map.get(l.get(i)-diff)+1);
            }
            else{
                map.put(l.get(i),1);
            }
            max = Math.max(max,map.get(l.get(i)));
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        int max = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                ArrayList<Integer> l = new ArrayList<>();
                l.add(a[i]);
                l.add(a[j]);
                for(int k=j+1;k<n;k++){
                    l.add(a[k]);
                }
               int x = findmax(l,a[j]-a[i]);
               max = Math.max(max,x);
            }
        }
        System.out.println(max);
    }
}
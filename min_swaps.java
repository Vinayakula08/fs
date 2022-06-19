// Mr X is a teacher of maths. He came across a very simple problem. 
// In the problem you have to arrange the numbers in an ascending order and calculate the total number of swaps required. 
// The number of swaps must be minimum. 
// But Mr X is busy with some other tasks and you being his favourite student , so he asks you to solve this problem.

// Input Format
// First line contains the number n.
// n space separated integers

// Constraints
// 1<=T<=100
// 1<=N<=100
// 1<=A[ ] <=1000

// Output Format
// Print the answer on the first line

// input =4
// 4 3 1 2
// output =2
 
// Explanation
// Swap index 0 with 3 and 1 with 2 to form the sorted array {1, 2, 3, 4}.

import java.util.*;;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(swaps(n,a));
    }
    static int swaps(int n,int[] a){5

        int[] temp=Arrays.copyOfRange(a,0,n);
        Arrays.sort(temp);
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]!=temp[i]){
                count++;
                swap(a,i,index(a,temp[i]));
            }
        }
        return count;
    }
    static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static int index(int[] a, int k){
        for(int i=0;i<a.length;i++){
            if(a[i]==k){
                return i;
            }
        }
        return -1;
    }
}
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){

        }
    }
}
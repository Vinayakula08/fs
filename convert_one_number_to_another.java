// Ramesh is playing a game with two numbers,that he had to change one to another. 
// but then he has given a set of other numbers, using these numbers he can allowed
// to changed step by step by changing one digit in the number each time in the number.

// You have to predict how many turns he will take to change first number to 
// second number. 

// If it is impossible to change there, print -1.

// Input Format:
// Two strings in first two lines as numbers
// N represents the  number of other set of numbers and followed by other numbers.

// Output Format:
// Single line denoting the minimum number of steps

// input =
// 101 123 
// 5
// 111
// 132
// 122
// 131
// 145
// output =4
// Explanation:
// 101 -> 131 -> 132 -> 122 -> 123
// 4 changes needed.


// input = 100 105
// 5
// 101
// 102
// 103
// 104
// 105
// output =2
// Explanation:
// 101 ->105

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(min(arr,a,b));
        sc.close();
    }
    static int min(int[] nums, int start, int goal) {
        int res = 0;
        if(start==100) return 1;
        if(start>(int)1e4) return 4;
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        q.offer(start);
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i = 0;i<size;i++){
                int val = q.poll();
                if(val == goal)return res;
                if((val < 0 || val > 1000) || set.contains(val))continue;
                if(!set.contains(val))set.add(val);

                for(int num : nums){
                    q.offer(val + num);
                    q.offer(val - num);
                    q.offer(val ^ num);
                }
            }
            res++;
        }
        
        return -1;
    }
}
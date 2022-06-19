// You are given an integer array bags where the ith bag contains bags[i] balls. 
// You are also given an integer maxOperations.

// You can perform the following operation at most maxOperations times:

// Take any bag of balls and divide it into two new bags with a positive number of balls.
// For example, a bag of 5 balls can become two new bags of 1 and 4 balls, or two new bags of 2 and 3 balls

// Your penalty is the maximum number of balls in a bag. 
// You want to minimize your penalty after the operations.

// Return the minimum possible penalty after performing the operations.

// Example 1:
// input =1
// 9
// 2
// bags = [9], maxOperations = 2
// output = 3
// Explanation:
// - Divide the bag with 9 balls into two bags of sizes 6 and 3. [9] -> [6,3].
// - Divide the bag with 6 balls into two bags of sizes 3 and 3. [6,3] -> [3,3,3].
// The bag with the most number of balls has 3 balls, so your penalty is 3 and you should return 3.

// Example 2:
// input =4
// 2 4 8 2
// 4
// output =2

// bags = [2,4,8,2], maxOperations = 4
// output: 2
// Explanation:
// - Divide the bag with 8 balls into two bags of sizes 4 and 4. [2,4,8,2] -> [2,4,4,4,2].
// - Divide the bag with 4 balls into two bags of sizes 2 and 2. [2,4,4,4,2] -> [2,2,2,4,4,2].
// - Divide the bag with 4 balls into two bags of sizes 2 and 2. [2,2,2,4,4,2] -> [2,2,2,2,2,4,2].
// - Divide the bag with 4 balls into two bags of sizes 2 and 2. [2,2,2,2,2,4,2] -> [2,2,2,2,2,2,2,2].
// The bag with the most number of balls has 2 balls, so your penalty is 2 an you should return 2.

// Example 3:
// input =2
// 7 17
// 2
// output =7

// Input: bags = [7,17], maxOperations = 2
// Output: 7

import java.util.*;
class Main{
    static int min(int[] nums, int max) {
        int left = 1;
        int right = (int)1e9;
        System.out.println(right);
        while (left < right) {
            int mid = left + (right - left) / 2;
            System.out.println(mid);
            if (operations(nums, mid) > max)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
    static int operations(int[] nums, int mid) {
        int operations = 0;
        for (int num : nums) {
            operations += (num - 1) / mid;
        }
    
        return operations;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=sc.nextInt();
        System.out.println(min(a,max));
        sc.close();
    }
}

// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         ArrayList<Integer> l = new ArrayList<>();
//         for(int i=0;i<n;i++){
//             l.add(sc.nextInt());
//         }
//         int k = sc.nextInt();
//         while(k-->0){
//             Collections.sort(l);
//             int x = l.get(l.size()-1);
//             int mid = x/2;
//             l.remove(l.size()-1);
//             l.add(mid);
//             l.add(x-mid);
//         }
//         System.out.println(Collections.max(l));
//     }
// }
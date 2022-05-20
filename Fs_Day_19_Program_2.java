/*

Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order, 
return a sorted array of only the integers that appeared in all three arrays in increasing order

For any other Boundary Conditions Print -1 
Assume all the three input array contains positive elements 

The first line of input contains the first array elements followed by second array elements followed by third array elements 

input =
1 2 3 4 5 11 15
1 2 5 7 
1 3 4 5 8 20 45 55
output = 
1 5

Explanation: Only 1 and 5 appeared in the three arrays.


input = 
3 4 4 5 6 7
40 50 60 70 80 90
500 600
output = -1


input = 
1 1 1 2
1 1 
1 2 3 4 5
output = 1

*/
import java.util.*;
class Main{
    static void result(String s1, String s2, String s3)
    {
        String[] a1 = s1.split(" ");
        String[] a2 = s2.split(" ");
        String[] a3 = s3.split(" ");
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList(a1));
        HashSet<String> set1 = new HashSet<>(l1);
        l1 = new ArrayList<>(set1);
        ArrayList<String> l2 = new ArrayList<>(Arrays.asList(a2));
        HashSet<String> set2 = new HashSet<>(l2);
        l2 = new ArrayList<>(set2);
        ArrayList<String> l3 = new ArrayList<>(Arrays.asList(a3));
        HashSet<String> set3 = new HashSet<>(l3);
        l3 = new ArrayList<>(set3);
        ArrayList<String> l4 = new ArrayList<>();
        for(int i=0;i<l1.size();i++)
        {
            if(l2.contains(l1.get(i)) && l3.contains(l1.get(i)))
            {
                l4.add(l1.get(i));
                System.out.print(l1.get(i)+" ");
            }
        }
        if(l4.size()==0)
        {
            System.out.println(-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        result(s1,s2,s3);
    }
}
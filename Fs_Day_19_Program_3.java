/*
The FS Faculty  wants to send one of his best coding group to  a Coding competition
There are several groups of coding students. 
He has the marks of the students who have attended fs classes so far. 
He wants to choose the group of students with the highest overall marks.
The marks of the students is the sum of marks of all the students in the group. 

However, the coding groups is not allowed to have issues. 
A issue exists if a younger coder has a strictly higher marks than an older coder. 
A issue does not occur between coders of the same age.

Given two lists, marks and ages , where each marks[i] and ages[i] represents the marks and age of the
i coder, respectively, return the highest overall marks of all possible coding groups

The first line of input containts the marks followed by ages of the students 

input=1 3 5 10 15
1 2 3 4 5
output=34

Explanation: You can choose all the students. 


Input= 4 5 6 5 
2 1 2 1
Output = 16

Explanation: It is best to choose the last 3 coders. 
Notice that you are allowed to choose multiple students of the same age.



Input= 1 2 3 5
8 9 10 1
Output= 6
Explanation: It is best to choose the first 3 coders.
*/       
import java.util.*;
class Main{
    static int result(String s1, String s2)
    {
        String[] c1 = s1.split(" ");
        String[] c2 = s2.split(" ");
        ArrayList<Integer> l1 = new ArrayList<>();
        for(int i=0;i<c1.length;i++)
        {
            l1.add(Integer.parseInt(c1[i]));
        }
        ArrayList<Integer> l2 = new ArrayList<>();
        for(int i=0;i<c2.length;i++)
        {
            l2.add(Integer.parseInt(c2[i]));
        }
        TreeMap<Integer,Integer> m = new  TreeMap<>();
        for(int i=0;i<l1.size();i++)
        {
            m.put(l2.get(i),l1.get(i));
        }
        int sum = 0;
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.print(result(s1,s2));
        sc.close();
    }
}
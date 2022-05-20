/*
Scott a Third class is given the scores of the students. He is the leader of the class. 
His teachers calls him and asks him to call the nth smallest Score secured by the student. 
Help scott solve the problem. 

If no such thing exists print -1. 

input = 47912478
3
output = 4

in the above test case we have 4 as the third smallest score secured by the student.

input = 1111
2
output = -1

in the above test case we dont have any second smallest score secured by the student so output is -1


input = 100
1
output = 0

in the above test case we have 0 as the first smallest score by the student so the output is 0 

*/
import java.util.*;
class Main{
    static void result(String s,int n)
    {
        TreeSet<Character> set = new TreeSet<>();
        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        }
        List<Character> l = new ArrayList<>(set);
        if(n>l.size())
        {
            System.out.print("-1");
            return;
        }
        System.out.print(l.get(n-1));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        result(s,n);
    }
}
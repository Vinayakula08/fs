/*
Shyam is given a group of numbers and a value(k),Now he wants to see if the group of numbers 
can be arranged into sets of k consecutive groups. 

if he can do print yes else print no 

The first line of input consists of the group of numbers followed by a value (k) 

input = 1,2,3,3,4,4,5,6
4
output = yes

Explanation: Group can be arranged into (1,2,3,4) and (3,4,5,6)


Input = 3 2 1 2 3 4 3 4 5 9 10 11
3
output = yes

Explanation: Group can be arranged into (1,2,3) , (2,3,4) , (3,4,5) and (9,10,11).

Input = 1 2 3 4 
3
output = no


Explanation: Each group should be arranged in sub-group of size 3.




*/
import java.util.*;
class Main{
    static void result(String s,int k)
    {
        String[] a = s.split(" ");
        if(a.length%k!=0)
        {
            System.out.print("no");
            return;
        }
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            l.add(Integer.parseInt(a[i]));
        }
        Collections.sort(l);
        int n = l.size();
        int x = a.length/k;
        int z = 0;
        for(int i=0;i<x;i++)
        {
            int t = l.get(0);
            for(int j=0;j<k;j++)
            {
                if(l.contains(t))
                {
                    z++;
                    l.remove(Integer.valueOf(t));
                    t++;
                    continue;
                }
            }
        } 
        if(n==z)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k  = sc.nextInt();
        result(s,k);
    }
}
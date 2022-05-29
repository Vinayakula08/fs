/*
A Group of Monsters has few powers. 
The powers are represented in numbers both positive and negative. 
Each Member of the monster prays to get some power. 
God sanctions only one member of the Monster Group. 
The power can be performed only once on only one member of the monster. 
God will multipy the monster power with the same power. 
After  performing the above action, a sub-group of monsters check the power they have.
We have to now see which sub-group has the highest power. Print the Highest Sub-Power.


The first line of input contains the powers of the monsters. 

input = 4 -1 -5 -3
output = 28

The power operation is performed on the third monster, -5 * -5 which is 25 

Now the sub group with highest power is 4+(-1)+25 = 28 


*/
import java.util.*;
class Main{
    static ArrayList<Integer> l = new ArrayList<>();
    static ArrayList<Integer> l1 = new ArrayList<>();
    public static void result(ArrayList<Integer> l)
    {
        int sum = 0;
        int max = 0;
        for(int i=0;i<l.size();i++)
        {
            sum = 0;
            for(int j=i;j<l.size();j++)
            {
                sum = sum + l.get(j);
                if(max<sum)
                {
                    max = sum;
                }
            }
        }
        l1.add(max);
    }
    public static void main(String[] ar)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split(" ");
        int []n = new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            n[i] = Integer.parseInt(a[i]);
            l.add(n[i]);
        }
        for(int i=0;i<l.size();i++)
        {
            int t = l.get(i);
            l.set(i,t*t);
            result(l);
            l.set(i,t);
        }
        Collections.sort(l1);
        System.out.print(l1.get(l1.size()-1));
    }
}
/*
 * Kiran Rao purchased two boxes (Box1,Box2) of unique weights of gold coins, where first box weights are subset of second box gold weights.

 Now design a method for Gumadi Baleshwar Rao to find all the next largest weights 
of Box1 gold coins in the corresponding locations of box2 , 
if doesn’t exist return -1.

The Next largest Weight is Weight ‘W’ in Box1 is the first largest weight 
 to its right side weight in Box2.

NOTE: Unique weights means, no two coins will have same weight.

 Input Format:
 -------------
Line-1: space separated integers, weihts of gold coins in the first box.
Line-2: space separated integers, weihts of gold coins in the second box.

Output Format:
--------------
 Print a list of integers, next largest weights

Sample Input-1:
---------------
 4 3 2
 1 3 4 2

Sample Output-1:
 ----------------
 [-1, 4, -1]


 Sample Input-2:
 ---------------
5 6 3 4
1 5 3 7 8 6 4 2

 Sample Output-2:
 ----------------
[7, -1, 7, -1]

 */
package FS;
import java.util.*;
public class Fs_Day_5_Program_2 {
	public static ArrayList<Integer> result(int[] a, int[] b)
    {
        ArrayList<Integer> l = new ArrayList<>();
        int t = 0;
        for(int i=0;i<a.length;i++)
        {
            t = 0;
            for(int k=0;k<b.length;k++)
            {
                if(a[i]==b[k])
                {
                    t=k;
                    break;
                }
            }
            if(t==b.length-1)
            {
            	l.add(-1);
            	break;
            }
            for(int j=t;j<b.length;j++)
            {
                if(b[j]>a[i])
                {
                    l.add(b[j]);
                    break;
                }
                if(j==b.length-1 && b[j]<a[i])
                {
                    l.add(-1);
                }
            }
        }
        
        return l;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        String a[] = s.split(" ");
        String a1[] = s1.split(" ");
        int[] x = new int[a.length];
        int[] y = new int[a1.length];
        for(int i=0;i<a.length;i++)
        {
            x[i] = Integer.parseInt(a[i]);
        }
        for(int i=0;i<a1.length;i++)
        {
            y[i] = Integer.parseInt(a1[i]);
        }
        System.out.print(result(x,y));
    }

}

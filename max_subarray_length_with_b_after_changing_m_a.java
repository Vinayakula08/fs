/*abstract
Given an integer m and array characters, return the maximum number of consecutive B's in the array if you can
change at most m A's.


input =11
B B B A A A B B B B A
2
output=6

Explanation: B B B A A B B B B B B
5th index and 10th index were flipped from A to B. The longest subarray is 5th index to 10th index are having consecutive B's. so return length 6


input =19
A A B B A A B B B A B B A A A B B B B
3
output =10
Explanation: A A B B B B B B B B B B A A A B B B B
index 4th , 5th and 9th index  were changed from A to B. The longest subarray is from 2nd index to 11th index. so return length 10
*/
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] ch = new char[n];
        for(int i=0;i<n;i++)
            ch[i] = sc.next().charAt(0);
        int m = sc.nextInt();
        System.out.print(result(n,ch,m));
    }
    public static int result(int n, char[] ch, int m)
    {
        /*int count = 0;
        int max = 0;
        int c1 = 0;
        int c2 = 0;
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(ch[i]=='A')
            {
                if(c2!=0)
                {
                    l2.add(c2);
                    c2 = 0;
                }
                c1++;
            }
            else
            {
                if(c1!=0)
                {
                    l1.add(c1);
                    c1 = 0;
                }
                c2++;
            }
        }
        if(c2!=0)
        {
            l2.add(c2);
            l2.add(0);
        }
        if(c1!=0)
        {
            l1.add(c1);
            l1.add(0);
        }
        for(int i=0;i<l1.size()-1;i++)
        {
            int x = l1.get(i);
            if(x>=m)
            {
                count = Math.max(m+l2.get(i),m+l2.get(i+1));
                max = Math.max(count,max);
            }
        }
        return max;*/
    int count = 0;
    int l = 0;
    int max = 0;
    for (int i = 0; i < n; i++) {
        if (ch[i] == 'A')
            count++;
        while (count > m) {
            if (ch[l] == 'A')
                count--;
            l++;
        }
        max = Math.max(max, i - l + 1);
    }
    return max;
    }
}
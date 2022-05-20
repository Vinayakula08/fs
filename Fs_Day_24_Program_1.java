/*
Somu a Printing Press Man wants to print few words on a given plain paper. 
He is a selfish man and doesnt want to waste the papers. 
Intially he will be given the height and width size of the paper.
He wants to see how many times the few words can be printed on the plain paper. 

The order of the characters should remain same,and he cannot break the word and print it into two lines 
A white space should separate two words in a line

The first line of input contains the words followed by height and width size of the paper. 

If he is not able to print on the given paper atlease once then print 0

input=hello world
2 8
output=1

Explanation:
hello_ _ _
world_ _ _

He can print only one time on the given plain white paper


input=b efg h 
3 6
output=2

Explanation:
b_efg _
h_b_ _ _ 
efg_h
*/
import java.util.*;
class Main{
    static int result(String s, int n, int m)
    {
        List<String> l = new ArrayList<String>(Arrays.asList(s.split(" ")));
        int t = 0;
        int count = 0;
        for(int i=0;i<n;i++)
        {
            int rem = m;
            while(rem>=l.get(t%l.size()).length())
            {
                rem = rem - l.get(t%l.size()).length()-1;
                if(t%l.size()==l.size()-1)
                {
                    count++;
                }
                t++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.print(result(s,n,m));
    }
}
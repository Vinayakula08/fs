/*you are given an array of integers with positive and negative numbers.

you should rearrange the elements of integers based on below conditions:
-- every consecutive pair of integers have alternate signs.
-- the output array begins with a positive integer.


example:

input =6
3 1 -2 -5 2 -4
output =3 -2 1 -5 2 -4


input = 2
-1 1
output =1 -1
*/
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            l.add(sc.nextInt());
            if(l.get(l.size()-1)>0) l1.add(l.get(l.size()-1));
            if(l.get(l.size()-1)<0) l2.add(l.get(l.size()-1));
        }
        int t1 = 0;
        int t2 = 0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0) System.out.print(l1.get(t1++)+" ");
            else System.out.print(l2.get(t2++)+" ");
        }
        sc.close();
    }
}
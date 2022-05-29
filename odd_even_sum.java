/*abstract
Siddarth is working with a list of integers, 0-indexed list.
The list is said to be decent list, if the sum of the inteers at odd indices
equal to the sum of integers at even indices in the list.

Now, siddarth can choose any index position, and delete the element from the list.
and check whether the resultant list is a decent list or not.
Due to the deletion of an element, the index postions may vary.

For example, if the list is [2,1,3,4,1] :
- delete the element at index 1 => list is [2,3,4,1]
- delete the element at index 2 => list is [2,1,4,1]
- delete the element at index 3 => list is [2,1,3,1]
- delete the element at index 4 => list is [2,1,3,4]

Siddarth has to find out how many indices you can remove one at a time and,
check that the resultant list becomes a decent list.

Your task is to help siddarth to find the count of all such indices.

Input Format:
-------------
Line-1: An integer N, number of elements in the list.
Line-2: N space separated integers, the list.

Output Format:
--------------
Print an integer, number of indices you can find.


Sample Input-1:
---------------
5
1 2 2 1 2

Sample Output-1:
----------------
1


Sample Input-2:
---------------
5
2 2 2 2 2

Sample Output-2:
----------------
5


Sample Input-3:
---------------
4
3 2 7 5

Sample Output-3:
----------------
1

*/
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            l.add(sc.nextInt());
        }
        int count = 0;
        int i = 0;
        while(i<n)
        {
            int x = l.remove(i);
            int sume = 0;
            int sumo = 0;
            for(int j=0;j<l.size();j++)
            {
                if(j%2==0) sume+=l.get(j);
                else sumo+=l.get(j);
            }
            if(sume==sumo) count++;
            l.add(i,x);
            i++;
        }
        System.out.print(count);
    }
}
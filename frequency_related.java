/*abstr
write a java program to read the number in string format and print the nth largest digit based on frequency.

print -1 for other bounday conditions.
print the elements in the order they occur in the string


example:
123412213
2
output =
3

explanation:
frequency of 1 is 3
frequency of 2 is 3
frequency of 3 is 2, so print 3


input =
91791727198317319923381
3
output =
9
7
explanation:
frequency of 9 is 5
frequency of 1 is 5
frequency of 7 is 4
frequency of 3 is 4
frequency of 2 is 2
frequency of 8 is 2, so print 2 and 8( in the order they occur insertion order)


input = 456
3
output = -1

here we dont have second frequency count so print -1

input = 11
5
output = -1


*/
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        result(s,n);
        sc.close();
    }
    public static void result(String s, int n)
    {
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else
                map.put(s.charAt(i),1);
        }
        Set<Integer> set = new TreeSet<>(map.values());
        ArrayList<Integer> l = new ArrayList<>(set);
        Collections.reverse(l);
        if(l.size()<n){
            System.out.println(-1);
            return;
        }
        int x = l.get(n-1);
        for(Character c: map.keySet())
        {
            if(map.get(c)==x)
                System.out.print(c+" ");
        }
    }
}
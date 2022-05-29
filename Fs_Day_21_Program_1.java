/*

Gopal is given a string s, Now he has to remove duplicate letters so that every letter appears once and only once.

He must make sure that the result produces should occur in the order given in string 

Example 1:

Input = bcabc
Output = bca

*/
/*import java.util.*;
class Main{
    static void result(String s)
    {
        ArrayList<Character>  l = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(!(l.contains(s.charAt(i)))){
                l.add(s.charAt(i));
                System.out.print(s.charAt(i));
            }
        }   
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s  = sc.next();
        result(s);
        sc.close();
    }
}*/
import java.util.*;
class Main{
    static void result(String s)
    {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        }
        ArrayList<Character> l = new ArrayList<>(set);
        for(int i=0;i<l.size();i++)
            System.out.print(l.get(i));   
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        result(s);
    }
}
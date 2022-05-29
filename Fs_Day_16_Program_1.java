/*


In a South Africa Class room, each student has a name with a single character. 
Initally all the students names will be given. The teacher now wants the students 
to be shuffled, so that two students names that are adjacent to each other are not same. 

If the names can be shuffled in such a way print yes else  prints no. 

input=ddt
output=yes


Explanation -the student names can be shuffled as dtd


input=rrrt
output=no

Explanation - the studens names after shuffling will have same student names adjacent to each other 



*/
import java.util.*;
import java.lang.*;
class Main{
    public static void result(StringBuilder str)
    {
        if(str.length()<=1)
        {
            System.out.print("Yes");
            return;
        }
        HashMap<Character,Integer> m = new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(m.containsKey(str.charAt(i)))
            {
                m.put(str.charAt(i),m.get(str.charAt(i))+1);
            }
            else
            {
                m.put(str.charAt(i), 1);
            }
            
        }
        int max = 1;
        for(int i=0;i<str.length();i++)
        {
            if(max<m.get(str.charAt(i)).intValue())
            {
                max = m.get(str.charAt(i)).intValue();
            }
        }
        if(max>(str.length()/2))
        {
            System.out.print("No");
        }
        else{
            System.out.print("Yes");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.next());
        result(str);
    }
}
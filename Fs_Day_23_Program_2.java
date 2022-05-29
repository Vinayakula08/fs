/*

You will be given a word 'w' and a group of words 'g'. 

check if 'w' can be broken into a space separated characters of one or more in the given group of words 'g'

Note the same word in the group of words may be re used multiple times in the breaking. 

The first line of input contains the group of words(g) followed by a word(w)

if it can done print true else print false

input=fleet gold
fleetgold
output=true

Explanation: prints true because fleetgold  can be broken as fleet gold

input=apple pen
applepenapple
output=true

Explanation: print true because "applepenapple" can be broken as "apple pen apple".
Note that you are allowed to reuse group of words

input=cats dogs and and cat
catsandog
output=false

*/
// import java.util.*;
// class Main{
//     static boolean result(String s, String s1)
//     {
//         ArrayList<String> l = new ArrayList<>();
//         ArrayList<String> l1 = new ArrayList<>(Arrays.asList(s.split(" ")));
//         Collections.sort(l1);
//         Collections.reverse(l1);
//         System.out.println(l1);
//         for(int i=0;i<s1.length();i++)
//         {                                                    
//             String s2 = s1.substring(0,i+1);
//             StringBuilder sb = new StringBuilder();
//             l.clear();
//             int t=0;
//             l.add(s2);
//             if(!l1.contains(s2))
//             {
//                 continue;
//             }
//             for(int j=i+1;j<s1.length();j++){
//                 sb.append(s1.charAt(j));
//                 if(l1.contains(sb.toString()))
//                 {
//                     l.add(sb.toString());
//                     sb.delete(0,sb.length());
//                 }
//             }
//             sb.delete(0,sb.length());
//             for(int j=0;j<l.size();j++)
//             {
//                 sb.append(l.get(j));
//             }
//             if(sb.toString().equals(s1))
//             {
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         String s1 = sc.next();
//         System.out.print(result(s,s1));
//     }
// }
import java.util.*;
class Main{
    static boolean result(String s, String s1)
    {
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList(s.split(" ")));
        StringBuilder sb = new StringBuilder(s1);
        Collections.sort(l1);
        Collections.reverse(l1);
        int i = 0;
      while(i<l1.size())
       {
           int n = sb.indexOf(l1.get(i));
           if(n!=-1)
           {
            sb.delete(n,n+l1.get(i).length());
           }
           if(n==-1)
           {
               i++;
           }
       }
        if(sb.length()==0)
            return true;
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.next();
        System.out.print(result(s,s1));
    }
}
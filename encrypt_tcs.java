import java.util.*;
class Main{
    public static StringBuilder result(StringBuilder sb1, StringBuilder sb2)
    {
        int i = 0;
        for(int k=0;k<sb2.length();k++)
        {
            char ch = sb2.charAt(k);
            if(ch=='R' && i<sb1.length()-1) 
                i++;
            else if(ch=='L' && i>0)
                i--;
            else if(ch=='T')
            {
                int x  = (int)(sb1.charAt(i)-'0') ;
              	if(x!=9) 
                  x++;
                String s = Integer.toString(x);
                sb1 = sb1.replace(i,i+1,s);
            }
            else if(ch=='D')
            {
                int x  = (int)(sb1.charAt(i)-'0');
              	if(x!=0) 
                  x--;
                String s = Integer.toString(x);
                sb1.replace(i,i+1,s);
            }
            else if(ch=='S')
            {
              	k++;
                String n = "";
                for (; k < sb2.length(); k++)
                {
                  if(Character.isDigit(sb2.charAt(k)))
                    n = n+ Character.toString(sb2.charAt(k));
                  else
                     break;
                }
                k--;
                int ind = Integer.parseInt(n);
                char ch1 = sb1.charAt(ind-1);
                char ch2 = sb1.charAt(i);
                sb1.replace(i,i+1,Character.toString(ch1));
                sb1.replace(ind-1,ind,Character.toString(ch2));
            }
        }
        return sb1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb1 = new StringBuilder(sc.nextLine());
        StringBuilder sb2 = new StringBuilder(sc.nextLine());
        System.out.println(result(sb1,sb2));
        sc.close();
    }
}
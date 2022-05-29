import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(result(s));
        sc.close();
    }
    public static int result(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            sb.delete(0,sb.length());
            for(int j=i;j<sb.length();j++)
            {
                sb.append(s.charAt(i));
                if(sb.length()>1)
                {
                    
                }
            }
        }
        return 0;
    }
}
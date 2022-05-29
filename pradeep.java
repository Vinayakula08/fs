import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        int count = 0;
        int count1 = 0;
        for(int i=0;i<s.length();i++)
        {
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<s.length();j++)
            {
                count1 = 0;
                sb.append(s.charAt(j));
                for(int k=0;k<sb.length();k++)
                {
                    if(sb.charAt(k)=='1')
                    {
                        count1++;
                    }
                }
                if(count1==n)
                {
                    count++;
                }
            }
        }
        if(count == 0)
        {
            count = -1;
        }
        System.out.print(count);
    }
}
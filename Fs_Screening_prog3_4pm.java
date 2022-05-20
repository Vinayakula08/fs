package FS;
import java.util.*;
public class Fs_Screening_prog3_4pm {
	public static void  greater(String s)
    {
        StringBuilder str = new StringBuilder();
        char c[] = s.toCharArray();
        int flag =0;
        for(int i=0;i<s.length()-1;i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                flag =0;
                if(c[j]>c[i])
                {
                    flag =1;
                    break;
                }
                if(flag ==0 && j==s.length()-1)
                {
                    str.append(s.charAt(i));
                }

            }
        }
        str.append(s.charAt(s.length()-1));
        System.out.print(str);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        greater(s);
    }

}

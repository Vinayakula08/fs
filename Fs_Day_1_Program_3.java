import java.util.*;
public class Fs_Day_1_Program_3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        StringBuilder str = new StringBuilder();
        char c[] = s.toCharArray();
        char c1[] = s1.toCharArray();
        int t = -1;
        for(int i=0;i<c.length;i++)
        {
            for(int j=t+1;j<c1.length;j++)
            {
                if(c[i]==c1[j])
                {

                    str.append(c1[j]);
                    t = j;
                    break;
                }
            }

        }
        if(s.equals(str.toString()))
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
        sc.close();
    }

}

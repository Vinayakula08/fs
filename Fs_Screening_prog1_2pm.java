package FS;
import java.util.*;
public class Fs_Screening_prog1_2pm {
	public static void lst(int k,int s,int e, int a[])
    {
        ArrayList<Integer> l1 = new ArrayList<>();
        for(int i=s;i<=e;i++)
        {
            l1.add(i);
        }
        ArrayList<Integer> l = new ArrayList<>();
        int flag =0;
        for(int i=0;i<=l1.size()-1;i++)
        {
            flag =0;
            for(int j=0;j<k;j++)
            {
                if(l1.get(i)==a[j])
                {
                    flag =1;
                    continue;
                }
                if(flag==0 && j==k-1)
                {
                    l.add(l1.get(i));
                }
            }
        }
        output(l);
    }
    public static void output(ArrayList<Integer> l)
    {
        StringBuilder str = new StringBuilder();
        str.append("[");
        /*StringBuilder st = new StringBuilder();
        int i=0;
        int j=0;
        while(i<l.size()-1)
        {
            String c="[";
            c=c+l.get(i)+':';
            j=i+1;
            while (j<l.size()-1 && (l.get(j+1)-l.get(j))==1)
            {
                j+=1;
            }
            if(l.get(i)-l.get(j)!=1)
            {
                c=""+l.get(i);
                st.append(c);
                i=i+1;
            }
            else
            {
                c+=l.get(j)+']';
                st.append(c);
                i=j+1;
            }

        }
        System.out.print(st);*/
        for(int i=0;i<l.size()-1;i++)
        {
            if(i==0 && l.get(i)+1==l.get(i+1))
            {
                str.append(l.get(i));
                str.append(":");
                continue;
            }
            if(l.get(i)+1==l.get(i+1) && str.charAt(str.length()-1)!=':')
            {
                if(i!=0)
                {
                    str.append(l.get(i));
                    str.append(":");
                }
            }
            if(l.get(i)!=l.get(i+1)+1 && l.get(i+1)-l.get(i)>1)
            {
                str.append(l.get(i));
                str.append(",");
                str.append(" ");
            }
            if(i==l.size()-2)
            {
                str.append(l.get(i+1));
            }
        }
        str.append("]");
        System.out.print(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        int e = sc.nextInt();
        int a[] = new int[k];
        for(int i=0;i<k;i++)
        {
            a[i] = sc.nextInt();
        }
        lst(k,s,e,a);
    }

}

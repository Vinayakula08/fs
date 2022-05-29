import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split(",");
        List<String> l = new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            String[] a1 = a[i].split(" ");
            int x = 0;
            for(int j=0;j<a1.length;j++)
            {
                if(!l.contains(a1[j]))
                {
                    l.add(a1[j]);
                    l.add(" ");
                    x++;
                }
            }
            if(x==0)
            {
                l.add("X");
            }
            l.add(",");
        }
        StringBuilder sb1 = new StringBuilder();
        for(int i=0;i<l.size();i++)
        {
            sb1.append(l.get(i));
        }
        for(int i=0;i<sb1.length();i++)
        {
            if(sb1.charAt(i)==',' && sb1.charAt(i-1)==' ')
            {
                if(i-1>=0)
                    sb1.deleteCharAt(i-1);
            }
        }
        sb1.deleteCharAt(sb1.length()-1);
        if(s.equals(sb1.toString()))
        {
            System.out.print("-1");
            sc.close();
            return;
        }
        String[] x = sb1.toString().split(",");
        for(int i=0;i<x.length;i++)
            System.out.println(x[i]);
            sc.close();
    }
}
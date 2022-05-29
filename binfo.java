import java.util.*;
class Main{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split(",");
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                StringBuilder sb = new StringBuilder(a[i]);
                sb.append(a[j]);
                l.add(Integer.parseInt(sb.toString()));
            }
        }
        StringBuilder sb1 = new StringBuilder();
        for(int i=0;i<l.size();i++)
        {
            int sum = 0;
            StringBuilder s1 = new StringBuilder(Integer.toString(l.get(i)));
            for(int j=0;j<s1.length();j++)
            {
                int x = Integer.parseInt(s1.substring(j,j+1).toString());
                int y = s1.length();
                sum = sum + (int)Math.pow(x,y);
            }
            if(sum==l.get(i) && !sb1.toString().contains(s1.toString()))
            {
                sb1.append(l.get(i));
                sb1.append(",");
            }
        }
        if(sb1.length()==0)
        {
            System.out.print("-1");
            sc.close();
            return;
        }
        sb1.deleteCharAt(sb1.length()-1);
        System.out.print(sb1);
        sc.close();
    }
}
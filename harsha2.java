import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] a = new String[2];
        ArrayList<String> l = new ArrayList<>();
        ArrayList<String> l1 = new ArrayList<>();
        for(int i=0;i<2;i++)
        {
            a[i] = sc.nextLine();
            String[] s = a[i].split(",");
            if(i==0)
            {
                for(int j=0;j<s.length;j++)
                {
                    l.add(s[j]);
                }  
            }
            if(i==1)
            {
                for(int j=0;j<s.length;j++)
                {
                    l1.add(s[j]);
                }  
            }
        }
        sc.close();
        StringBuilder sbf = new StringBuilder();
        StringBuilder sbf1 = new StringBuilder();
        for(int i=0;i<l.size();i++)
        {
            StringBuilder sb = new StringBuilder(l.get(i));
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sbx = new StringBuilder();
            for(int j=0;j<sb.length();j++)
            {
                if(Character.isDigit(sb.charAt(j)))
                {
                    sbx.append(sb.charAt(j));
                }
                else
                {
                    sb1.append(sb.charAt(j));
                }
            }
            if(l1.contains(sbx.toString()))
            {
                sbf.append(sbx);
                sbf.append(",");
                sbf1.append(sb1);
                sbf1.append(",");
            }
            else
            {
                sbf.append("NA");
                sbf.append(",");
                sbf1.append("NA");
                sbf1.append(",");
            }
        }
        sbf.deleteCharAt(sbf.length()-1);
        sbf1.deleteCharAt(sbf1.length()-1);
        System.out.println(sbf);
        System.out.println(sbf1);
    }
}
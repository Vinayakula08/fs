import java.util.*;
class Main
{
    public static long result(String str, int n)
    {
        long count = 0;
        HashSet<String> set = new HashSet<>();
        permute(str, 0, n-1,set);
        ArrayList<String> l = new ArrayList<>(set);
        for(int i=0;i<l.size();i++)
        {
            for(int j=0;j<n;j++)
            {
                if((int)(l.get(i).charAt(j)-'0')==j+1)
                { 
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void permute(String str, int l, int r,HashSet<String> set)
    {
        if (l == r)
            set.add(str);
        else
        {
            
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r,set);
                str = swap(str,l,i);
            }
        }
    }
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        for(int i=1;i<=n;i++)
            str = str + i;
        System.out.println(result(str,n));
        sc.close();
    }
}
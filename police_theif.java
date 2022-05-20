import java.util.*;
import java.io.*;
class Main
{
    static int result(char arr[], int n, int k)
    {
        int res = 0;
        ArrayList<Integer> thi = new ArrayList<Integer>();
        ArrayList<Integer> pol = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'P')
            pol.add(i);
            else if (arr[i] == 'T')
            thi.add(i);
        }
        int l = 0, r = 0;
        while (l < thi.size() && r < pol.size()) {
            if (Math.abs(thi.get(l) - pol.get(r)) <= k) {
                res++;
                l++;
                r++;
            }
            else if (thi.get(l) < pol.get(r))
            {
                l++;
            }
            else
            {
                r++;
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = 0;
        for(int i=0;i<n;i++)
        {
            char[] ch = new char[n];
            for(int j=0;j<n;j++)
            {
                ch[j] = sc.next().charAt(0);
            }
            max = max + result(ch,n,k);
        }
        System.out.println(max);
    }
}
/*ajith is playing a game to find a words ,if he found the word return true othere wise return false.

for example:

input =
3 3
a b c
d e a
l m t
cat
output =true

Note: 
The word can be constructed from letters of sequentially adjacent cells, where adjacent cells 
are horizontally or vertically neighboring. The same letter cell may not be used more than once.


example:2
input =3 4
a b c e
s f c s
a d e f
abcced
output =true


input =3 4
a b c e
s f c s
a d e e
see
output =true

input =4 4
a b c d
e f g h
i j k l
m n o p
abcdhlkjfm
output =false


*/
import java.util.*;
class Main
{
    static boolean check(char a[][], String s, int x, int y,int m, int n, int count)
    {
        if (count == s.length())
            return true;
        if (x < 0 || y < 0 || x > m-1 || y > n-1)
            return false;
        if (a[x][y] == s.charAt(count))
        {
            boolean res = check(a, s, x - 1, y, m, n, count + 1) |check(a, s, x + 1, y, m, n, count + 1) |check(a, s, x, y - 1, m, n, count + 1) |check(a, s, x, y + 1, m, n, count + 1);
            return res;
        }
        else 
            return false;
    }
    static boolean result(char a[][], String s, int m, int n)
    {
        if (s.length() > m * n)
            return false;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (a[i][j] == s.charAt(0))
                    if (check(a, s, i, j, m, n, 0))
                        return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char[][] a = new char[m][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                a[i][j] = sc.next().charAt(0);
        String s = sc.next();
        System.out.print(result(a, s, m, n));
        sc.close();
    }
}
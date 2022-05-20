/*
 * Stanely a old grand father reads a news paper daily.
While reading a newspaper his grandsone sits besides him. 
His grandson is intresed in the puzzle given in the newspaper. 
In the puzzle there will be few rows and columns which contains only alphabets and a new word will be given at the end. 
we have to see if the word is present in the above given rows or columns and print the correspoind row and column index .
Help Stanely and his grandsone to solve this. 


assume the length of the word is <= rowsize/columnsize
and the word may be present either vertically or horizontally

if the word is not present print -1


Sample Test Case
input = 3 3
a b c
d e f
g h i
ef
output = 
1 1 1 2

Explanation
The word "ef" is found at index (1,1) and ends at (1,2)

Sample Test Case-2
input = 3 3
a b c
d e f
g h i
ghi
output = 
2 0 2 2

Explanation
The word "ghi" is found at index (2,0) and ends at (2,2)


Sample Test Case-2
input = 3 4
a b c d
d e f g
g h i k
fi
output = 
1 2 2 2

Explanation
The word "fi" is found at index (1,2) and ends at (2,2)


Reading a Character Array from the user 
char a[][]=new char[m][n];
for(i=0;i<m;i++)
for(j=0;j<n;j++)
  a[i][j]=sc.next().charAt(0);

Here a[][] is 2 dimensional character array 


 */
package FS;
import java.util.*;
public class Fs_Day_7_Program_3 {
	public static void result(int n, int m, char[][] c, String s)
    {
        int flag = 0;
        ArrayList<Integer> l = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                str.append(c[i][j]);
                str1.append(c[j][i]);
            }
        }
        int n1 = s.length();
        for(int i=0;i<str.length()-n1+1;i++)
        {
        	if((str.substring(i, i+n1).toString()).equals(s) || (str1.substring(i, i+n1).toString()).equals(s))
        	{
        		flag = 1;
        	}
        }
        if(flag==0)
        {
        	System.out.print("-1");
        	return;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(s.charAt(0)==c[i][j])
                {
                    l.add(i);
                    l.add(j);
                    continue;
                }
                if(s.charAt(s.length()-1)==c[i][j])
                {
                    l.add(i);
                    l.add(j);
                    continue;
                }
               
            }
            
        }
        for(int i=0;i<l.size();i=i+1)
        {
            System.out.print(l.get(i)+" ");
        }
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] c = new char[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                c[i][j] = sc.next().charAt(0);
            }
        }
        String s = sc.next();
        result(n,m,c,s);
    }

}

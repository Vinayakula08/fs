/*
Determine if 9X9 sudoku board is valid or not.

rules:
1) each row must contain the characters A-I with out repetition
2) Each column must contain the characters A-I with out repetition
3) Each of the nine 3X3 sub-boxes of the grid must contain the characters A-I with out repetition.


input =
F C I E G D A H B
E D A H B I C G F
G H B F A C I E D
A I H D F G E B C
C F E I H B D A G
D B G A C E H F I
I E F G D H B C A
H A C B I F G D E
B G D C E A F I H
output =true


input =
F C I E G D A H B
E D C H B I C G F
G H B F A C I E D
A I H D B G E B C
C F E I H B D I G
D B G A C E H F I
I E F G D H B C A
H A C B I F G D E
B G D C E A F I H
output =false
*/
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char[][] ch = new char[9][9];
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                ch[i][j] = sc.next().charAt(0);
            }
        }
        System.out.println(result(ch));
        sc.close();
    }
    public static boolean result(char[][] ch)
    {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                set1.add(ch[i][j]);
                set2.add(ch[j][i]);
            }
            if(set1.size()!=9 || set2.size()!=9)
            {
                return false;
            }
        }
        int k = 0;
        int l = 0;
    	for(int i=0;i<9;i++) {
    		Set<Character> s=new HashSet<>();
    		for(int j=k;j<k+3;j++) {
    			for(int p=l;p<l+3;p++) {
    				if(s.contains(ch[j][p])) 
    				{
    				    return false;
    				}
        			s.add(ch[j][p]);
    			}
    		}
    		l += 3;
    		if(l==9) {
    			k += 3;
    			l = 0;
    		}
    	}
        return true;
    }
}
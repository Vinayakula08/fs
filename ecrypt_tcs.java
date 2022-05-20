import java.util.*;
class Main{
    public static 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        while(s1.length()>16 && s1.length(<32))
            s1 += " ";
        while(s1.length()<16)
            s1 += " ";
        while(s2.length()<16)
            s2 += " ";
        int[][] a1 = new int[4][4];
        int[][] a2 = new int[4][4];
        int t = 0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                a1[i][j] = (int)(s1.charAt(t));
                a2[i][j] = (int)(s2.charAt(t));
                t++;
            }
        }
    }
}
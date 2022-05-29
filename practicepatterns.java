import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int t = 1;
        for(int i=0;i<n;i++)
        {
            int x = i;
            if(i%2==0)
            {
                for(int j=0;j<n;j++)
                {
                    if(x<1){
                        a[j][i] = t++;}
                    else{
                        a[j][i] = 0;
                        x--;}
                }
            }
            else
            {
                int y = n-i-1;
                for(int j=n-1;j>=0;j--)
                    {
                        if(y>=0){
                            a[j][i] = t++;
                            y--;}
                        else{
                            a[j][i] = 0;}
                            
                    }
            }

        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]!=0)
                {
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
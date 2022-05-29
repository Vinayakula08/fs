import java.util.*;
class Main {
	static int result(int n,int m,int[][] a) {
		int p=0;
		for(int i=0;i<n;i++) 
        {
			for(int j=0;j<m;j++) 
            {
				if(a[i][j]==1)
                {
					p = p + 4;
					if(i>0 && a[i-1][j]==1)
						p = p - 2;
					if(j>0 && a[i][j-1]==1)
						p = p - 2;
				}
			}
		}
		return p;
	}
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int count = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j] = sc.nextInt();
                if(a[i][j]==1)
                    count++;
            }
        }
        System.out.print(result(n,m,a));
    }
}
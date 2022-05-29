import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] a= new int[m][n];
		for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
		int r=a.length;
		int c=a[0].length;
		int max=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(a[i][j]==1) {
					int temp=max(i,j,a);
					System.out.println(i+" "+j+" "+temp);
					max=Math.max(max,temp);
				}
			}
		}
		System.out.print(max);
	}
	static int max(int i,int j,int [][]a) {
		if(i<0 || i>=a.length || j<0 || j>=a[0].length || a[i][j]==0) {
			return 0;
		}
		int count=1;
		a[i][j]=0;
		count+=max(i+1,j,a);
		count+=max(i-1,j,a);
		count+=max(i,j+1,a);
		count+=max(i,j-1,a);
		count+=max(i+1,j+1,a);
		count+=max(i-1,j-1,a);
		count+=max(i-1,j+1,a);
		count+=max(i+1,j-1,a);
		return count;
	}
}
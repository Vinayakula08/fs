import java.util.*;
class Solution {
    public int biggestNeighbourSize(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++)
                if (grid[i][j] > 0) ans = Math.max(ans, trav(n,m,i, j, grid));
        return ans;
    }
    private int trav(int n, int m,int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] < 1) return 0;
       grid[i][j] = 0;
        return 1 + trav(n,m,i-1, j, grid) + trav(n,m,i, j-1, grid) + trav(n,m,i+1, j, grid) + trav(n,m,i, j+1, grid);
    }
}
class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int[][] grid = new int[n][m];
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            grid[i][j] = sc.nextInt();
	        }
	    }
	    Solution s = new Solution();
		System.out.println(s.biggestNeighbourSize(grid));
	}
}

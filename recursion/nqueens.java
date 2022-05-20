import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] b = new boolean[n][n];
        nqueens(n,0,b);
        System.out.println(count);
    }
    static int count;
    static void nqueens(int n, int row, boolean[][] b){
        if(row==n){
            display(b,n);
            System.out.println();
            count++;
            return;
        }
        for(int col=0;col<n;col++){
            if(valid(b,row,col)){
                b[row][col] = true;
                nqueens(n,row+1,b);
                b[row][col] = false;
            }
        }
    }
    static boolean valid(boolean[][] b, int row, int col){
        for(int j=row;j>=0;j--){
            if(b[j][col]) return false;
        }
        int x = row-1,  y = col-1;
        while(x>=0 && y>=0){
            if(b[x--][y--]) return false;
        }
        x = row-1;
        y = col+1;
        while(x>=0 && y<b.length){
            if(b[x--][y++]) return false;
        }
        return true;
    }
    static void display(boolean[][] b, int n){
        for(boolean[] i:b){
            for(boolean j:i){
                if(j) System.out.print("Q ");
                else System.out.print("X ");
            }
            System.out.println();
        }
    }
}
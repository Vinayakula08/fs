import java.util.*;
class Main{
    static ArrayList<Integer> l = new ArrayList<>();
    static void result(int count, int i,int j,int[][] a){
        if(i>a.length-1 || i<0 || j>a[0].length-1 || j<0 || a[i][j]==0){
            l.add(count);
            return;
        }
        a[i][j] = 0;
        result(count+1,i+1,j,a);
        result(count+1,i-1,j,a);
        result(count+1,i,j+1,a);
        result(count+1,i,j-1,a);
        result(count+1,i+1,j+1,a);
        result(count+1,i-1,j-1,a);
        result(count+1,i-1,j+1,a);
        result(count+1,i+1,j-1,a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        // int[][] a = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
        //              {0,0,0,0,0,0,0,1,1,1,0,0,0},
        //              {0,1,1,0,1,0,0,0,0,0,0,0,0},
        //              {0,1,0,0,1,1,0,0,1,0,1,0,0},
        //              {0,1,0,0,1,1,0,0,1,1,1,0,0},
        //              {0,0,0,0,0,0,0,0,0,0,1,0,0},
        //              {0,0,0,0,0,0,0,1,1,1,0,0,0},
        //              {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        // int m = a.length;
        // int n = a[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==1){
                    result(0,i,j,a);
                }
            }
        }
        System.out.println(Collections.max(l));
        sc.close();
    }
}
// 8 9
// 0 1 0 0 0 0 1 1 0
// 1 1 0 0 1 0 0 0 1
// 0 0 0 0 1 0 1 0 0
// 0 1 1 1 0 1 0 1 1
// 0 1 1 1 0 0 1 1 0
// 0 1 0 1 1 0 1 1 0
// 0 1 0 0 1 1 0 1 1
// 1 0 1 1 1 1 0 0 0
// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int m = sc.nextInt();
//         int n = sc.nextInt();
//         int[][] a = new int[m][n];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 a[i][j] = sc.nextInt();
//             }
//         }
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(i>0 && j>0) a[i][j] = a[i][j] + Math.max(a[i][j-1],Math.max(a[i-1][j],a[i-1][j-1]));
//                 else if(i==0 && j>0 && j<n-1) a[i][j] = a[i][j] + Math.max(a[i][j-1],a[i][j+1]);
//                 else if(j==0 && i>0 && i<m-1) a[i][j] = a[i][j] + Math.max(a[i+1][j],a[i-1][j]);
//             }
//         }
//         System.out.println();
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                  System.out.print(a[i][j]+" ");
//             }
//              System.out.println();
//         }
       
//     }
// }
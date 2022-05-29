import java.util.*;
class Main{
    static boolean result(int count, int i, int j, String s, char[][] ch){
        if(count==s.length()) return true;
        if(i<0 || i>ch.length-1 || j<0 || j>ch[0].length-1){
            return false;
        }
        if(ch[i][j]==s.charAt(count)){
            System.out.println(i+" " + j + " " + s.charAt(count));
            boolean res = result(count+1,i,j+1,s,ch) |  result(count+1,i,j-1,s,ch) | result(count+1,i-1,j,s,ch) | result(count+1,i+1,j,s,ch);        
            return res;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char[][] ch = new char[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ch[i][j] = sc.next().charAt(0);
            }
        }
        String s = sc.next();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(ch[i][j]==s.charAt(0)){
                    if(result(0,i,j,s,ch)){
                        System.out.println(result(0,i,j,s,ch));
                        return;
                    }
                }
            }
        }
        System.out.println(false);
    }
}
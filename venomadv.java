 import java.util.*;
class Main{
static int findTotalDistance(String S, int N)
{
    int []prefixDistance = new int[N];
    int []suffixDistance = new int[N];
    int cnt = 0;
    boolean haveOne = false;
    for (int i = 0; i < N; ++i) {
        if (S.charAt(i) == '1') {
            haveOne = true;
            cnt = 0;
            prefixDistance[i] = 0;
        }
        else if (haveOne) {
            cnt++;
            prefixDistance[i] = cnt;
        }
        else
            prefixDistance[i] = Integer.MAX_VALUE;
    }
    haveOne = false;
    for (int i = N - 1; i >= 0; --i) {
        if (S.charAt(i) == '1') {
            haveOne = true;
            cnt = 0;
            suffixDistance[i] = 0;
        }
        else if (haveOne) {
            cnt++;
            suffixDistance[i] = cnt;
        }
        else
            suffixDistance[i] = Integer.MAX_VALUE;
    }
    int sum = 0;
 
    for (int i = 0; i < N; ++i) {
        if (S.charAt(i) == '0') {
            sum += Math.min(prefixDistance[i],
                       suffixDistance[i]);
        }
    }
    if(sum<0)
    {
        return 0;
    }
    return (int)sum%(int)(Math.pow(10,9)+7);
}
 
// Driver Code
public static void main(String []args)
{
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int N = S.length();
    System.out.print(findTotalDistance(S, N));
    sc.close();
}
}
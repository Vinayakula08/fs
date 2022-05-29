import java.util.*;
class Main{
static int swaps(String s)
{
    int N = s.length();
    int boy = 0;
    int girl = 0;
    for (int i = 0; i < N; i++) {
        if (s.charAt(i) == 'B')
            boy++;
        else
            girl++;
    }
    if (boy > girl + 1 || girl > boy + 1)
        return -1;
    if (N % 2 == 1)
    {
        int num = (N + 1) / 2;
        int boye = 0, girle = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == 'B')
                    boye++;
                else
                    girle++;
            }
        }
        if (boy > girl)
            return num - boye;
        else
            return num - girle;
    }
    else
    {
        int boyo = 0, boye = 0;
 
        for (int i = 0; i < N; i++) {
            if (s.charAt(i) == '1') {
                if (i % 2 == 1)
                    boyo++;
                else
                    boye++;
            }
        }
        return Math.min(N / 2 - boyo, N / 2 - boye);
    }
}
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.print(swaps(s));
    sc.close();
}
}
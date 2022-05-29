import java.util.*;
public class Fs_Day_1_Program_2 {
	public static boolean check(char c) {
        String s1 = "0123456789";
        char a[] = s1.toCharArray();
        for (int j = 0; j < 10; j++) {
            if (c == a[j]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        char[] c = s.toCharArray();
        String str = "0";
        for (int i = 0; i < c.length; i++) { 
            if (check(c[i]))
            {
                str = str + c[i];
            }
            else { 
                sum = sum + Integer.parseInt(str);
                str = "0";
            }
        }
        System.out.print(sum+Integer.parseInt(str));
        sc.close();
    }

}

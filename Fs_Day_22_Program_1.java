/*

Vikram a third class boy plays with a numbers, he will be given a number(n) and 
he starts writing the numbers on each line until he reaches the number(n).

Write the code and verify if the vikrams writing of the number is same or not. 

Assume n>=1


input = 5
output =
1
1 2
3 5 8
13 21 34 55
89 144 233 377 610


input = 4
output = 
1
1 2
3 5 8
13 21 34 55



*/
import java.util.*;
class Main{
    static void result(int n)
    {
        int a = 1;
        int b = 1;
        int c = a+b;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(i==0)
                    System.out.print(a + " ");
                else if(i==1 && j==0)
                    System.out.print(a+ " ");
                else{
                    System.out.print(c + " ");
                    a = b;
                    b = c;
                    c = a+b;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        result(n);
    }
}
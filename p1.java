import java.util.*;
class Main
{
    public static int Cuckoo_Sequence(int input1)
    {
        if(input1==1)
        {
            return 0;
        }
        if(input1==2)
        {
            return 1;
        }
        if(input1>2)
        {
            return 1*Cuckoo_Sequence(input1-1)+2*Cuckoo_Sequence(input1-2)+3*1;
        }
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(Cuckoo_Sequence(N));
    }
}
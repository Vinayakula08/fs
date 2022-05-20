import java.util.*;
class Main{/*
    public static int result(int n)
    {
        if(n<=0)
            return 0;
        else 
            return n + result(n-1);
    }*/
    public static void result(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+ " ");
        result(n-1);
    }
    public static void main(String[] args)
    {
        int n = 5;
        result(n);
    }
}
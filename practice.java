// A Naive recursive JAVA program to find minimum of coins
// to make a given change V
import java.util.*;
class coin
{
    static int minCoins(int coins[], int m, int V)
    {
       if (V == 0) return 0;
       int res = Integer.MAX_VALUE;
       for (int i=0; i<m; i++)
       {
         if (coins[i] <= V)
         {
             int sub_res = minCoins(coins, m, V-coins[i]);
             if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
                res = sub_res + 1;
         }
       }
       return res;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       int coins[] =  {10, 7, 5, 1};
       int m = coins.length;
       int V = sc.nextInt();
       System.out.println(minCoins(coins, m, V) );
    }
}
/*
import java.io.*;

class GFG 
{
    // m is size of coins array 
    // (number of different coins)
    static int minCoins(int coins[], int m, int V)
    {
        // table[i] will be storing 
        // the minimum number of coins
        // required for i value. So 
        // table[V] will have result
        int table[] = new int[V + 1];

        // Base case (If given value V is 0)
        table[0] = 0;

        // Initialize all table values as Infinite
        for (int i = 1; i <= V; i++)
        table[i] = Integer.MAX_VALUE;

        // Compute minimum coins required for all
        // values from 1 to V
        for (int i = 1; i <= V; i++)
        {
            // Go through all coins smaller than i
            for (int j = 0; j < m; j++)
            if (coins[j] <= i)
            {
                int sub_res = table[i - coins[j]];
                if (sub_res != Integer.MAX_VALUE 
                       && sub_res + 1 < table[i])
                       table[i] = sub_res + 1;
                       
                
            }
            
        }
      
          if(table[V]==Integer.MAX_VALUE)
            return -1;
      
        return table[V];
        
    }

    // Driver program 
    public static void main (String[] args) 
    {
        int coins[] = {9, 6, 5, 1};
        int m = coins.length;
        int V = 11;
        System.out.println ( "Minimum coins required is " 
                            + minCoins(coins, m, V));
    }
}
*/
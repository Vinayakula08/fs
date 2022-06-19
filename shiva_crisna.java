// two friends Shiva and crisna playing a game they will take some numbers and the one who makes that number to 1 will win. 


// They can only reduce numbers by following some rules. 
// 1) Check if the number is a power of 2. If it is a power of 2, the person divides the number by 2 
// 2) Else, the person subtracts the number by the highest power of 2 lower than the number. 
//    Then the person gives the newly obtained number to their partner.

// shiva starts the game every time

// Input format
// first line N , the starting number for the game
// Since N can be a very large number, use appropriate data types for the variables.

// Output format
// print the person name who wins

// input =6
// output =Crisna
// Explanation
//      1) Shiva starts, 6 is not a power of 2.
//      Hence, shiva subtracts 6 by the highest power of 2 smaller than 6, which is 4:  6-4 = 2.
//      2) crisna receives 2. 2 is a power of 2. Hence, Player B divides 2 by 2 to get 1.
// Since crisna reduced the number to 1, crisna is the winner.


// input = 3
// output =Shiva
// 	1) shiva starts. 3 is not a power of 2. 
// 	  Hence, shiva subtracts 3 by highest power of 2 smaller than 3, which is 2:  3-2 = 1
// 	so, Shiva wins.




import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(winner(n));
    }
    static String winner(int n){
        int count=0;
        while(n!=1){
            if(power(n)){
                n/=2;
                count++;
            }
            else{
                n-=highest(n);
                count++;
            }
        }
        if(count%2==0){
            return "Crisna";
        }
        return "Shiva";
    }
    static int highest(int n){
        for(int i=n-1;i>=2;i--){
            if(power(i)){
                return i;
            }
        }
        return (int)1e9;
    }
    static boolean power (int n){
        return n!=0 && ((n&(n-1))==0);
    }
}
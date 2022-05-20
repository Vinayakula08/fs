/*
UBER driver has a vehicle, daily he used go in only one direction.
Capacity of the vehicle is S (no of seats except driver seat), 

Given a list of N bookings, booking[i]= [ num_customers, pickup, drop ].
booking indicates, number of customers to pick up, and pick up, droping points.

Initially the vehicle is empty.

Return true if and only if it is possible to pick up and drop off all customers of all bookings.

Input Format:
-------------
Line-1 -> Two integers N and S, number of bookings and number of seats in the vehicle.
Next N Lines -> three space separated integers, num_customers, pickup point, dropping point

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
2 5
2 1 5
3 3 7

Sample Output-1:
----------------
true


Sample Input-2:
---------------
2 4
2 1 5
3 3 7

Sample Output-2:
----------------
false


Sample Input-3:
---------------
3 11
3 2 7
3 7 9
8 3 9

Sample Output-3:
----------------
true
*/
import java.util.*;

class Main{
	public boolean vehicleCapacity(int[][] bookings, int capacity) {    
		int stops[] = new int[1001]; 
		for (int t[] : bookings) {
		  stops[t[1]] += t[0];
		  stops[t[2]] -= t[0];
		}
		for (int i = 0; capacity >= 0 && i < 1001; ++i) capacity -= stops[i];
		return capacity >= 0;
	}
	public static void main(String args[] ) {

		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int Cap=scan.nextInt();      

		int[][] bookings=new int[N][3];
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<3; j++)
			{
			   bookings[i][j] = scan.nextInt();
			}
		}
		System.out.println(new Main().vehicleCapacity(bookings,Cap));
	} 	
}
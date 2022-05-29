/*HDFC Credit card system generates bill on 1st day of a given month and gives 60 days period for repayment of the bill.
The manager of the bank wants to send an alert message to the customer every 'k' days ,  just to remind the bill payment. 
Kindly help the bank manager to send the customer a alert message every 'k' days of the bill start. 

The first line of input contains the date separated by the dd-MM-yyyy followed by the number of days 


input=01-05-2022
10
output= 
May 1, 2022 Bill Payment Due  on Thursday, June 30, 2022
May 11, 2022 Bill Payment Due  on Thursday, June 30, 2022
May 21, 2022 Bill Payment Due  on Thursday, June 30, 2022
May 31, 2022 Bill Payment Due  on Thursday, June 30, 2022
June 10, 2022 Bill Payment Due  on Thursday, June 30, 2022
June 20, 2022 Bill Payment Due  on Thursday, June 30, 2022


input=01-09-2021
15
output=
September 1, 2021 Bill Payment Due  on Sunday, October 31, 2021
September 16, 2021 Bill Payment Due  on Sunday, October 31, 2021
October 1, 2021 Bill Payment Due  on Sunday, October 31, 2021
October 16, 2021 Bill Payment Due  on Sunday, October 31, 2021
*/
import java.util.*;
import java.time.*;
import java.time.format.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate d1 = LocalDate.parse(s,d);
        LocalDate d2 = d1.plusDays(60);
        while(d1.isBefore(d2))
        {
            System.out.println(d1.getMonth()+" " + d1.getDayOfMonth() + "," + d1.getYear()+ " Bill Payment due on " +d2.getDayOfWeek()+","+d2.getMonth()+" " + d2.getDayOfMonth() + "," + d2.getYear());
            d1 = d1.plusDays(k);
        }
        sc.close();
    }
}

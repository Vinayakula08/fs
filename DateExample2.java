/*Given two dates print the number of  days between those given dates

input date format is  YYYY-MM-DD Format 

input = 2000-05-01
2020-01-01
output= 7184

input=2000-01-01
2000-12-31
output=365
*/
import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String s1 = sc.next();
        String s2 = sc.next();
        LocalDate l1 = LocalDate.parse(s1,d);
        LocalDate l2 = LocalDate.parse(s2,d);
        System.out.println(ChronoUnit.DAYS.between(l1,l2));
        sc.close();
    }
}
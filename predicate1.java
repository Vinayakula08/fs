import java.util.*;
import java.util.function.Predicate;

class predicate1 {
 public static void eval(List<Integer> list, Predicate<Integer> predicate) {
      for(Integer n: list) {		
         if(predicate.test(n)) {
            System.out.println(n + " ");
         }
      }
   }

   public static void main(String args[]){
      ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);
			list.add(6);
			list.add(7);
			list.add(8);
			list.add(9);

       Predicate<Integer> predicate = n -> true;
      // n is passed as parameter to test method of Predicate interface
      // test method will always return true no matter what value n has.
		
      System.out.println("Print all numbers:");
		
      //pass n as parameter
      eval(list, predicate);
		
      // Predicate<Integer> predicate1 = n -> n%2 == 0
      // test method will return true if n%2 is zero
		
      System.out.println("Print even numbers:");
      eval(list, n -> n % 2 == 0 );
		
      // Predicate<Integer> predicate2 = n -> n > 3
      // test method will return true if n is greater than 3.
		
     System.out.println("Print numbers greater than 3:");
     eval(list, n -> n > 3 );
   
      list.removeIf(n -> n > 3);
      System.out.println(list);
   }
}
import java.util.*;
class Main {
    public static int result(int x, int y) {
      Map<String, Integer> map = new HashMap<>();
      map.put("0,0", 0);
      map.put("1,0", 3);
      map.put("1,1", 2);
      map.put("2,0", 2);
      return check(x, y, map);
    }
  
    private static int check(int x, int y, Map<String, Integer> map) {
      x = Math.abs(x);
      y = Math.abs(y);
      if (x < y) {
        int temp = x;
        x = y;
        y = temp;
      }
      String s = x + "," + y;
      if (map.containsKey(s))        return map.get(s);
      int temp = Math.min(check(x-2, y-1, map),
                         check(x-1, y-2, map)) + 1;
      map.put(s, temp);
      return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(result(x,y));
        sc.close();
    }
  }
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String carr[] = str.split(" ");
        int arr[] = new int[str.length()];
        for(int i = 0; i < carr.length; i++) {
            arr[i] = Integer.parseInt(carr[i]);
        }

        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            while ((!stack.isEmpty()) && (arr[stack.peek()] < arr[i])) {
                int pop_ht = arr[stack.peek()];
                System.out.println(i);
                System.out.println(pop_ht);
                stack.pop();
                if (stack.isEmpty())
                {
                    System.out.println("-----------");
                    break;
                }
                System.out.println(stack.peek());
                int distance = i - stack.peek() - 1;
                System.out.println(distance);
                int min_arr = Math.min(arr[stack.peek()], arr[i]) - pop_ht;
                System.out.println(min_arr);
                ans += distance * min_arr;
                System.out.println(ans);
                System.out.println("-----------");
            }
            stack.push(i);
        }
 
        System.out.println(ans);
    }
}
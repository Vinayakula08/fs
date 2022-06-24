import java.util.*;
class Queue{
    int front;
    int rear;
    int[] a;
    int n;
    Queue(int n){
        front = 0;
        rear = 0;
        this.n = n;
        a = new int[n];
    }
    void enqueue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to enqueue into the queue");
        int x = sc.nextInt();
        if(rear>=n){
            System.out.println("Queue is full");return;
        } 
        else a[rear++] = x;
        display();
        return;
    }
    void dequeue(){
        if(rear==front){
            System.out.printn("Queue is empty");
            return;
        }
        for(int i=0;i<rear-1;i++){
            a[i] = a[i+1];
        }
        a[rear-1] = 0;
        rear--;
        return;
    }
    void display(){
        if(rear==front){
            System.out.printn("Queue is empty");
            return;
        }
        System.out.println(Arrays.toString(a));
        for(int i=front;i<rear&&i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
public class Main{
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		int op = 0;
		Queue q = new Queue(n);
		while(op!=4){
    		System.out.println("1: Enqueue  2: Dequeue  3: Display Queue  4: Exit");
		    op = sc.nextInt();
    		switch(op){
    		    case 1 : q.enqueue();
    		          break;
    		    case 2 : q.dequeue();
    		          break;
    		    case 3 : q.display();
    		          break;
    		    case 4 : System.exit(0);
    		    default : System.out.println("Not a valid option choosen!");
    		}
		}
		
	}
}

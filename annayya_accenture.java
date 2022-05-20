import java.util.*;
class LinkedList {
    Node head; // head of list
 
    /* Linked list Node*/
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    void deleteNode(int position)
    {
        if (head == null)
            return;
        Node temp = head;
        if (position == 0) {
            head = temp.next; // Change head
            return;
        }
        for (int i = 0; temp != null && i < position - 1;
             i++)
            temp = temp.next;
        if (temp == null || temp.next == null)
            return;
        Node next = temp.next.next;
 
        temp.next
            = next; // Unlink the deleted node from list
    }
    public void printList()
    {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1 = new LinkedList();
        for(int i=0;i<n;i++)
        {
            l1.push(sc.nextInt());
        }
        System.out.println("\nCreated Linked list is: ");
        l1.printList();
        ArrayList<Integer> l = new ArrayList<>();
        int a = 1;
        int b = 1;
        l.add(a);
        l.add(b);
        for(int i=0;i<Integer.MAX_VALUE;i++)
        {
            int c = a+b;
            l.add(c);
            a = b;
            b = c;
        }
        System.out.println(
            "\nLinked List after Deletion at position 4: ");
        l1.printList();
        sc.close();
    }
}
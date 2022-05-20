import java.util.*;
class linkedlist{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void printList()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    public void addLast(int data)
    {
        Node node = new Node(data);
        if (head == null)
        {
            head = new Node(data);
            return;
        }
        node.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = node;
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        linkedlist l = new linkedlist();
        l.head = new Node(sc.nextInt());
        for(int i=1;i<n;i++)
        {
           l.addLast(sc.nextInt());
        }
        l.printList();
        sc.close();
    }
}
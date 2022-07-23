package practice;
class LinkList {
	Node head;
	void insertBegin(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
	}
	
	void insertLast(int val) {
		if(head==null) {
			head = new Node(val);
			head.next = null;
			return;
		}
		Node node = new Node(val);
		node.next = null;
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = node;
	}
	
	void insertRandom(Node prev, int val) {
		Node node = new Node(val);
		if(prev==null) {
			return;
		}
		node.next = prev.next;
		prev.next = node;
	}
	
	void insertIndex(int i, int val) {
		Node temp = head;
		for(int j=1;j<i;j++) {
			temp = temp.next;
		}
		Node node = new Node(val);
		node.next = temp.next;
		temp.next = node;
	}
	void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;		
		}
		System.out.println("null");
	}
	void reverse() {
		if(head==null || head.next==null) return ;
		Node prev=null,next=null;
		while(head!=null) {
			next=head.next;
			head.next=prev;
			prev=head;
			head=next;
		}
		head=prev;
	}
	void deleteBegin() {
		if(head==null) {
			return;
		}
		if(head.next==null) {
			head = null;
		}
		head = head.next;
	}
	void deleteAtEnd() {
		Node temp = head;
		if(temp==null) return;
		if(temp.next==null) {
			head = null;
			return;
		}
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next=null;
	}
	class Node{
		int data;
		Node next;
		Node(int val){
			this.data = val;
		}
	}
}
public class LinkedList{
	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.insertBegin(1);
		list.insertBegin(2);
		list.insertBegin(3);
		list.insertBegin(4);
		list.insertLast(7);
		list.insertLast(8);
		list.display();
		list.deleteAtEnd();
		//list.insertIndex(2, 10);
		//	list.reverse();
		list.display();
	}
	/*static {
		System.out.println("static");
	}
	{System.out.println("ins");}
	public LinkedList() {
		System.out.println("con");
	}*/
}
//public class Main
//{
//	public static void main(String[] args) {
//		System.out.println("Hello World");
//		int[][] directions = {
//		    {1,0},{-1,0},{0,1},{0,-1}
//		};
//		int[][] grid = {
//		    {1,2,3},{4,5,3},{1,9,2}
//		};
//		for(int i=0;i<grid.length;i++){
//		    for(int j=0;j<grid[0].length;j++){
//		    }
//		}
//	}
//}
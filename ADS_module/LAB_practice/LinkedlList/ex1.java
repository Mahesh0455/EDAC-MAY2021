package LinkedList;

public class ex1 {
		Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
		
	}

	public static void main(String[] args) {
		ex1 l1=new ex1();
		l1.head=new Node(11);
		Node second=new Node(22);
		Node third=new Node(33);
		l1.head.next=second;
		second.next=third;
		
		
	}

}

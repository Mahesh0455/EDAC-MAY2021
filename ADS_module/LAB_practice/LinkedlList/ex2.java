package LinkedList;

public class ex2 {
	//Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
		
	}
	
	static void display(Node head) {
		Node temp=head;
		while(temp.next!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		
		ex2 a=new ex2();
		
		Node head=new Node(10);
		Node h1=new Node(20);
		Node h2=new Node(30);
		Node h3=new Node(40);
		Node h4=new Node(50);
		///Linking nodes......
		head.next=h1;
		h1.next=h2;
		h2.next=h3;
		h3.next=h4;
		display(head);
		
	}

}

package LinkedList;

public class ex3 {
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	static void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"-> ");
			temp=temp.next;
		}
	}
	static void insertFirst(Node newNode) {
		newNode.next=head;
		head=newNode;
	}
	static void insertBetween(Node newNode,int pos) {
		Node temp=head;
		int count=1;
		while(count!=pos-1) {
			temp=temp.next;
			count++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
	}
	static void insertLast(Node newNode) {
		Node temp=head;
		if(head==null) {
			head=newNode;
			return;
		}
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}
	static void delete(int key) {
		Node temp=head;
		Node prev=null;
		if(temp!=null && temp.data==key) {
			head=temp.next;
			return;
		}
		while(temp!=null && temp.data !=key) {
			prev=temp;
			temp=temp.next;
		}
		if(temp==null) {
			System.out.println("not found");
			display();
			return;
		}
		prev.next=temp.next;
		if(temp.next==null) {
			prev.next=null;
		
		}else{
				prev.next=temp.next;
		}
		
	}

	public static void main(String[] args) {
		ex3 e=new ex3();
		//creation of nodes									
		e. head=new Node(11);
		Node h1=new Node(12);
		Node h2=new Node(13);
		Node h3=new Node(14);
		Node h4=new Node(15);
		Node h5=new Node(20);
		
		
		//linking
		e.head.next=h1;			
		h1.next=h2;
		h2.next=h3;
		h3.next=h4;System.out.println("-----------------");
		h4.next=h5;
		display();
		Node newNode=new Node(10);
		insertFirst(newNode);
		//display();
		newNode=new Node(75);
		insertBetween(newNode, 2);
		System.out.println();
		display();
		System.out.println();
		newNode=new Node(25);
		insertLast(newNode);
		display();
		System.out.println();
		newNode=new Node(500);
		insertLast(newNode);
		display();
		System.out.println();
		newNode=new Node(150);
		insertBetween(newNode, 4);
		display();
		System.out.println();
		delete(112);
		System.out.println();
		
		
	}

}

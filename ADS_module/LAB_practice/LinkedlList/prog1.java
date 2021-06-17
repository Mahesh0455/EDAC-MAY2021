package LinkedList;

public class prog1 {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next=null;
		}

	}

	void inserData(int d) {
		Node temp = head;
		Node newNode = new Node(d);
		if (temp == null) {
			head = newNode;
			return;
		}
		while (temp.next!= null) {
			temp = temp.next;

		}
		temp.next = newNode;
	}
	
	void inserAt(int d,int pos) {
		Node newNode=new Node(d);
		Node temp=head;
		Node prev=null;
		int count=0;
		if(pos==1) {
			newNode.next=temp;
			head=newNode;
			return;
		}
		while(count !=pos-1) {
			prev=temp;
			temp=temp.next;
			count++;
		}newNode.next=temp;
		prev.next=newNode;
	}

	void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
			
		}
			System.out.print(temp);
		
	
	}
	
	void delete(int key) {
		Node temp=head;
		Node prev=null;
		if(temp.data==key) {
			head=temp.next;
			return;
		}
		while(temp.next!=null && temp.data!=key) {
			prev=temp;
			temp=temp.next;
		}prev.next=temp.next;
		
	}

	public static void main(String[] args) {
		prog1 p=new prog1();
		p.inserData(10);
		p.inserData(20);
		p.inserData(30);
		//System.out.println("Head:"+p.head.data);
		
		p.display();
		System.out.println();
		p.inserData(40);
		p.inserData(50);
		p.inserData(60);
		p.display();
		System.out.println();
		p.inserAt(5,1);
		p.display();
		System.out.println();
		p.inserAt(500, 8);
		p.display();
		System.out.println();
		p.delete(40);
		p.display();

	}

}

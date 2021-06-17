package LinkedList;

import java.util.*;

public class ex4 {
	static Node head;
	static Scanner sc = new Scanner(System.in);

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	static void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println();
	}

	static void insert() {
		Node temp = head;
		if (temp == null) {
			System.out.println("Enter data");
			int data = sc.nextInt();
			Node newNode = new Node(data);
			head = newNode;
		} else {
			System.out.println("cannot add at first");
		}

	}

	static void insertAtFirst() {
		System.out.println("ENter data to add at first");
		int data = sc.nextInt();
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	static void insertLast() {
		Node temp = head;
		if (temp != null) {
			System.out.println("Enter data");
			int data = sc.nextInt();
			Node newNode = new Node(data);
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	static void insertAt(int pos) {
		Node temp = head;
		Node prev = null;
		int count = 0;
		System.out.println("Enter data to be inserted:");
		int data = sc.nextInt();
		Node newNode = new Node(data);
		if(pos==1) {
			newNode.next=head;
			head=newNode;
			return;
		}
		while (count != pos-1) {
			prev = temp;
			temp = temp.next;
			count++;
		}
		newNode.next = temp;
		prev.next = newNode;
	}

	static void deleteData() {
		Node temp = head;
		Node prev = null;
		System.out.println("ENter dataValue to be delete");
		int value = sc.nextInt();
		if (temp != null && temp.data == value) {
			head = temp.next;
			return;
		}
		while (temp.next != null && temp.data != value) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("Value not found");
			return;
		}
		prev.next = temp.next;
	}

	public static void main(String[] args) {
		insert();
		display();
		insertLast();
		insertLast();
		insertLast();
		display();
		insertLast();
		insertLast();
		display();
		 System.out.println("enter position at which node is to be inserted");
		 int pos=sc.nextInt();
		 insertAt(pos);
//		insertAtFirst();
		 display();
//		insertAtFirst();
//		display();
//		deleteData();
//		display();
//		deleteData();
//		display();
//		deleteData();
//		display();

	}

}

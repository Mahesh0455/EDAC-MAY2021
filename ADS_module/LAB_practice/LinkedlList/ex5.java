package LinkedList;

import java.util.*;

public class ex5 {
	static Node head;
	static Scanner sc = new Scanner(System.in);

	static class Node {
		int data;
		Node next, prev;

		Node(int data) {
			this.data = data;
			next = null;
			prev = null;
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

	static void displayReverse() {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		System.out.println("\nDisplay in Reverse order");
		while (temp != null) {

			System.out.print(temp.data + "-->");
			temp = temp.prev;
		}
		System.out.println();

	}

	static void insertAtFirst() {
		Node temp = head;
		if (temp != null) {
			System.out.println("\nEnter data value");
			int data = sc.nextInt();
			Node newNode = new Node(data);
			newNode.next = temp;
			temp.prev = newNode;
			head = newNode;

		}

	}

	static void insertLast() {
		Node temp = head;
		System.out.println("\nEnter data");
		int data = sc.nextInt();
		Node newNode = new Node(data);
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
	}

	static void insertBetween() {
		Node temp = head;
		int count = 1;
		System.out.println("\nEnter data and pos to add");
		int data = sc.nextInt();
		int pos = sc.nextInt();
		Node newNode = new Node(data);
		if(count==1) {
			newNode.next=temp;
			temp.prev=newNode;
			head=newNode;
			return;
		}
		while (temp != null && count != pos - 1) {

			temp = temp.next;
			count++;
		}
		newNode.next = temp.next;
		newNode.prev = temp;
		temp.next = newNode;
		newNode.next.prev = newNode;
		return;

	}

	static void deleteNode() {
		System.out.println("Enter value to be deleted");
		int val = sc.nextInt();
		Node temp = head;
		if (temp != null && temp.data == val) {
			head = temp.next;
			temp.next.prev = null;
			return;
		}
		while (temp != null && temp.data != val) {
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("Value not found");
			return;
		}
		if (temp.next == null) {
			temp.prev.next = null;
			return;
		}
		temp.next.prev = temp.prev;
		temp.prev.next = temp.next;
	}

	public static void main(String args[]) {
		ex5 e = new ex5();
		e.head = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);

		////// Linking NOdes..........////////

		head.next = n2;
		n2.prev = head;
		n2.next = n3;
		n3.prev = n2;
		n3.next = n4;
		n4.prev = n3;
		n4.next = n5;
		n5.prev = n4;
		display();
		insertAtFirst();
		display();
		displayReverse();
		// insertLast();newNode
		// display();
			insertAtFirst();
		  display();
		  displayReverse();

		// display();
		// insertBetween();
		// display();
		// displayReverse();
		deleteNode();
		display();
		displayReverse();
		System.out.println("****");
		insertBetween();
		display();
		displayReverse();
	}
}

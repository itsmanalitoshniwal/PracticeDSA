package singly_linked_list;

public class SinglyLL {
	static class Node {
		int data;
		Node next;

		Node() {
			data = 0;
			next = null;
		}

		Node(int value) {
			data = value;
			next = null;
		}
	}

	Node head;

	SinglyLL() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("List is Empty...");
		} else {
			Node trav = head;
			System.out.println("\nLinked list = ");
			while(trav!=null) {
				System.out.print(trav.data+"\t");
				trav = trav.next;
			}
		}
	}

	public void addFirst(int val) {
		// create a new node
		Node newnode = new Node(val);
		if (isEmpty()) {
			// head should point to newnode
			head = newnode;
		}
		else {
			//make before break
			//newnode's next should point to head
			newnode.next = head;
			//head should point to newnode
			head= newnode;
		}
	}
	
	public void addLast(int val) {
		if(isEmpty()) {
			addFirst(val);
		}
		else {
			//create new node
			Node newnode = new Node(val);
			//traverse till last node
			Node trav = head;
			while(trav.next!=null) {
				trav = trav.next;
			}
			trav.next= newnode;
		}
	}
	
	public void addAtPos(int val, int pos) {
		if(isEmpty()|| head.next==null) {
			addFirst(val);
		}
		else {
			//create new node
			Node newnode= new Node(val);
			//traverse till pos -1 
			Node trav= head;
			for(int i=1; i<pos-1 ; i++) {
				if(trav == null) {
					System.out.println("given position is beyond size so adding at last pos");
					addLast(val);
					return;
				}
				trav = trav.next;	
				
			}
			newnode.next= trav.next;
			trav.next=newnode;
		}
		
	}
	public void delFirst() {
		if(isEmpty()) {
			System.out.println("List is already empty! cant delete element from empty list");
		}
		else if(head.next==null) {
			head = null;
		}
		else {
			head = head.next;
		}
	}
	
	public void deleteLast() {
		if(isEmpty()) {
			System.out.println("List is already empty! cant delete element from empty list");
		}
		else if(head.next==null) {
			head = null;
		}
		else {
			//trav till last but one node
			Node trav = head;
			while(trav.next.next!=null) {
				trav = trav.next;
			}
			trav.next=null;
		}
	}
	
	public void delAtPos(int pos) {
		if(isEmpty()) {
			System.out.println("List is already empty! cant delete element from empty list");
		}
		else if(head.next==null) {
			head = null;
		}
		else {
			Node trav=head;
			for(int i=1; i<pos-1;i++) {
				if(trav.next.next==null) {
					trav.next=null;
					return;
				}
				trav=trav.next;
			}
			trav.next=trav.next.next;
		}
		
	}

	public void deleteAll() {
		head = null;
		System.out.println("deleted all nodes in Linked List...");
	}
	
	public int min() {
		int min;
		if(head.data < head.next.data) {
			min = head.data;
		}
		else {
			min = head.next.data;
		}
		
		//traverse till last node
		Node trav = head;
		while(trav.next!=null) {
			if(min > trav.data) {
				System.out.println("trav "+trav.data);
				System.out.println("trav.next "+trav.next.data);
				min = trav.data;
			}
			trav = trav.next;
			
		}
		return min;
	}
	
	public int max() {
		int max;
		if(head.data > head.next.data) {
			max = head.data;
		}
		else {
			max = head.next.data;
		}
		
		//traverse till last node
		Node trav = head;
		while(trav.next!=null) {
			if(max <trav.data) {
				System.out.println("trav "+trav.data);
				System.out.println("trav.next "+trav.next.data);
				max = trav.data;
			}
			trav = trav.next;
			
		}
		return max;
	}
	
	public int mid() {
		int mid;
		Node slow = head;
		System.out.println("Linked list = ");
		display();
		int count=0;
		Node trav = head;
		while(trav.next!=null) {
			trav = trav.next;
			count++;
			if(count%2==0)
				slow= slow.next;
		}
		mid = slow.data;
		return mid;
	}
	public void sort() {
		Node i,j;
		int temp;
		for(i=head; i!=null; i=i.next) {
			for(j=i.next; j!=null; j=j.next) {
				if(i.data > j.data) {
					//swap
					temp= i.data;
					i.data=j.data;
					j.data=temp;
				}
			}
		}
		display();
	}
	
}

import java.util.*;

class LinkedList {
	Node head;
	
	static class Node {
		int value;
		Node next;
		Node (int value) {
			this.value = value;
		}
	}
	
	void printlist(){
		Node a = head;
		while(a != null) {
			System.out.println(a.value);
			a = a.next;
		}
	}

	public static void main(String args[]){
		LinkedList ll = new LinkedList();
		ll.head = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		ll.head.next = n2;
		n2.next = n3;
		n3.next = n4;
		ll.printlist();
	}
}

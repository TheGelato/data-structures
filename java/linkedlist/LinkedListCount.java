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
		return ;
	}
	int iterative_count () {
		int count = 0;
		Node temp = head;
		if(temp == null) {
			return count;
		}
		else {
			count ++;
		}
		while (temp.next!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	int recursive_count (Node node) {
		if (node == null) {
			return 0;
		}
		else if (node.next == null) {
			return 1;
		}
		return 1 + recursive_count(node.next);
	}
	int getRecursiveCount() {
        return recursive_count(head);
    }
	public static void main(String args[]){
		LinkedList ll = new LinkedList();
		ll.head = new Node(1);
		Node n2 = new Node(2);
		ll.head.next = n2;
		Node n3 = new Node(3);
		n2.next = n3;
		Node n4 = new Node(4);
		n3.next = n4;
		System.out.println(ll.iterative_count());
		System.out.println(ll.getRecursiveCount());
	}
}

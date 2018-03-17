package linkedlist;

public class LinkedList {
	Node head;
	int listCount;

	LinkedList(){
		head = null;
		listCount = 0;
	}

	public void add(int data) {
		Node temp = new Node(data);

		if(head == null) {
			head = temp;
			listCount++;
		}
		else {
			Node current = head;
			
			while(current.next != null) {
				current = current.next;
			}
			current.next = temp;
			listCount++;
		}
	}

	public void add(int data, int position) {
		Node temp = new Node(data);
		if(position == 0) {
			temp.next = head;
			head = temp;
			listCount++;
		}
		else {
			Node current = head;
			for(int i = 1; i < position && current.next != null; i++) {
				current = current.next;
			}
			temp.next = current.next;
			current.next = temp;
			listCount++;
		}
	}

	public Node search(int target) {
		Node current = this.head;
		while(current != null) {
			if(current.data == target)
				return current;
			current = current.next;
		}
		return null;
	}

	public void delete(int target) {
		if(head.data == target) {
			head = head.next;
			return;
		}else {
			Node prev = head;
			Node current = head.next;
			while(current != null) {
				if(current.data == target) {
					prev.next = current.next;
					current.next = null;
					return;
				}
			}
		}
	}

	public void printList(){
		Node current = head;
		while(current != null) {
			if(current.next == null) {
				System.out.print(current.data+"");
			}else {
				System.out.print(current.data+"->");
			}
			current = current.next;
		}
		System.out.println();
	}
}

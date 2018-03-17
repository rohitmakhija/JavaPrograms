package linkedlist;

public class LinkedListProblems {

	public void printList(Node head){
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

	public boolean checkLoop(Node head) {
		Node fastPointer = head;
		Node slowPointer = head;
		
		while(fastPointer.next != null && fastPointer.next.next != null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;

			if(fastPointer == slowPointer) {
				return true;
			}
		}
		return false;
	}
	
	public Node firstNodeOfLoop(Node head) {
		Node fastPointer = head;
		Node slowPointer = head;
		boolean loopExists = false;

		while(fastPointer.next != null && fastPointer.next.next != null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;

			if(fastPointer == slowPointer) {
				loopExists = true;
				break;
			}
		}

		if(loopExists) {
			slowPointer = head;
			while(slowPointer != fastPointer) {
				slowPointer = slowPointer.next;
				fastPointer = fastPointer.next;
			}
			return slowPointer;
		}
		return null;
	}

	public Node findMiddleNode(Node head) {
		Node fastPointer = head;
		Node slowPointer = head;
		
		while(fastPointer.next != null && fastPointer.next.next != null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
		}

		return slowPointer;
	}
	
	public Node reverseLinkedList(Node head) {
		Node previousNode = null;
		Node currentNode = head;
		Node nextNode;
	
		while(currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;
	}
	
	public Node recursiveReverseLinkedList(Node node) {
		if(node == null || node.next == null)
			return node;
		Node remaining = recursiveReverseLinkedList(node.next);
		node.next.next = node;
		node.next = null;
		
		return remaining;
	}
	
	public boolean checkPalindrome(Node head) {
		
	}
}

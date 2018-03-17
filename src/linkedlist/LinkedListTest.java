package linkedlist;
import linkedlist.LinkedListProblems;
public class LinkedListTest {
	public static void main(String args[]) {
		LinkedList l = new LinkedList();
		l.add(2); l.add(6); l.add(0,0); l.add(1, 1); l.add(7); l.add(9);
		l.printList();
		
		//Check if loop exists
		Node temp = new Node(8);
		Node temp1 = new Node(9);
		Node temp2 = new Node(10);
		temp.next = temp1;
		temp1.next = temp2;
		temp2.next = temp;
		
		LinkedListProblems lp = new LinkedListProblems();
		System.out.println(lp.checkLoop(l.head));
		System.out.println(lp.checkLoop(temp));
		
		System.out.println(lp.firstNodeOfLoop(temp));
		System.out.println(lp.firstNodeOfLoop(l.head));
		
		System.out.println(lp.findMiddleNode(l.head));
	}
}

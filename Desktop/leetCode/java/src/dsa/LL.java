package dsa;

public class LL {
	
	Node head;
	class Node{
		String data;
		Node next;
		Node(String data){
			this.data = data;
			this.next = null;
		}
	}
	
	
	//Adding an element to the beginning of the list
	/*
	1. Let's assume we don't have any node initially that means first we have to create a head
	2. Now let's assume we already have a list in this case we have to point newData to head
	3. Once the newData is pointed to head, now we need to shift head back to this newNode.
	 */
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	//Adding an element to the end of the list
		public void addLast(String data) {
			Node newNode = new Node(data);
			if(head==null) {
				head = newNode;
				return;
			}
			Node currentNode = head; // It is a temporary node in which we are storing head so that we don't lose
			                         //its value during any operation
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode; // here new nowNode will automatically point to null.
		}

		/*
		shift the head to the next only it will automatically destroy the first node.
		 */
		public void deleteFirst() {
			if(head==null) {
				System.out.println("list is empty");
				return;
			}
			head = head.next;
		}

		/*
		Logic: if head is null then we will tell the user that the list is empty
		But if we have a list then we have to iterate till the last of the list meanwhile
		shifting the head of list every time towards the last and when we reach the second last node
		i.e., head.next = null then we shift head to the previous node to it and then point the next of
		that node to null.
		 */
		public void deleteLast() {
			if(head==null) {
				System.out.println("List is empty");
			}
			Node lastNode = head.next;
			Node secondLast =head;
			while(lastNode.next!= null) {
				secondLast = secondLast.next;
				lastNode = lastNode.next;
			}
			secondLast.next = null;
		}
	
		
		// reversing list using loop
		public void reverseList() {
			Node prevNode = head; // temporary node to store the previous node.
			Node currNode = head.next; // node to store node next to first node or prevNode
			
			while(currNode != null) {
				/*
				Apply a simple logic to replace the value with the use of a
				third variable i.e., nextNode
				 */
				Node nextNode = currNode.next;
				currNode.next = prevNode;
				
				//update values 
				prevNode = currNode;
				currNode = nextNode;
			}
			head.next=null;
			head = prevNode;
		}
		
		
		// reversing using recursion
		public Node reverseItr(Node head)
		{
			if(head==null || head.next == null) {
				return head;
			}
			Node newHead = reverseItr(head.next);
			head.next.next = head;
			head.next = null;
			return newHead;
		}
		
		
	public void printList() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(" "+currentNode.data);
			currentNode = currentNode.next;
		}
	}

	public static void main(String[] args) {
		LL obj = new LL();
		obj.addFirst("1");
		obj.addFirst("2");
		obj.addFirst("3");
		obj.addLast("hello");
		obj.addLast("List");
		obj.addLast("end");
//		obj.deleteLast();
//		obj.deleteFirst();
		obj.printList();
		obj.reverseList();
		obj.head = obj.reverseItr(obj.head);
		obj.printList();

	}
}

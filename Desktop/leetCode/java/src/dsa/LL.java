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
			Node currentNode = head;
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
		
		public void deleteFirst() {
			if(head==null) {
				System.out.println("list is empty");
				return;
			}
			head = head.next;
		}
		
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
	
		
		// reversing using loop
		public void reverseList() {
			Node prevNode = head;
			Node currNode = head.next;
			
			while(currNode != null) {
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

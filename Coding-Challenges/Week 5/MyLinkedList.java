
public class MyLinkedList<T> {
	
	Node head;
	
	private class Node {
		
		T element;
		Node next;
		
		Node (T element) {
			this.element = element;
			this.next = null;
		}
	}
	
	public int size() {
		int size = 0;
		
		if (this.head == null) {
			return size;
		}
		else {
			Node currentNode = this.head;
			
			while (currentNode != null) {
				size++;
				currentNode = currentNode.next;
			}
		}
		return size;
	}
	
	public T getElement() {
		
		if (this.head == null) {
			return null;
		}
		else {
			return this.head.element;
		}
	}
	
	public void insert(T element) {
		
		Node newNode = new Node(element); 
		newNode.next = null; 

		if (this.head == null) { 
			this.head = newNode; 
		} 
		else { 
			Node lastNode = this.head; 
			while (lastNode.next != null) { 
				lastNode = lastNode.next; 
			} 
			
			lastNode.next = newNode; 
		} 
	  
	}
	
	public T remove() {
		
		T element = null;
		
		if (this.head != null) {
			element = this.head.element;
			this.head = this.head.next;
		}
		
		return element;
	}
}

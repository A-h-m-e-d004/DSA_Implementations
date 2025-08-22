package DSA.LinkedListImplementation;

class Node {
	int data;
	Node next;

	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class SingleLinkedList {
	Node head;

	public void add(int data){
		Node newNode = new Node(data);
		if (head == null){
			head = newNode;
			return;
		}
		Node current = head;
		while (current.next != null){
			current = current.next;
		}
		current.next = newNode;
	}

	public void delete(int data){
		Node current = head;
		if (head == null){
			return;
		}
		if (current.data == data){
			head = current.next;
		}
		while (current.next != null){
			if (current.next.data == data){
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}

	public int search(int data){
		Node current = head;
		int index = 0;
		while (current != null){
			if (current.data == data){
				return index;
			}
			current = current.next;
			index++;
		}
		return -1;
	}

	public void insert(int data, int position){
		Node newNode = new Node(data);
		Node current = head;
		if (position == 0){
			head = newNode;
			head.next = current;
			return;
		}
		Node previes = null;
		Node nextNode = null;
		if (position < length()){
			int i = 1;
			while (current.next != null){
				if (i == position){
					previes = current;
					nextNode = current.next;
					break;
				}
				current = current.next;
				i++;
			}
			previes.next = newNode;
			newNode.next = nextNode;
		}else{
			System.out.println("Out of the range");
		}
	}

	public int length(){
		Node current = head;
		int count = 0;
		while (current != null){
			current = current.next;
			count++;
		}
		return count;
	}

	public void display(){
		Node current = head;
		while (current != null){
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
}

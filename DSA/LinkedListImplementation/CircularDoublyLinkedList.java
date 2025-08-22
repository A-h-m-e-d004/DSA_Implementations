package DSA.LinkedListImplementation;

class CircularNode {
	int data;
	CircularNode next;
	CircularNode prev;
	CircularNode (int data) {
		this.data = data;
	}
}

public class CircularDoublyLinkedList {
	CircularNode head;
	CircularNode tail;

	public void add(int data){
		CircularNode newNode = new CircularNode(data);
		if (head == null){
			head = tail = newNode;
			head.next = newNode;
			head.prev = newNode;
		}else{
			tail.next = newNode;
			newNode.prev = tail;
			newNode.next = head;
			head.prev = newNode;
			tail = newNode;
		}
	}

	public void delete(int data){
		if (head == null) return;
		if (head == tail && head.data == data){
			head = tail = null;
			return;
		}
		if (head.data == data){
			tail.next = head.next;
			head.next.prev = tail;
			head = head.next;
			return;
		}
		if (tail.data == data){
			head.prev = tail.prev;
			tail.prev.next = head;
			tail = tail.prev;
			return;
		}
		CircularNode current = head.next;
		while (current != tail){
			if (current.data == data){
				current.prev.next = current.next;
				current.next.prev = current.prev;
				return;
			}
			current = current.next;
		}
	}

	public void test(){
		System.out.println(tail.prev.data);
	}

	public void display(){
		CircularNode current = head;
		while (current != tail){
			System.out.println(current.data);
			current = current.next;
		}
		System.out.println(tail.data);
	}
}

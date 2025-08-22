package DSA.LinkedListImplementation;

class DoublyNode {
	int data;
	DoublyNode next;
	DoublyNode prev;

	DoublyNode(int data){
		this.data = data;
		next = null;
		prev = null;
	}
}

public class DoublyLinkedLists {
	DoublyNode head;
	DoublyNode tail;

	public void add(int data){
		DoublyNode newNode = new DoublyNode(data);
		if (head == null){
			head = tail = newNode;
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}

	public void delete(int data){
		DoublyNode current = head;
		if (current != null && current.data == data){
			head = head.next;
			if (head != null){
				head.prev = null;
			}else{
				tail = null;
			}
			return;
		}
		while (current != null){
			if (current.data == data){
				if (current.prev != null){
					current.prev.next = current.next;
				}
				if (current.next != null){
					current.next.prev = current.prev;
				}
				else{
					tail = current.prev;
				}
			}
			current = current.next;
		}
	}

	public void insertAtIndex(int index, int data){
		DoublyNode newNode = new DoublyNode(data);
		DoublyNode current = head;
		if (index < 0 || index > length()){
			System.out.println("out of the range");
			return;
		}
		if (index == 0){
			if (head != null){
				head = newNode;
				head.next = current;
				head.prev = null;
			}
			if (head == null){
				head = tail = newNode;
			}
		}

		for (int i = 1; i < index; i++) {
			current = current.next;
		}
		newNode.next = current.next;
		newNode.prev = current;
		current.next = newNode;
	}

	public void displayForward(){
		DoublyNode current = head;
		System.out.print("null <--> ");
		while (current != null){
			System.out.print(current.data + " <--> ");
			current = current.next;
		}
		System.out.print("null");
	}

	public void displayBackword(){
		DoublyNode current = tail;
		System.out.print("null <--> ");
		while (current != null){
			System.out.print(current.data + " <--> ");
			current = current.prev;
		}
		System.out.print("null");
	}

	public int length(){
		DoublyNode current = head;
		int count = 0;
		while (current != null){
			count++;
			current = current.next;
		}
		return count;
	}
}

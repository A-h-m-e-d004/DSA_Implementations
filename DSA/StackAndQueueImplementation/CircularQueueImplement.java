package DSA.StackAndQueueImplementation;

public class CircularQueueImplement {
	int[] arr;
	int front;
	int rear;
	int count;
	int size;

	public CircularQueueImplement(int size){
		this.size = size;
		arr = new int[size];
		front = 0;
		rear = -1;
		count = 0;
	}

	public void enqueue(int data){
		if (count == size){
			System.out.println("Queue is full");
			return;
		}
		rear = (rear + 1) % size;
		arr[rear] = data;
		count++;
	}

	public int dequeue(){
		if (count == 0){
			System.out.println("Queue is empty");
			return -1;
		}
		int frontData = arr[front];
		arr[front] = 0;
		front = (front + 1) % size;
		count--;
		if (count == 0){
			front = 0;
			rear = -1;
		}
		return frontData;
	}

	public void display(){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}






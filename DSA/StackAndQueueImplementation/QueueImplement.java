package DSA.StackAndQueueImplementation;

public class QueueImplement {
	int[] arr;
	int size;
	int top;
	int end;

	public QueueImplement(int size){
		this.size = size;
		arr = new int[size];
		top = 0;
		end = -1;
	}

	public void enqueue(int data){
		if (end == arr.length-1){
			System.out.println("Queue is full");
			return;
		}
		end++;
		arr[end] = data;
	}

	public int dequeue(){
		if (isEmpty()){
			return -1;
		}
		int frontElemnt = arr[top];
		arr[top] = 0;
		top++;
		if (top > end){
			top = 0;
			end = -1;
		}
		return frontElemnt;
	}

	public int peek(){
		if (isEmpty()){
			return -1;
		}
		return arr[top];
	}

	public boolean isEmpty(){
		return top > end;
	}

	public void display(){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

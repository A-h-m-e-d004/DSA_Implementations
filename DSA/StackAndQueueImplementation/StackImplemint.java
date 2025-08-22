package DSA.StackAndQueueImplementation;

public class StackImplemint {
	int[] arr;
	int size;
	int end;

	public StackImplemint(int size){
		this.size = size;
		arr = new int[size];
		end = -1;
	}

	public void push(int data){
		if (end == arr.length-1){
			System.out.println("Stack is full");
			return;
		}
		end++;
		arr[end] = data;
	}

	public int pop(){
		if (isEmpty()){
			return -1;
		}
		int popElyment = arr[end];
		arr[end] = 0;
		end--;
		return popElyment;
	}

	public int peek(){
		if (isEmpty()){
			return -1;
		}
		return arr[end];
	}

	public boolean isEmpty(){
		return end == -1;
	}

	public void display(){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

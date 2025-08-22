package DSA.HeapImplementation;

public class MaxHeap {
	int[] heap;
	int capacity;
	int size;

	public MaxHeap(int capacity){
		this.capacity = capacity;
		heap = new int[capacity];
		size = 0;
	}

	private int perant(int i) {return (i-1) / 2;}
	private int left(int i) {return (i*2) + 1;}
	private int right(int i) {return (i*2) + 2;}
	private void swap(int i, int j){
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}

	public void insert(int data){
		if (size == capacity){
			System.out.println("Heap is full");
			return;
		}
		heap[size] = data;
		int current = size;
		size++;
		while (current != 0 && heap[perant(current)] < heap[current]){
			swap(perant(current), current);
			current = perant(current);
		}
	}

	public int delete(){
		if (size == 0) return -1;
		if (size == 1) return heap[--size];

		int root = heap[0];
		heap[0] = heap[--size];
		maxHeapify(0);
		return root;
	}

	private void maxHeapify(int i){
		int l  = left(i);
		int r = right(i);
		int biggest = i;

		if (l < size && heap[l] > heap[biggest]){
			biggest = l;
		}
		if (r < size && heap[r] > heap[biggest]){
			biggest = r;
		}

		if (biggest != i){
			swap(i, biggest);
			maxHeapify(biggest);
		}
	}

	public void display(){
		for (int i : heap){
			System.out.print(i + " ");
		}
	}
}

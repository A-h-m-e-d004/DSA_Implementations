package DSA.HeapImplementation;

public class MinHeap {
	int[] heap;
	int size;
	int capacity;

	public MinHeap(int capacity){
		this.capacity = capacity;
		heap = new int[capacity];
		size = 0;
	}

	private int perant(int i){return (i-1)/2;}
	private int left(int i){return (2*i)+1;}
	private int right(int i){return (2*i)+2;}
	private void swap(int i, int j){
		int tamp = heap[i];
		heap[i] = heap[j];
		heap[j] = tamp;
	}

	public void insert(int data){
		if (size == capacity){
			System.out.println("The heap is full");
			return;
		}
		heap[size] = data;
		int current = size;
		size++;
		while (current != 0 && heap[perant(current)] > heap[current]){
			swap(perant(current), current);
			current = perant(current);
		}
	}

	public int delete(){
		if (size <= 0) return -1;
		if (size == 1) return heap[--size];

		int root = heap[0];
		heap[0] = heap[--size];
		minHeapify(0);
		return root;
	}

	private void minHeapify(int i){
		int l = left(i);
		int r = right(i);
		int smallest = i;

		if (l < size && heap[l] < heap[smallest]){
			smallest = l;
		}
		if (r < size && heap[r] < heap[smallest]){
			smallest = r;
		}
		if (smallest != i){
			swap(i, smallest);
			minHeapify(smallest);
		}
	}

	public void display(){
		for (int j : heap) {
			System.out.print(j + " ");
		}
	}
}

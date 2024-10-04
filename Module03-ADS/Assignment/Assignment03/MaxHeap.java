import java.util.Arrays;

class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    // Constructor to initialize the max heap
    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    // Get the index of the parent of a node
    private int parent(int i) {
        return (i - 1) / 2;
    }

    // Get the index of the left child of a node
    private int leftChild(int i) {
        return 2 * i + 1;
    }

    // Get the index of the right child of a node
    private int rightChild(int i) {
        return 2 * i + 2;
    }

    // Insert a new element into the heap
    public void insert(int key) {
        if (size == capacity) {
            System.out.println("Heap is full!");
            return;
        }

        // Insert the new element at the end of the array
        heap[size] = key;
        size++;

        // Fix the max-heap property if it's violated
        int current = size - 1;
        while (current != 0 && heap[current] > heap[parent(current)]) {
            // Swap the current node with its parent
            int temp = heap[current];
            heap[current] = heap[parent(current)];
            heap[parent(current)] = temp;

            // Move to the parent's index
            current = parent(current);
        }
    }

    // Extract the maximum element (root) from the heap
    public int extractMax() {
        if (size <= 0) {
            System.out.println("Heap is empty!");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            size--;
            return heap[0];
        }

        // Store the maximum value and remove it from the root
        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;

        // Heapify the root to maintain the max-heap property
        maxHeapify(0);

        return root;
    }

    // Heapify the tree rooted at index i
    private void maxHeapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int largest = i;

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != i) {
            // Swap and continue heapifying
            int temp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = temp;
            maxHeapify(largest);
        }
    }

    // Function to print the heap
    public void printHeap() {
        System.out.print("Max-Heap = [");
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]);
            if (i != size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // 1
        MaxHeap maxHeap1 = new MaxHeap(10);
        maxHeap1.insert(12);
        maxHeap1.insert(7);
        maxHeap1.insert(15);
        maxHeap1.insert(5);
        System.out.println("Extracted Max = " + maxHeap1.extractMax());
        maxHeap1.printHeap();

        // 2
        MaxHeap maxHeap2 = new MaxHeap(10);
        maxHeap2.insert(8);
        maxHeap2.insert(20);
        maxHeap2.insert(10);
        maxHeap2.insert(3);
        System.out.println("Extracted Max = " + maxHeap2.extractMax());
        maxHeap2.printHeap();
    }
}


// Test Case 1:
// Input: Insert 12, 7, 15, 5, Extract Max
// Output: Max-Heap = [12, 7, 5], Extracted Max = 15
// Test Case 2:
// Input: Insert 8, 20, 10, 3, Extract Max
// Output: Max-Heap = [10, 8, 3], Extracted Max = 20


// Time Complexity:
// Insert: O(log n)   where n is the number of elements in the heap.
// Extract Max: O(log n)
// MaxHeapify: O(logn)
// Display: O(n)

// Space Comlexity: O(n)  Where n is the number of elements in the array.
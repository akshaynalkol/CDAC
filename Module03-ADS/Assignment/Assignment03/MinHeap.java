import java.util.Arrays;

class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
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

        // Insert the new element at the end
        heap[size] = key;
        size++;

        // Fix the min-heap property if it's violated
        int current = size - 1;
        while (current != 0 && heap[current] < heap[parent(current)]) {
            // Swap the current node with its parent
            int temp = heap[current];
            heap[current] = heap[parent(current)];
            heap[parent(current)] = temp;

            // Move to the parent's index
            current = parent(current);
        }
    }

    // Extract the minimum element from the heap
    public int extractMin() {
        if (size <= 0) {
            System.out.println("Heap is empty!");
            return Integer.MAX_VALUE;
        }

        if (size == 1) {
            size--;
            return heap[0];
        }

        // Store the minimum value and remove it
        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;

        // Heapify the root to maintain the min-heap property
        minHeapify(0);

        return root;
    }

    // Heapify the tree rooted at index i
    private void minHeapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int smallest = i;

        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }

        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            // Swap and continue heapifying
            int temp = heap[i];
            heap[i] = heap[smallest];
            heap[smallest] = temp;
            minHeapify(smallest);
        }
    }

    // Function to print the heap
    public void printHeap() {
        System.out.print("Min-Heap = [");
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
        MinHeap minHeap1 = new MinHeap(10);
        minHeap1.insert(10);
        minHeap1.insert(15);
        minHeap1.insert(20);
        minHeap1.insert(17);
        System.out.println("Extracted Min = " + minHeap1.extractMin());
        minHeap1.printHeap();

        // 2
        MinHeap minHeap2 = new MinHeap(10);
        minHeap2.insert(30);
        minHeap2.insert(40);
        minHeap2.insert(20);
        minHeap2.insert(50);
        System.out.println("Extracted Min = " + minHeap2.extractMin());
        minHeap2.printHeap();
    }
}


// Test Case 1:
// Input: Insert 10, 15, 20, 17, Extract Min
// Output: Min-Heap = [15, 17, 20], Extracted Min = 10
// Test Case 2:
// Input: Insert 30, 40, 20, 50, Extract Min
// Output: Min-Heap = [30, 40, 50], Extracted Min = 20


// Time Complexity:
// Insert: O(log n)   where n is the number of elements in the heap.
// Extract Max: O(log n)
// MaxHeapify: O(logn)
// Display: O(n)

// Space Comlexity: O(n)  Where n is the number of elements in the array.
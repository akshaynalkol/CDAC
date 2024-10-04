public class ImplementPriorityQueueUsingHeap2{
    static class Element {
        int value;
        int priority;

        Element(int value, int priority) {
            this.value = value;
            this.priority = priority;
        }
    }

    // Priority Queue as a Max-Heap
    static class MaxHeap {
        private Element[] heap;
        private int size;
        private int capacity;

        public MaxHeap(int capacity) {
            this.capacity = capacity;
            this.size = 0;
            this.heap = new Element[capacity];
        }

        public void insert(int value, int priority) {
            if (size == capacity) {
                System.out.println("Heap is full!");
                return;
            }
            Element newElement = new Element(value, priority);
            heap[size] = newElement;
            size++;

			int index=size-1;
			int parentIndex = (index - 1) / 2;
            while (index > 0 && heap[parentIndex].priority < heap[index].priority) {
                swap(parentIndex, index);
                index = parentIndex;
                parentIndex = (index - 1) / 2;
            }
        }

        public Element extractMax() {
            if (size == 0) {
                System.out.println("Heap is empty!");
                return null;
            }
            Element max = heap[0];
            heap[0] = heap[size - 1];
            size--;
            maxHeapify(0);
			
            return max;
        }

        private void maxHeapify(int index) {
            int largest = index;
            int left = 2 * index + 1;
            int right = 2 * index + 2;

            if (left < size && heap[left].priority > heap[largest].priority) {
                largest = left;
            }

            if (right < size && heap[right].priority > heap[largest].priority) {
                largest = right;
            }

            if (largest != index) {
                swap(index, largest);
                maxHeapify(largest);
            }
        }

        private void swap(int i, int j) {
            Element temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
        }


        public void display() {
            System.out.print("Priority Queue = [");
            for (int i = 0; i < size; i++) {
                System.out.print(heap[i].value);
                if (i != size - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        //  1
        MaxHeap pq = new MaxHeap(10);
        pq.insert(3, 1);  
        pq.insert(10, 3); 
        pq.insert(5, 2);  
        
        pq.display(); 

        Element max = pq.extractMax();
        System.out.println("Dequeued element = " + max.value); 
        
        pq.display(); 


        // 2
        MaxHeap pq2 = new MaxHeap(10);
        pq2.insert(7, 4);  
        pq2.insert(8, 2);  
        pq2.insert(6, 3);  
        
        pq2.display(); 
		
        Element max2 = pq2.extractMax();
        System.out.println("Dequeued element = " + max2.value); 

        pq2.display();
    }
}


// Test Case:1
// Input: Enqueue with priorities: 3 (priority 1), 10 (priority 3), 5 (priority 2), Dequeue
// Output: Dequeued element = 10 (highest priority), Priority Queue = [5, 3]
// Test Case:2
// Input: Enqueue with priorities: 7 (priority 4), 8 (priority 2), 6 (priority 3), Dequeue
// Output: Dequeued element = 7, Priority Queue = [6, 8]


// Time Complexity:
// Insert: O(log n)     where n is the number of elements in the heap.
// Extract Max: O(log n)
// MaxHeapify: O(logn)
// Display: O(n)

// Space Comlexity: O(n)  Where n is the number of elements in the array.
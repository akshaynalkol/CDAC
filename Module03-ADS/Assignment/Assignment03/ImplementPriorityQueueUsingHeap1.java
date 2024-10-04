import java.util.PriorityQueue;
import java.util.Comparator;

class Element{
	int value;
	int priority;
		
	Element(int value, int priority){
		this.value=value;
		this.priority=priority;
	}
}
	
public class ImplementPriorityQueueUsingHeap1{
	private PriorityQueue<Element> pq;
	
	public ImplementPriorityQueueUsingHeap(){
		pq=new PriorityQueue<>(new Comparator<Element>(){
			@Override
			public int compare(Element e1, Element e2) {
                return e2.priority - e1.priority; 
            }
		});
	}
	
	public void enqueue(int value, int priority){
		Element e=new Element(value,priority);
		pq.add(e);
	}
	
	public int dequeue(){
		if(pq.isEmpty()){
			 System.out.println("Queue is empty");
            return -1;
		}
		return pq.poll().value;
	}
	
	public void display(){
		PriorityQueue<Element> temp = new PriorityQueue<>(pq);
		System.out.print("Priority Queue = [");
        while (!temp.isEmpty()) {
            System.out.print(temp.poll().value);
            if (!temp.isEmpty()) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
	}
	
	public static void main(String[] args){
		// 1
		ImplementPriorityQueueUsingHeap pq1=new ImplementPriorityQueueUsingHeap();
		pq1.enqueue(3,1);
		pq1.enqueue(10,3);
		pq1.enqueue(5,2);
		pq1.dequeue();
		pq1.display();
		
		// 2
		ImplementPriorityQueueUsingHeap pq2=new ImplementPriorityQueueUsingHeap();
		pq2.enqueue(7,4);
		pq2.enqueue(8,2);
		pq2.enqueue(6,3);
		pq2.dequeue();
		pq2.display();
	}
}


// Test Case 1:
// Input: Enqueue with priorities: 3 (priority 1), 10 (priority 3), 5 (priority 2), Dequeue
// Output: Dequeued element = 10 (highest priority), Priority Queue = [5, 3]
// Test Case 2:
// Input: Enqueue with priorities: 7 (priority 4), 8 (priority 2), 6 (priority 3), Dequeue
// Output: Dequeued element = 7, Priority Queue = [6, 8]


// Time Complexity:
// Enqueue: O(log n)   where n is the number of elements in the heap.
// Dequeue: O(log n)
// Display: O(n log n)

// Space Comlexity: O(n)  Where n is the number of elements in the queue.
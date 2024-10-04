class Queue{
	private int size;
	private int arr[];
	private int front;
	private int rear;
	
	public Queue(int size){
		this.size=size;
		this.arr=new int[size];
		this.front=-1;
		this.rear=-1;
	}
	
	public boolean isEmpty(){
		return this.front==-1;
	}
	
	public boolean isFull(){
		return this.rear==this.size-1;
	}
	
	public void enqueue(int x){
		if(this.isFull()){
			System.out.println("Queue is full !");
			return;
		}
		if(front==-1)
			front=0;
		arr[++rear]=x;
	}
	
	public int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty!");
			return -1;
		}
		int x = arr[front++];
		if (front > rear){
			front = -1;
			rear = -1;
		}
		return x;
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("Queue is empty!");
			return;
		}
	
		System.out.print("Queue = [");
		for(int i=front;i<=rear;i++)
		{
			System.out.print(arr[i]);
			if (i != rear) {
                System.out.print(", ");
            }
		}
		System.out.println("]");
	}
}

public class ImplementQueueUsingArray{
	public static void main(String[] args){
		// 1
		Queue q1=new Queue(5);
		q1.enqueue(5);
		q1.enqueue(10);
		System.out.println("Dequeued element = "+q1.dequeue());
		q1.display();
		
		// 2
		Queue q2=new Queue(5);
		q2.enqueue(1);
		q2.enqueue(2);
		q2.enqueue(3);
		System.out.println("Dequeued element = "+q2.dequeue());
		System.out.println("Dequeued element = "+q2.dequeue());
		q2.display();
	}
}


// Test Case 1:
// Input: Enqueue 5, Enqueue 10, Dequeue
// Output: Queue = [10], Dequeued element = 5
// Test Case 2:
// Input: Enqueue 1, 2, 3, Dequeue, Dequeue
// Output: Queue = [3], Dequeued elements = 1, 2


// Time Complexity: O(size)
// Space Complexity: O(size)
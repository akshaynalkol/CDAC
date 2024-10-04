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
		return (this.rear+1)%this.size==this.front;
	}
	
	public void enqueue(int x){
		if(this.isFull()){
			System.out.println("Queue is full !");
			return;
		}
		if(front==-1)
			front=0;
		rear=(rear+1)%size;
		arr[rear]=x;
	}
	
	public int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty!");
			return -1;
		}
		
		int x = arr[front];
		front=(front+1)%size;
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
	
		/* 1
		System.out.print("Queue = [");
		int i=front;
		while(i!=rear){
			System.out.print(arr[i]+" ");
			if (i != rear) {
                System.out.print(", ");
            }
			i=(i+1)%size;
		}
		System.out.println(arr[rear]+"]");*/
		
		// 2
		System.out.print("Queue = [");
        int i = front;
        while (true) {
            System.out.print(arr[i]);
            if (i == rear) break;
            i = (i + 1) % size; 
            System.out.print(", ");
        }
        System.out.println("]");
	}
}

public class ImplementCircularQueueUsingArray{
	public static void main(String[] args){
		// 1
		Queue q1=new Queue(5);
		q1.enqueue(4);
		q1.enqueue(5);
		q1.enqueue(6);
		q1.enqueue(7);
		q1.dequeue();
		q1.enqueue(8);
		q1.display();
		
		// 2
		Queue q2=new Queue(5);
		q2.enqueue(1);
		q2.enqueue(2);
		q2.enqueue(3);
		q2.enqueue(4);
		q2.dequeue();
		q2.dequeue();
		q2.enqueue(5);
		q2.display();
	}
}


// Test Case 1:
// Input: Enqueue 4, 5, 6, 7, Dequeue, Enqueue 8
// Output: Queue = [8, 5, 6, 7]
// Test Case 2:
// Input: Enqueue 1, 2, 3, 4, Dequeue, Dequeue, Enqueue 5
// Output: Queue = [5, 3, 4]


// Time Complexity: O(size)
// Space Complexity: O(size)
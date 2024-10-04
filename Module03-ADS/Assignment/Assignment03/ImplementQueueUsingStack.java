import java.util.Stack;

class QueueUsingStack{
	private Stack<Integer> s1;
	private Stack<Integer> s2;
	
	public QueueUsingStack(){
		this.s1=new Stack<>();
		this.s2=new Stack<>();
	}
	
	public boolean isEmpty(){
		return s1.isEmpty() && s2.isEmpty();
	}
	
	public void enqueue(int x){
		while(!s1.isEmpty())
			s2.push(s1.pop());
		s1.push(x);
		while(!s2.isEmpty())
			s1.push(s2.pop());
	}
	
	public int dequeue(){
		if(s1.isEmpty())
			return -1;
		return s1.pop();
	}
	
	public void display() {
        if (isEmpty()) {
            System.out.println("Queue = []");
            return;
        }

        Stack<Integer> tempStack = new Stack<>();
		System.out.print("Queue = [");
        while (!s1.isEmpty()) {
            int value = s1.pop();
            tempStack.push(value); 
            System.out.print(value); 
			 if (!s1.isEmpty()) {
                System.out.print(", ");
            }
        }
		 System.out.println("]");

        while (!tempStack.isEmpty()) {
            s1.push(tempStack.pop());
        }
    }
}

public class ImplementQueueUsingStack{
	public static void main(String[] args){
		// 1
		QueueUsingStack q1 = new QueueUsingStack();
		q1.enqueue(3);
		q1.enqueue(7);
		q1.dequeue();
		q1.display();
		
		// 2
		QueueUsingStack q2 = new QueueUsingStack();
		q2.enqueue(10);
		q2.enqueue(20);
		q2.dequeue();
		q2.dequeue();
		q2.display();
	}
}


// Test Case 1:
// Input: Enqueue 3, Enqueue 7, Dequeue
// Output: Queue = [7], Dequeued element = 3
// Test Case 2:
// Input: Enqueue 10, 20, Dequeue, Dequeue
// Output: Queue = [], Dequeued elements = 10, 20


// Time Complexity: O(n)  Where, n is no. of elements
// Space Complexity: O(n)
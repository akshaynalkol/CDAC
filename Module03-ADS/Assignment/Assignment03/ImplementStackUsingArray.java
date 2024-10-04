class Stack{
	private int top;
	private int arr[];
	private int size;
	
	public Stack(int size){
		this.top=-1;
		this.size=size;
		this.arr=new int[size];
	}
	
	public boolean isEmpty(){
		return this.top==-1;
	}
	
	public boolean isFull(){
		return top==size-1;
	}
	
	public boolean push(int x){
		if(isFull()){
			System.out.println("Stack Overflow");
			return false;
		}
		arr[++top]=x;
		return true;
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack Underflow");
			return -1;
		}
		return arr[top--];
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("Stack Underflow");
			return;
		}
		System.out.print("Stack = [");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]);
            if (i != top) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
	}
}

public class ImplementStackUsingArray{
	public static void main(String[] args){
		// 1
		Stack s1=new Stack(5);
		s1.push(5);
		s1.push(3);
		s1.push(7);
		System.out.println("Popped Element = "+s1.pop());
		s1.display();
		
		// 2
		Stack s2=new Stack(3);
		s2.push(10);
		s2.push(20);
		System.out.println("Popped Element = "+s2.pop());
		s2.push(15);
		s2.display();
	}
}


// Test Case 1:
///Input: Push 5, 3, 7, Pop
// Output: Stack = [5, 3], Popped element = 7

// Test Case 2:
// Input: Push 10, Push 20, Pop, Push 15
// Output: Stack = [10, 15], Popped element = 20


// Time Complexity: O(size)
// Space Complexity: O(size)
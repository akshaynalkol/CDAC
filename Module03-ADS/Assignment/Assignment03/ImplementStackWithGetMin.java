import java.util.Stack;

public class ImplementStackWithGetMin{
	int min;
	Stack<Integer> s;
	
	public ImplementStackWithGetMin(){
		this.s=new Stack<>();
	}
	
	public int getMin(){
		return min;
	}
	
	public void push(int x){
		if(s.isEmpty()){
			min=x;
			s.push(x);
		}
		else if(x<=min){
			s.push(2*x-min);
			min=x;
		}
		else
			s.push(x);
	}
	
	public int pop(){
		int t=s.pop();
		if(t<=min){
			int res=min;
			min=2*min-t;
			return res;
		}
		else 
			return t;
	}
	
	public static void main(String[] args){
		// 1
		ImplementStackWithGetMin s1=new ImplementStackWithGetMin();
		s1.push(5);
		s1.push(3);
		s1.push(7);
		System.out.println(s1.pop());
		System.out.println(s1.getMin());
		
		
		// 2
		ImplementStackWithGetMin s2=new ImplementStackWithGetMin();
		s2.push(10);
		s2.push(8);
		s2.push(6);
		s2.push(12);
		System.out.println(s2.getMin());
	}
}


// Test Case 1:
// Input: Push 5, Push 3, Push 7, Get Min
// Output: Min = 3
// Test Case 2:
// Input: Push 10, Push 8, Push 6, Push 12, Get Min
// Output: Min = 6


// Time Complexity: O(1);
// Space Complexity: O(n) Where n is the number of elements in the stack
class Stack{
	private int top;
	private char arr[];
	private int size;
	
	public Stack(int size){
		this.top=-1;
		this.size=size;
		this.arr=new char[size];
	}
	
	public boolean isEmpty(){
		return this.top==-1;
	}
	
	public boolean isFull(){
		return top==size-1;
	}
	
	public boolean push(char x){
		if(isFull()){
			System.out.println("Stack Overflow");
			return false;
		}
		arr[++top]=x;
		return true;
	}
	
	public char pop(){
		if(isEmpty()){
			System.out.println("Stack Underflow");
			return '\0';
		}
		return arr[top--];
	}
	
	public char peek(){
		if(isEmpty()){
			System.out.println("Stack Underflow");
			return '\0';
		}
		return arr[top];
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

public class BalancedParaenthesesUsingStack{
	public static boolean isBalanced(String str){
		Stack s=new Stack(str.length());
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='(' || ch=='[' || ch=='{')
				s.push(ch);
			else{
				if(s.isEmpty())
					return false;
				else if(!isMatch(s.peek(),ch))
					return false;
				else
				    s.pop();
			}
		}
		return s.isEmpty();
	}
	
	public static boolean isMatch(char a, char b){
		return ((a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}'));
	}
	
	public static void main(String[] args){
		String str="([)]";
		
		if(isBalanced(str))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}
}


// Test Case 1:
// Input: "({[()]})"
// Output: Balanced
// Test Case 2:
// Input: "([)]"
// Output: Not Balanced


// Time Complexity: O(size)
// Space Complexity: O(size)
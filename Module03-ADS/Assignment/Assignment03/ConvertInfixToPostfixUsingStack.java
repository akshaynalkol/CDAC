import java.util.Scanner;
import java.util.Stack;

public class ConvertInfixToPostfixUsingStack{
	public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
	
	public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }
	
	public static String infixToPostfix(String str){
		Stack<Character> s=new Stack<>();
		String res="";
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			
			if(Character.isLetterOrDigit(ch))
				res+=ch;
			else if(ch=='(')
				s.push(ch);
			else if(ch==')'){
				while(!s.empty() && s.peek()!='(')
					res+=s.pop();
				if(s.empty() || s.peek()!='(')
					return "Invalid Expression1";
				else 
					s.pop();
			}
			else if(isOperator(ch)){
				while(!s.empty() && precedence(ch)<=precedence(s.peek()))
					res+=s.pop();
				s.push(ch);
			}
		}
		
		while(!s.empty()){
			if(s.peek()=='(')
				 return "Invalid Expression2"; 
			res+=s.pop();
		}
		
		return res;
	}
	
	public static void main(String[] args){
		String str1="A + B * C";
		System.out.println(infixToPostfix(str1)); // "A B C * +"
		
		String str2="(A + B)) * C";
		System.out.println(infixToPostfix(str2)); // Invalid Expression1
		
		String str3="A + B * (C - D";
		System.out.println(infixToPostfix(str3)); // Invalid Expression2
	}
}


// Test Case 1:
// Input: "A + B * C"
// Output: "A B C * +"
// Test Case 2:
// Input: "A * B + C / D"
// Output: "A B * C D / +"


// Time Complexity: O(n)   Where n is no. of character in string
// Space Complexity: O(n)
import java.util.Scanner;
import java.util.Stack;

public class EvaluatePostfixExprUsingStack{
	static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/');
    }
	
	public static int evaluateExpr(String str){
		Stack<Integer> s=new Stack<>();
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
	
			if(Character.isDigit(ch))
				s.push(ch-'0');
			else if(isOperator(ch)){
				int no1=s.pop();
				int no2=s.pop();
				
				int res=0;
				switch(ch){
					case '+':
                        res=no1+no2;
                        break;
                    case '-':
                        res=no1-no2;
                        break;
                    case '*':
                        res=no1*no2;
                        break;
                    case '/':
                        res=no1/no2;
                        break;
				}
				s.push(res);
			}
		}
		
		return s.pop();
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str=sc.next();
		
		System.out.println(evaluateExpr(str));
	}
}

// Test Case 1:
// Input: "5 3 + 2 *"
// Output: 16
// Test Case 2:
// Input: "4 5 * 6 /"
// Output: 3


// Time Complexity: O(n)  Where n is no. of character in string
// Space Complexity: O(n)
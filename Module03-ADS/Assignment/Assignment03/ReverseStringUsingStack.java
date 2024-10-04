import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack{
	public static String reverse(String str){
		Stack<Character> s=new Stack<>();
		
		for(int i=0;i<str.length();i++)
			s.push(str.charAt(i));
		
		String res="";
		while(!s.empty())
			res+=s.pop();
		
		return res;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str=sc.next();
		
		System.out.println(reverse(str));
	}
}


// Test Case 1:
// Input: "hello"
// Output: "olleh"
// Test Case 2:
// Input: "world"
// Output: "dlrow"


// Time Complexity: O(n)   Where n is no. of character in string
// Space Complexity: O(n)
import java.util.Scanner;

public class ReverseWordInString{	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		String str=sc.nextLine();
		
		String res="";
		String arr[]=str.split(" ");
		for(int i=arr.length-1;i>=0;i--){
			res+=arr[i]+" ";
		}
		System.out.print(res1);
	}
}

// Input: "Hello World"
// Output: "World Hello"


// Time Complexity: O(n)
// Space Complexity: O(1)
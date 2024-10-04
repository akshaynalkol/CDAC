import java.util.Scanner;

public class ReverseString{	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		String str=sc.nextLine();
		
		// 1
		StringBuffer res1=new StringBuffer(str);
		System.out.println(res1.reverse());
		
		// 2
		String res2="";
		char arr[]=str.toCharArray();
		for(int i=arr.length-1;i>=0;i--){
			res2+=arr[i];
		}
		System.out.println(res2);
	}
}

// Input: "hello"
// Output: "olleh"


// Time Complexity: O(n)
// Space Complexity: O(1)
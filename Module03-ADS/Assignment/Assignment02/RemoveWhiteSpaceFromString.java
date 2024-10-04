import java.util.Scanner;

public class RemoveWhiteSpaceFromString{	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		String str=sc.nextLine();
		
		// 1
		System.out.println(str.replaceAll("[\s]",""));
		
		// 2
		String res="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' ')
				continue;
			res+=str.charAt(i);
		}
		System.out.println(res);
	}
}

// Input: "Hello World"
// Output: "HelloWorld"


// Time Complexity: O(n)
// Space Complexity: O(1)
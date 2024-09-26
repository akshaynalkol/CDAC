import java.util.Scanner;

public class FactorialNo{
	public static int fact(int no){
		if(no<=1)
			return 1;
		return no*fact(no-1);
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the no: ");
		int no=sc.nextInt();	
		
		// 1 - Iterative
		int res=1;
		for(int i=2;i<=no;i++){
			res*=i;
		}
		System.out.println(res);
	
	    // 2 - Recursive
		System.out.println(fact(no));
	}
}

// Output-
// Input: 5
// Output: 120
// Input: 0
// Output: 1

// 1 - Iterative
// Time Complexity - O(n)
// Space Complexity - O(1)

// 2 - Recursive
// Time Complexity - O(n)
// Space Complexity - O(n)

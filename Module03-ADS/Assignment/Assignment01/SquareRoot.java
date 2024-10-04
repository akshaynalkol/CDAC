import java.util.Scanner;

public class SquareRoot{
	// Formula - > sqrt n+1 =(sqrt n+(num/sqrt))/2.0
	public static int sqrt(int number){
		double t;
		double squareroot = number / 2;
  
		do {
			t = squareroot;
			squareroot = (t + (number / t)) / 2;
		} while ((t - squareroot) != 0);
  
		return (int)squareroot;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the no: ");
		int no=sc.nextInt();
		
		// 1
		double res1=Math.sqrt(no);
		System.out.println((int)res1);
		
		// 2
		double res2=Math.pow(no,0.5);
		System.out.println((int)res2);
		
		// 3
		int res3=sqrt(no);
		System.out.println(res3);
	}
}

// Output-
// Input: x = 16
// Output: 4
// Input: x = 27
// Output: 5

// 1 & 2
// Time Complexity - O(1)
// Space Complexity - O(1)

// 3
// Time Complexity - O(logn)
// Space Complexity - O(1)




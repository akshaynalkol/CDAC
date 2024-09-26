import java.util.Scanner;
import java.util.Arrays;

public class GCD{
	public static int gcd(int a, int b){
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the no1: ");
		int no1=sc.nextInt();
		System.out.print("Enter the no2: ");
		int no2=sc.nextInt();
		
		// 1 - Iterative
		/*while(no2!=0){     // Ok
			int temp=no2;
			no2=no1%no2;
			no1=temp;
		}
		System.out.println(no1);*/
		
		while(no2!=0){
			int temp=no2;
			no2=Math.abs(no1-no2);
			no1=temp;
		}
		System.out.println(no1);
		
		// 2 - Recursive
		System.out.println(gcd(no1,no2));
	}
}

// Output-
// Input: a = 54, b = 24
// Output: 6
// Input: a = 17, b = 13
// Output: 1

// 1 - Iterative
// Time Complexity - O(log(min(a, b)))
// Space Complexity - O(1)

// 2 - Recursive
// Time Complexity - O(log(min(a, b)))
// Space Complexity - O(log(min(a, b)))

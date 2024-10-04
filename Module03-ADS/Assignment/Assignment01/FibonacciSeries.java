import java.util.Scanner;
import java.util.Arrays;

public class FibonacciSeries{
	public static int fib(int no){
		if(no<=1)
			return no;
		return fib(no-1)+fib(no-2);
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the no: ");
		int n=sc.nextInt();	
		
		// 1 - Iterative
		int arr1[]=new int[n];
		int n1=0,n2=1,n3;
		for(int i=0;i<n;i++){
			arr1[i]=n1;
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		System.out.println(Arrays.toString(arr1));
		
		// 2 - Recursive
		int arr2[]=new int[n];
		for(int i=0;i<n;i++){
			arr2[i]=fib(i);
		}
		System.out.println(Arrays.toString(arr2));
	}
}

// Output-
// Input: n = 5
// Output: [0, 1, 1, 2, 3]
// Input: n = 8
// Output: [0, 1, 1, 2, 3, 5, 8, 13]

// 1 - Iterative
// Time Complexity - O(n)
// Space Complexity - O(1)

// 2 - Recursive
// Time Complexity - O(2^n)
// Space Complexity - O(n)

import java.util.Scanner;

public class IntegerPalindrome{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the no: ");
		int no=sc.nextInt();
		
		int num=no;
		int rem=0;
		while(no>0){
			int temp=no%10;
			no/=10;
			rem=rem*10+temp;
		}
		if(num==rem)
			System.out.println(true);
		else
			System.out.println(false);
	}
}

// Output-
// Input: 121
// Output: true
// Input: 143
// Output: false


// Time Complexity - O(d) Where, d is digit in number
// Space Complexity - O(1)
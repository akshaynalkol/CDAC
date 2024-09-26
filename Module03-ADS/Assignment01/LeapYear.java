import java.util.Scanner;

public class LeapYear{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the no: ");
		int no=sc.nextInt();
		
		if((no%4==0 && no%100!=0) || no%400==0)
			System.out.println(true);
		else
			System.out.println(false);
	}
}

// Output-
// Input: 2020
// Output: true
// Input: 1900
// Output: false


// Time Complexity - O(1)
// Space Complexity - O(1)
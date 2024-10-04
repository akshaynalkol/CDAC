import java.util.Scanner;

public class ArmstrongNo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the no: ");
		int no=sc.nextInt();
		
		int n=no;
		int a,rem=0;
		while(no>0){
			a=no%10;
			no/=10;
			rem+=a*a*a;
		}
		
		if(n==rem){
			System.out.println(true);
		}
		else{
			System.out.println(false);
		}
		
	}
}

// Output-
// Input: 153
// Output: true
// Input: 123
// Output: false

// Time Complexity - O(d)  where, d is no. of digits
// Space Complexity - O(1)

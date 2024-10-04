import java.util.Scanner;

public class ReverseNo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the no: ");
		int no=sc.nextInt();
		
		int a,res=0;
		while(no>0){
			a=no%10;
			no/=10;
			res=res*10+a;
		}
		System.out.println("Reverse No. : "+res);
	}
}

// Input: 12345
// Output: 54321

// Time Complexity: O(d) Where, d is no. of digits
// Space Complexity: O(1)


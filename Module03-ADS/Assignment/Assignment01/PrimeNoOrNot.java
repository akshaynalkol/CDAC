import java.util.Scanner;

public class PrimeNoOrNot{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the no: ");
		int no=sc.nextInt();
		
		if(no<=1){
			System.out.println(true);
			return;
		}
		
		for(int i=2;i*i<=no;i++){                // i<=Math.sqrt(no)
			if(no%i==0){
				System.out.println(false);
				return;
			}
		}
		
		System.out.println(true);
	}
}

// Output-
// Input: 29
// Output: true
// Input: 15
// Output: false

// Time Complexity - O(sqrt(n))
// Space Complexity - O(1)

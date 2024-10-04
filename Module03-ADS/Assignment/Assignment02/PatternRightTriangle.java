import java.util.Scanner;

public class PatternRightTriangle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the no: ");
		int no=sc.nextInt();
		
		for(int i=0;i<no;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

// Input: n = 3
// Output:
//         *
//         **
//         ***

// Time Complexity: O(n^2)
// Space Complexity: O(1)


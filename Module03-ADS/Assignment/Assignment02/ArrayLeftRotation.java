import java.util.Scanner;
import java.util.Arrays;

public class ArrayLeftRotation{	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the no : ");
		int no=sc.nextInt();
		
		System.out.print("Enter the array element : ");
		int arr[]=new int[no];
		for(int i=0;i<no;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Enter the no of position : ");
		int d=sc.nextInt();
		
		// 1
		int res1[]=new int[no];
		for (int i = 0; i < no; i++) {
            res1[i] = arr[(i + d) % no]; 
        }
		System.out.println("Left Rotated Array : "+Arrays.toString(res1));
		
		// 2
		int j=0;
		int res2[]=new int[no];
		for(int i=d;i<no;i++){
			res2[j++]=arr[i];
		}
		for(int i=0;i<d;i++){
			res2[j++]=arr[i];
		}
		System.out.println("Left Rotated Array : "+Arrays.toString(res2));
	}
}

// Input: arr = [1, 2, 3, 4]
// Output: [4, 3, 2, 1]


// Time Complexity: O(n)
// Space Complexity: O(n)
import java.util.Scanner;
import java.util.Arrays;

public class ReverseArrayInPlace{	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the no : ");
		int no=sc.nextInt();
		
		System.out.print("Enter the array element : ");
		int arr[]=new int[no];
		for(int i=0;i<no;i++){
			arr[i]=sc.nextInt();
		}
		
		int s=0,e=no-1;
		while(s<=e){
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;
			e--;
		}
		System.out.println("Reverse Array : "+Arrays.toString(arr));
	}
}

// Input: arr = [1, 2, 3, 4]
// Output: [4, 3, 2, 1]


// Time Complexity: O(n)
// Space Complexity: O(n)
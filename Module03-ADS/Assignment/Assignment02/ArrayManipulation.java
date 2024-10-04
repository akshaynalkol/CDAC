import java.util.Scanner;
import java.util.Arrays;

public class ArrayManipulation{	
	public static int manipulation(int arr[][]){
		int sum=0,res=0;
		for(int i=0;i<arr.length;i++){
			sum=arr[i][2];
			for(int j=i+1;j<arr[i].length-1;j++){
				if(arr[i][1]>=arr[j][0]){
					sum+=arr[j][2];
				}
			}
			res=Math.max(sum,res);
		}
		return res;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the no row : ");
		int n=sc.nextInt();
		System.out.print("Enter the no of col : ");
		int m=sc.nextInt();
		
		System.out.print("Enter the array element : ");
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++)
				arr[i][j]=sc.nextInt();
		}
		
		System.out.println(manipulation(arr));
	}
}

// Input: arr = [1, 2, 3, 4]
// Output: [4, 3, 2, 1]


// Time Complexity: O(n*m)
// Space Complexity: O(n*m)
import java.util.Scanner;

public class RemoveArrayDuplicate{
	public static int removeDuplicate(int arr[], int n){
		if(arr.length==0)
			return 0;
		
		int i=0;
		for(int j=1;j<n;j++){
			if(arr[i]!=arr[j]){
				arr[++i]=arr[j];
			}
		}
		
		return i+1;
	}	
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the no : ");
		int no=sc.nextInt();
		
		System.out.print("Enter the array element : ");
		int arr[]=new int[no];
		for(int i=0;i<no;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("New Length Of Array : "+removeDuplicate(arr,no));
	}
}

// Input: arr = [1, 1, 2]
// Output: 2


// Time Complexity: O(n)
// Space Complexity: O(n)
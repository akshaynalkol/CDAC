import java.util.Arrays;

public class HeapSort{
	public static void buildHeap(int arr[], int n){
		for(int i=(n-2)/2;i>=0;i--)
			maxHeapify(arr,i,n);
	}
	
	public static void maxHeapify(int arr[], int i, int n){
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		
		if(left<n && arr[left]>arr[largest])
			largest=left;
		if(right<n && arr[right]>arr[largest])
			largest=right;
		
		if(largest!=i){
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			
			maxHeapify(arr,largest,n);
		}
	}
	
	public static void heapSort(int arr[], int n){
		buildHeap(arr,n);
		
		for(int i=n-1;i>=1;i--){
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			maxHeapify(arr,0,i);
		}
	}
	
	public static void main(String[] args){
		int arr[]={5,1,12,3,9};
		
		System.out.println("Before Sort : "+Arrays.toString(arr));
		heapSort(arr,arr.length);
		System.out.println("After Sort : "+Arrays.toString(arr));
	}
}


// Test Case 1:
// Input: [5, 1, 12, 3, 9]
// Output: [1, 3, 5, 9, 12]
// Test Case 2:
// Input: [20, 15, 8, 10]
// Output: [8, 10, 15, 20]


// Time Complexity: O(nlogn)
// Space Comlexity: O(n)
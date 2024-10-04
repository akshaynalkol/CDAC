import java.util.PriorityQueue;

public class KthLargestElementUsingHeap{
	public static int findKthLargest(int[] arr, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
		 
		for(Integer no:arr){
			if(minHeap.size()<k)
				minHeap.add(no);
			else if(no>minHeap.peek()){
				minHeap.poll();
				minHeap.add(no);
			}
		} 
		
		return minHeap.peek();
	}
	
	public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {3, 10, 5, 20, 15};
        int k1 = 3;
        System.out.println("Kth largest element (k=3): " + findKthLargest(arr1, k1)); 

        // Test Case 2
        int[] arr2 = {7, 4, 8, 2, 9};
        int k2 = 2;
        System.out.println("Kth largest element (k=2): " + findKthLargest(arr2, k2)); 
    }
}


// Test Case 1:
// Input: Stream = [3, 10, 5, 20, 15], k = 3
// Output: 10
// Test Case 2:
// Input: Stream = [7, 4, 8, 2, 9], k = 2
// Output: 8


// Time Complexity: O(nlogk) Where O(logk) for insert Or delete & n in no. of itertion
//                           Where k is size og queue
// Space Comlexity: O(n)  Where n is the number of elements in the array.
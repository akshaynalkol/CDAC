public class DetectCylcleInLinkedList{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	
	boolean hasCycle(){
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast)
				return true;
		}
		
		return false;
	}
	
	public static void main(String[] args){
		DetectCylcleInLinkedList l1=new DetectCylcleInLinkedList();
		l1.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        l1.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third; // creates a cycle
		if (l1.hasCycle()) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
		
		
		DetectCylcleInLinkedList l2=new DetectCylcleInLinkedList();
        l2.head = new Node(6);
        l2.head.next = new Node(7);
        l2.head.next.next = new Node(8);
        l2.head.next.next.next = new Node(9);
		if (l2.hasCycle()) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
	}
}


// Test Case 1:
// Input: List = [1 → 2 → 3 → 4 → 5 → 3 (cycle)]
// Output: Cycle Detected
// Test Case 2:
// Input: List = [6 → 7 → 8 → 9]
// Output: No Cycle


// Time Complexity : O(n)
// Space Complexity : O(1)
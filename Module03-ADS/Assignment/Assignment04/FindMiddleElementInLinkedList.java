public class FindMiddleElementInLinkedList{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	void insertEnd(int data){
		Node node=new Node(data);
		
		if(head==null){
			head=node;
			return;
		}
		
		Node temp=head;
		while(temp.next!=null)
			temp=temp.next;
		
		temp.next=node;
	}
	
	int findMiddleElement(){
		if(head==null)
			return -1;
		
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		
		return slow.data;
	}
	
	void display(){
		Node temp=head;
		System.out.print("List = [");
		while(temp!=null){
			System.out.print(temp.data);
			temp=temp.next;
			if(temp!=null)
				System.out.print(", ");
		}
		System.out.print("]\n");
	}
	
	public static void main(String[] args){
		FindMiddleElementInLinkedList l1=new FindMiddleElementInLinkedList();
		l1.insertEnd(1);
		l1.insertEnd(2);
		l1.insertEnd(3);
		l1.insertEnd(4);
		l1.insertEnd(5);
		l1.display();
		System.out.println("Middle = "+l1.findMiddleElement());
		
		FindMiddleElementInLinkedList l2=new FindMiddleElementInLinkedList();
		l2.insertEnd(11);
		l2.insertEnd(22);
		l2.insertEnd(33);
		l2.insertEnd(44);
		l2.insertEnd(55);
		l2.insertEnd(66);
		l2.display();
		System.out.println("Middle = "+l2.findMiddleElement());
	}
}


// Test Case 1:
// Input: List = [1, 2, 3, 4, 5]
// Output: Middle = 3
// Test Case 2:
// Input: List = [11, 22, 33, 44, 55, 66]
// Output: Middle = 44

// Time Complexity : 
// Insert: O(n)
// FindingMiddle: O(n)
// Display: O(n)

// Space Complexity :
// Insert: O(1)
// FindingMiddle: O(1)
// Display: O(1)
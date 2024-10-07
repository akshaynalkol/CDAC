public class RemoveDuplicateFromSortedLinkedList{
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
	
	void removeDuplicate(){
		Node curr=head;
		
		while(curr!=null && curr.next!=null){
			if(curr.data==curr.next.data)
				curr.next=curr.next.next;
			else
				curr=curr.next;
		}
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
		RemoveDuplicateFromSortedLinkedList l1=new RemoveDuplicateFromSortedLinkedList();
		l1.insertEnd(1);
		l1.insertEnd(1);
		l1.insertEnd(2);
		l1.insertEnd(3);
		l1.insertEnd(3);
		l1.insertEnd(4);
		l1.display();
		l1.removeDuplicate();
		l1.display();
		
		RemoveDuplicateFromSortedLinkedList l2=new RemoveDuplicateFromSortedLinkedList();
		l2.insertEnd(7);
		l2.insertEnd(7);
		l2.insertEnd(8);
		l2.insertEnd(9);
		l2.insertEnd(9);
		l2.insertEnd(10);
		l2.display();
		l2.removeDuplicate();
		l2.display();
	}
}


// Test Case 1:
// Input: List = [1, 1, 2, 3, 3, 4]
// Output: List = [1, 2, 3, 4]
// Test Case 2:
// Input: List = [7, 7, 8, 9, 9, 10]
// Output: List = [7, 8, 9, 10]


// Time Complexity : 
// Insert: O(n)
// RemoveDuplicate: O(n)
// Display: O(n)

// Space Complexity :
// Insert: O(1)
// RemoveDuplicate: O(1)
// Display: O(1)
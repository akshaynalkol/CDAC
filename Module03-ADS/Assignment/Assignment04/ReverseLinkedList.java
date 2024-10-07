public class ReverseLinkedList{
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
	
	void reverse(){
		Node curr=head;
		Node prev=null;
		Node next=null;
		
		while(curr!=null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		
		head=prev;
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
		ReverseLinkedList l1=new ReverseLinkedList();
		l1.insertEnd(1);
		l1.insertEnd(2);
		l1.insertEnd(3);
		l1.insertEnd(4);
		l1.insertEnd(5);
		l1.display();
		l1.reverse();
		l1.display();
		
		ReverseLinkedList l2=new ReverseLinkedList();
		l2.insertEnd(10);
		l2.insertEnd(20);
		l2.insertEnd(30);
		l2.display();
		l2.reverse();
		l2.display();
	}
}


// Test Case 1:
// Input: List = [1, 2, 3, 4, 5]
// Output: List = [5, 4, 3, 2, 1]
// Test Case 2:
// Input: List = [10, 20, 30]
// Output: List = [30, 20, 10]


// Time Complexity : 
// Insert: O(n)
// Reverse: O(n)
// Display: O(n)

// Space Complexity :
// Insert: O(1)
// Reverse: O(1)
// Display: O(1)
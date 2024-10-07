public class ImplementSinglyLinkedList{
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
	
	void deleteByValue(int data){
		Node temp=head;
		Node prev=null;
		
		if(temp!=null && temp.data==data){
			head=temp.next;
			return;
		}
		
		while(temp!=null && temp.data!=data){
			prev=temp;
			temp=temp.next;
		}
		
		if(temp==null)
			return;
		
		prev.next=temp.next;
	}
	
	void search(int data){
		Node temp=head;
		
		while(temp!=null){
			if(temp.data==data){
				System.out.println("Found = True");
				return;
			}
			temp=temp.next;
		}
		System.out.println("Found = False");
	}
	
	void display(){
		Node temp=head;
		System.out.print("[");
		while(temp!=null){
			System.out.print(temp.data);
			temp=temp.next;
			if(temp!=null)
				System.out.print(", ");
		}
		System.out.print("]\n");
	}
	
	public static void main(String[] args){
		ImplementSinglyLinkedList l1=new ImplementSinglyLinkedList();
		l1.insertEnd(3);
		l1.insertEnd(7);
		l1.insertEnd(5);
		l1.deleteByValue(7);
		l1.display();
		l1.search(5);
		
		ImplementSinglyLinkedList l2=new ImplementSinglyLinkedList();
		l2.insertEnd(9);
		l2.insertEnd(4);
		l2.deleteByValue(4);
		l2.display();
		l2.search(10);
	}
}


// Test Case 1:
// Input: Insert 3 → Insert 7 → Insert 5 → Delete 7 → Search 5
// Output: List = [3, 5], Found = True
// Test Case 2:
// Input: Insert 9 → Insert 4 → Delete 4 → Search 10
// Output: List = [9], Found = False


// Time Complexity : 
// insertEnd = O(n)
// deleteByValue = O(n)
// search = O(n)
// display = O(n)

// Space Complexity : 
// insertEnd = O(1)
// deleteByValue = O(1)
// search = O(1)
// display = O(1)
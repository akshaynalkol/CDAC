public class NthNodeFromEndOfLinkedList{
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
	
	void findNthFromEnd(int pos){
		Node ptr1=head;
		Node ptr2=head;
		
		for(int i=0;i<pos;i++){
			if(ptr1==null){
				System.out.println("List is shorter than " + pos);
                return;
			}
			ptr1=ptr1.next;
		}
		
		while(ptr1!=null){
			ptr1=ptr1.next;
			ptr2=ptr2.next;
		}
		
		System.out.println(ptr2.data);
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
		NthNodeFromEndOfLinkedList l1=new NthNodeFromEndOfLinkedList();
		l1.insertEnd(10);
		l1.insertEnd(20);
		l1.insertEnd(30);
		l1.insertEnd(40);
		l1.insertEnd(50);
		l1.display();
		l1.findNthFromEnd(2);
		
		NthNodeFromEndOfLinkedList l2=new NthNodeFromEndOfLinkedList();
		l2.insertEnd(5);
		l2.insertEnd(15);
		l2.insertEnd(25);
		l2.insertEnd(35);
		l2.display();
		l2.findNthFromEnd(4);
	}
}


// Test Case 1:
// Input: List = [10, 20, 30, 40, 50], n = 2
// Output: 40
// Test Case 2:
// Input: List = [5, 15, 25, 35], n = 4
// Output: 5


// Time Complexity : O(n) 
// Space Complexity : O(1) 
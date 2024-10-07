public class MergeTwoSortedLinkedList{
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
	
	Node merge(Node l1, Node l2){
		if(l1==null)
			return l2;
		if(l2==null)
			return l1;
		
		if(l1.data<l2.data){
			l1.next=merge(l1.next,l2);
			return l1;
		}
		else{
			l2.next=merge(l1,l2.next);
			return l2;
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
		MergeTwoSortedLinkedList l1=new MergeTwoSortedLinkedList();
		l1.insertEnd(1);
		l1.insertEnd(3);
		l1.insertEnd(5);
		l1.display();
		MergeTwoSortedLinkedList l2=new MergeTwoSortedLinkedList();
		l2.insertEnd(2);
		l2.insertEnd(4);
		l2.insertEnd(6);
		l2.display();
		MergeTwoSortedLinkedList l3=new MergeTwoSortedLinkedList();
		l3.head=l3.merge(l1.head,l2.head);
		System.out.print("Merged ");
		l3.display();
		
		
		MergeTwoSortedLinkedList l4=new MergeTwoSortedLinkedList();
		l4.insertEnd(10);
		l4.insertEnd(15);
		l4.insertEnd(20);
		l4.display();
		MergeTwoSortedLinkedList l5=new MergeTwoSortedLinkedList();
		l5.insertEnd(12);
		l5.insertEnd(18);
		l5.insertEnd(25);
		l5.display();
		MergeTwoSortedLinkedList l6=new MergeTwoSortedLinkedList();
		l6.head=l6.merge(l4.head,l5.head);
		System.out.print("Merged ");
		l6.display();
	}
}


// Test Case 1:
// Input: List1 = [1, 3, 5], List2 = [2, 4, 6]
// Output: Merged List = [1, 2, 3, 4, 5, 6]
// Test Case 2:
// Input: List1 = [10, 15, 20], List2 = [12, 18, 25]
// Output: Merged List = [10, 12, 15, 18, 20, 25]


// Time Complexity : O(n+m)  where n is the number of nodes in List1 and m is the number of nodes in List2.
// Space Complexity : O(n)  where n is maximum depth due to recursion stack
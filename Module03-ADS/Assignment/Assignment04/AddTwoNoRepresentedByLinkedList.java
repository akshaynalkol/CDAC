public class AddTwoNoRepresentedByLinkedList{
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
	
	Node addTwoNo(Node l1, Node l2){
		Node node=new Node(0);
		Node dummy=node;
		int carry=0;
		
		while(l1!=null || l2!=null){
			int x = (l1 != null) ? l1.data : 0;
            int y = (l2 != null) ? l2.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            node.next = new Node(sum % 10);
            node = node.next;
			
			if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
		}
		
		if(carry>0)
			node.next=new Node(carry);
		
		return dummy.next;
	}
	
	void display(){
		Node temp=head;
		System.out.print("List = [");
		while(temp!=null){
			System.out.print(temp.data);
			temp=temp.next;
			if(temp!=null)
				System.out.print(" -> ");
		}
		System.out.print("]\n");
	}
	
	public static void main(String[] args){
		AddTwoNoRepresentedByLinkedList l1=new AddTwoNoRepresentedByLinkedList();
		l1.insertEnd(2);
		l1.insertEnd(4);
		l1.insertEnd(3);
		l1.display();;
		AddTwoNoRepresentedByLinkedList l2=new AddTwoNoRepresentedByLinkedList();
		l2.insertEnd(5);
		l2.insertEnd(6);
		l2.insertEnd(4);
		l2.display();
		AddTwoNoRepresentedByLinkedList l3=new AddTwoNoRepresentedByLinkedList();
		l3.head=l3.addTwoNo(l1.head,l2.head);
		System.out.print("Sum ");
		l3.display();
		
		
		AddTwoNoRepresentedByLinkedList l4=new AddTwoNoRepresentedByLinkedList();
		l4.insertEnd(9);
		l4.insertEnd(9);
		l4.insertEnd(9);
		l4.display();;
		AddTwoNoRepresentedByLinkedList l5=new AddTwoNoRepresentedByLinkedList();
		l5.insertEnd(1);
		l5.display();
		AddTwoNoRepresentedByLinkedList l6=new AddTwoNoRepresentedByLinkedList();
		l6.head=l6.addTwoNo(l4.head,l5.head);
		System.out.print("Sum ");
		l6.display();
	}
}


// Test Case 1:
// Input: List1 = [2 → 4 → 3], List2 = [5 → 6 → 4] (243 + 465)
// Output: Sum List = [7 → 0 → 8]
// Test Case 2:
// Input: List1 = [9 → 9 → 9], List2 = [1] (999 + 1)
// Output: Sum List = [0 → 0 → 0 → 1]


// Time Complexity : O(max(m,n)) Where m is the length of the first list and n is the length of the second list.
// Space Complexity : O(max(m,n))

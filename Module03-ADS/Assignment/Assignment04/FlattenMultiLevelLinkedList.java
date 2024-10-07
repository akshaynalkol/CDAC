public class FlattenMultiLevelLinkedList{
	Node head;
	
	static class Node {
        int data;
        Node next, prev, child;

        Node(int data) {
            this.data = data;
            next = prev = child = null;
        }
    }
	
	Node flatten(Node head){
		if(head==null)
			return null;;
		
		Node temp=head;
		while(temp!=null){
			if(temp.child!=null){
				Node childHead=temp.child;
				
				Node childTail=childHead;
				while(childTail.next!=null)
					childTail=childTail.next;
				
				childTail.next=temp.next;
				if(temp.next!=null)
					temp.next.prev=childTail;
				
				temp.next=childHead;
				childHead.prev=temp;
				
				temp.child=null;
			}
			
			temp=temp.next;
		}
		
		return head;
	}
	
	void display(){
		Node temp=head;
		System.out.print("List = [");
		while(temp!=null){
			System.out.print(temp.data);
			temp=temp.next;
			if(temp!=null)
				System.out.print("->");
		}
		System.out.print("]\n");
	}
	
	public static void main(String[] args){
		// 1
		FlattenMultiLevelLinkedList l1=new FlattenMultiLevelLinkedList();
		l1.head=new Node(1);
		l1.head.next = new Node(2);
        l1.head.next.prev = l1.head;
        l1.head.next.next = new Node(3);
        l1.head.next.next.prev = l1.head.next;
		
        l1.head.next.next.child = new Node(7);     // Child
        l1.head.next.next.child.next = new Node(8);
        l1.head.next.next.child.next.prev = l1.head.next.next.child;
        l1.head.next.next.child.next.child = new Node(10);
        l1.head.next.next.child.next.child.next = new Node(12);
        l1.head.next.next.child.next.child.next.prev = l1.head.next.next.child.next.child;
		
		l1.head=l1.flatten(l1.head);
		System.out.print("Flattened ");
		l1.display();
		
		
		// 2
		FlattenMultiLevelLinkedList l2=new FlattenMultiLevelLinkedList();
		l2.head = new Node(1);
        l2.head.next = new Node(2);
        l2.head.next.prev = l2.head;
        l2.head.next.next = new Node(3);
        l2.head.next.prev = l2.head.next;

        l2.head.next.child = new Node(5);
        l2.head.next.child.next = new Node(6);
        l2.head.next.child.next.prev = l2.head.next.child;
        l2.head.next.child.next.child = new Node(7);
        l2.head.next.child.next.child.next = new Node(9);
        l2.head.next.child.next.child.next.prev = l2.head.next.child.next.child;
		l2.head=l2.flatten(l2.head);
		System.out.print("Flattened ");
		l2.display();
	}
		
}

// MultiLevel Linkedlist - 
//       A multilevel doubly linked list is a type of doubly linked list where each node not only points to the next and previous nodes (like in a regular 
// doubly linked list), but also can point to a child list (another linked list at a lower level). This forms a hierarchical, multi-level structure where nodes
// can branch out into different sublists.
// Structure of a Multilevel Doubly Linked List:
// Next Pointer (next) — Points to the next node in the same list.
// Previous Pointer (prev) — Points to the previous node in the same list.
// Child Pointer (child) — Points to another linked list, starting a new level or sublist.


// Test Case 1:
// Input: List = [1 → 2 → 3, 3 → 7 → 8, 8 → 10 → 12]
// Output: Flattened List = [1 → 2 → 3 → 7 → 8 → 10 → 12]
// Test Case 2:
// Input: List = [1 → 2 → 3, 2 → 5 → 6, 6 → 7 → 9]
// Output: Flattened List = [1 → 2 → 5 → 6 → 7 → 9 → 3]

// Time Complexity : O(n);
// Space Complexity : O(1)
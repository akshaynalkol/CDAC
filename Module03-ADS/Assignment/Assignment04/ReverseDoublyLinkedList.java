public class ReverseDoublyLinkedList{
	Node head;
	
	static class Node{
		int data;
		Node prev;
		Node next;
		
		Node(int d){
			data=d;
			prev=next=null;
		}
	}
	
	void insertEnd(int data){
		Node node=new Node(data);
		node.next=null;
		
		if(head==null){
			node.prev=null;
			head=node;
			return;
		}
		
		Node last=head;
		while(last.next!=null)
			last=last.next;
		
		last.next=node;
		node.prev=last;
	}
	
	void reverse(){
		Node curr=head;
		Node temp=null;
		
		while(curr!=null){
			temp=curr.prev;
			curr.prev=curr.next;
			curr.next=temp;
			curr=curr.prev;
		}
		
		if(temp!=null)
			head=temp.prev;
	}
	
	void traverse() {
        Node temp = head;
        System.out.print("List = [");
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != null) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
	
	public static void main(String[] args){
		ReverseDoublyLinkedList l1=new ReverseDoublyLinkedList();
		l1.insertEnd(5);
		l1.insertEnd(10);
		l1.insertEnd(15);
		l1.insertEnd(20);
		l1.traverse();
		l1.reverse();
		l1.traverse();
		
		ReverseDoublyLinkedList l2=new ReverseDoublyLinkedList();
		l2.insertEnd(4);
		l2.insertEnd(8);
		l2.insertEnd(12);
		l2.traverse();
		l2.reverse();
		l2.traverse();
	}
}


// Test Case 1:
// Input: List = [5, 10, 15, 20]
// Output: List = [20, 15, 10, 5]
// Test Case 2:
// Input: List = [4, 8, 12]
// Output: List = [12, 8, 4]


// Time Complexity : 
// Insert: O(n)
// Reverse: O(n)
// Display: O(n)

// Space Complexity :
// Insert: O(1)
// Reverse: O(1)
// Display: O(1)
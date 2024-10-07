public class ImplementDoublyLinkedList{
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
	
	void deleteByValue(int data){
		Node temp=head;
		
		if(temp!=null && temp.data==data){
			head=temp.next;
			if(head!=null){
				head.prev=null;
			}
			return; 
		}
		
		while(temp!=null && temp.data!=data)
			temp=temp.next;
		
		if(temp==null)
			return;
		
		if(temp.next!=null)
			temp.next.prev=temp.prev;
		
		 if (temp.prev != null) 
            temp.prev.next = temp.next;
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
		ImplementDoublyLinkedList l1=new ImplementDoublyLinkedList();
		l1.insertEnd(10);
		l1.insertEnd(20);
		l1.insertEnd(30);
		l1.deleteByValue(20);
		l1.traverse();
		
		ImplementDoublyLinkedList l2=new ImplementDoublyLinkedList();
		l2.insertEnd(1);
		l2.insertEnd(2);
		l2.insertEnd(3);
		l2.deleteByValue(1);
		l2.traverse();
	}
}


// Test Case 1:
// Input: Insert 10 → Insert 20 → Insert 30 → Delete 20
// Output: List = [10, 30]
// Test Case 2:
// Input: Insert 1 → Insert 2 → Insert 3 → Delete 1
// Output: List = [2, 3]


// Time Complexity : 
// insertEnd = O(n)
// deleteByValue = O(n)
// display = O(n)

// Space Complexity : 
// insertEnd = O(1)
// deleteByValue = O(1)
// display = O(1)
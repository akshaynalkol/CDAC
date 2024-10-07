public class InsertInSortedCircularLinkedList{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	void insertSorted(int data){
		Node node=new Node(data);
		
		if(head==null){
			head=node;
			head.next = head;
			return;
		}
		
		Node temp=head;
		if(head.data>node.data){
			while(temp.next!=head)
				temp=temp.next;
			
			node.next=head;
			temp.next=node;
			head=node;
			return;
		}
		
		while(temp.next!=head && temp.next.data<node.data)
			temp=temp.next;
		
		node.next=temp.next;
		temp.next=node;
	}
	
	void display(){
		if (head == null) {
            System.out.println("List is empty");
            return;
        }
		
		Node temp = head;
        System.out.print("Circular List = [");
        do {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != head) {
                System.out.print(" -> ");
            }
        } while (temp != head);
        System.out.println(" (back to " + head.data + ")]");
	}
	
	public static void main(String[] args){
		InsertInSortedCircularLinkedList l1=new InsertInSortedCircularLinkedList();
		l1.insertSorted(10);
        l1.insertSorted(20);
        l1.insertSorted(30);
        l1.insertSorted(40);
        l1.insertSorted(25);
        l1.display();
		
		InsertInSortedCircularLinkedList l2=new InsertInSortedCircularLinkedList();
		l2.insertSorted(5);
        l2.insertSorted(15);
        l2.insertSorted(25);
        l2.insertSorted(10);
        l2.display();
	}
}


// Test Case 1:
// Input: Circular List = [10 → 20 → 30 → 40 → (back to 10)], Insert 25
// Output: Circular List = [10 → 20 → 25 → 30 → 40 → (back to 10)]
// Test Case 2:
// Input: Circular List = [5 → 15 → 25 → (back to 5)], Insert 10
// Output: Circular List = [5 → 10 → 15 → 25 → (back to 5)]


// Time Complexity : 
// InsertSorted: O(n)
// Display: O(n)

// Space Complexity :
// InsertSorted: O(1)
// Display: O(1)
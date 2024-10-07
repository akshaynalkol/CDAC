public class FindIntersectionPointInLinkedList{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	int getLength(Node head){
		int count=0;
		while(head!=null){
			head=head.next;
			count++;
		}
		
		return count;
	}
	int getIntersectionPoint(Node head1, Node head2){
		int len1=getLength(head1);
		int len2=getLength(head2);
		
		Node longer = (len1 > len2) ? head1 : head2;
        Node shorter = (len1 > len2) ? head2 : head1;
        int diff = Math.abs(len1 - len2);
		
		for(int i=0;i<diff;i++)
			longer=longer.next;
		
		while(longer!=null && shorter!=null){
			 if (longer == shorter) {
                return longer.data; 
            }
            longer = longer.next;
            shorter = shorter.next;
		}
		
		return -1;
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
		FindIntersectionPointInLinkedList l1=new FindIntersectionPointInLinkedList();
		l1.head = new Node(1);
        l1.head.next = new Node(2);
        l1.head.next.next = new Node(3);
        l1.head.next.next.next = new Node(4);
        l1.head.next.next.next.next = new Node(5);
		l1.display();
		FindIntersectionPointInLinkedList l2=new FindIntersectionPointInLinkedList();
        l2.head = new Node(6);
        l2.head.next = new Node(7);
        l2.head.next.next = l1.head.next.next.next; 
		l2.display();
		FindIntersectionPointInLinkedList l=new FindIntersectionPointInLinkedList();
        int intersection1= l.getIntersectionPoint(l1.head, l2.head);
        if (intersection1 != -1) {
            System.out.println("Intersection Point = " + intersection1);
        } else {
            System.out.println("No Intersection");
        }
		
		
		FindIntersectionPointInLinkedList l3=new FindIntersectionPointInLinkedList();
		l3.head = new Node(10);
        l3.head.next = new Node(20);
        l3.head.next.next = new Node(30);
        l3.head.next.next.next = new Node(40);
		l3.display();
		FindIntersectionPointInLinkedList l4=new FindIntersectionPointInLinkedList();
        l4.head = new Node(15);
        l4.head.next = new Node(25);
		l4.head.next.next = new Node(35);
		l4.display();
		FindIntersectionPointInLinkedList l5=new FindIntersectionPointInLinkedList();
        int intersection2= l5.getIntersectionPoint(l3.head, l4.head);
        if (intersection2 != -1) {
            System.out.println("Intersection Point = " + intersection2);
        } else {
            System.out.println("No Intersection");
        }
	}
}


// Test Case 1:
// Input: List1 = [1 → 2 → 3 → 4 → 5], List2 = [6 → 7 → 4 → 5]
// Output: Intersection Point = 4
// Test Case 2:
// Input: List1 = [10 → 20 → 30 → 40], List2 = [15 → 25 → 35]
// Output: No Intersection


// Time Complexity : 
// Insert: O(n)
// FindingMiddle: O(n)
// Display: O(n)

// Space Complexity :
// Insert: O(1)
// FindingMiddle: O(1)
// Display: O(1)
public class RotateLinkedListByKPlaces{
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
	
	Node rotateByKPlaces(Node head, int k){
		if (head == null || k == 0) 
			return head;
        
        Node temp = head;
        int length = 1; 
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        temp.next = head;
        k = k % length;
        
        if (k == 0) {
            temp.next = null; 
            return head;
        }

        temp = head;
        for (int i = 1; i < k ; i++) {
            temp = temp.next;
        }
        
        Node newHead = temp.next;
        temp.next = null;
        
        return newHead;
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
		RotateLinkedListByKPlaces l1=new RotateLinkedListByKPlaces();
		l1.insertEnd(10);
		l1.insertEnd(20);
		l1.insertEnd(30);
		l1.insertEnd(40);
		l1.insertEnd(50);
		l1.display();;
		RotateLinkedListByKPlaces l2=new RotateLinkedListByKPlaces();
		l2.head=l2.rotateByKPlaces(l1.head,2);
		l2.display();
		
		
		RotateLinkedListByKPlaces l3=new RotateLinkedListByKPlaces();
		l3.insertEnd(5);
		l3.insertEnd(10);
		l3.insertEnd(15);
		l3.insertEnd(20);
		l3.display();;
		RotateLinkedListByKPlaces l4=new RotateLinkedListByKPlaces();
		l4.head=l4.rotateByKPlaces(l3.head,3);
		l4.display();
	}
}


// Test Case 1:
// Input: List = [10, 20, 30, 40, 50], k = 2
// Output: List = [30, 40, 50, 10, 20]
// Test Case 2:
// Input: List = [5, 10, 15, 20], k = 3
// Output: List = [20, 5, 10, 15]


// Time Complexity : 
// Insert: O(n)
// RotateByKPlaces: O(n)
// Display: O(n)

// Space Complexity :
// Insert: O(1)
// RotateByKPlaces: O(1)
// Display: O(1)
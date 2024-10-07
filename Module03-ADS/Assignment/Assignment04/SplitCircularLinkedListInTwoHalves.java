public class SplitCircularLinkedListInTwoHalves{
	Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
	
	void insertEnd(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            head.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = node;
        node.next = head; 
    }

    void splitList(SplitCircularLinkedListInTwoHalves list1, SplitCircularLinkedListInTwoHalves list2) {
        if (head == null) 
			return;

        Node slow = head;
        Node fast = head;
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast.next.next == head) {
            fast = fast.next;
        }

        list1.head = head;
        list2.head = slow.next;
		
        fast.next = list2.head; 
        slow.next = list1.head; 
    }

    void traverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        System.out.print("List = [");
        do {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != head) {
                System.out.print(" -> ");
            }
        } while (temp != head);
        System.out.println(" (back to " + head.data + ")]");
    }

    public static void main(String[] args) {
        SplitCircularLinkedListInTwoHalves l1 = new SplitCircularLinkedListInTwoHalves();
        l1.insertEnd(1);
        l1.insertEnd(2);
        l1.insertEnd(3);
        l1.insertEnd(4);
        l1.insertEnd(5);
        l1.insertEnd(6);
		l1.traverse();
        SplitCircularLinkedListInTwoHalves l2 = new SplitCircularLinkedListInTwoHalves();
		SplitCircularLinkedListInTwoHalves l3 = new SplitCircularLinkedListInTwoHalves();
        l1.splitList(l2, l3);
        l2.traverse(); 
        l3.traverse(); 


        SplitCircularLinkedListInTwoHalves l4 = new SplitCircularLinkedListInTwoHalves();
        l4.insertEnd(10);
        l4.insertEnd(20);
        l4.insertEnd(30);
        l4.insertEnd(40);
		l4.traverse();
        SplitCircularLinkedListInTwoHalves l5 = new SplitCircularLinkedListInTwoHalves();
		SplitCircularLinkedListInTwoHalves l6 = new SplitCircularLinkedListInTwoHalves();
        l4.splitList(l5, l6);
        l5.traverse(); 
        l6.traverse();
    }
}


// Test Case 1:
// Input: Circular List = [1 → 2 → 3 → 4 → 5 → 6 → (back to 1)]
// Output: List1 = [1 → 2 → 3], List2 = [4 → 5 → 6]
// Test Case 2:
// Input: Circular List = [10 → 20 → 30 → 40 → (back to 10)]
// Output: List1 = [10 → 20], List2 = [30 → 40]


// Time Complexity : 
// InsertEnd: O(n)
// SplitList: O(n)
// Display: O(n)

// Space Complexity :
// InsertEnd: O(1)
// SplitList: O(n)
// Display: O(1)
public class Main22 { 
	public static void main(String[] args) { 
		static void displayMessage() { 
			System.out.println("Message"); 
		} 
	} 
} 
// Error - illegal start of expression
//         static void displayMessage() {
//         ^
//         Main22.java:7: error: class, interface, enum, or record expected
//         }
//         ^

// Solution - Can a method be declared inside another method?
// Java does not support “directly” nested methods.
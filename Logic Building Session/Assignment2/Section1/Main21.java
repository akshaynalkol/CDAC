/*public class Main21 { 
	public static void main(String[] args) { 
		System.out.println("Hello, World!"); 
		// Missing closing brace here 
}*/
// Error - error: reached end of file while parsing
// }
// ^


public class Main21 { 
	public static void main(String[] args) { 
		System.out.println("Hello, World!"); 
		// Missing closing brace here 
	}
} 
// Solution - What does the compiler say about mismatched braces?
// If the brackets don't all match up, the result is a compile time error.

// Ans - Hello, World!
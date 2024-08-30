/*public class Main25 { 
	public static void main(String[] args) { 
		double score = 85.0; 
		switch(score) { 
			case 100: 
				System.out.println("Perfect score!"); 
				break; 
			case 85: 
				System.out.println("Great job!"); 
				break; 
			default: 
				System.out.println("Keep trying!"); 
		} 
	} 
}*/
// Error - patterns in switch statements are a preview feature and are disabled by default.
// switch(score) {
//       ^
// (use --enable-preview to enable patterns in switch statements)
// Main25.java:5: error: constant label of type int is not compatible with switch selector type double
// case 100:
//      ^
// Main25.java:8: error: constant label of type int is not compatible with switch selector type double
// case 85:
//      ^


public class Main25 { 
	public static void main(String[] args) { 
		int score = 85; 
		switch(score) { 
			case 100: 
				System.out.println("Perfect score!"); 
				break; 
			case 85: 
				System.out.println("Great job!"); 
				break; 
			default: 
				System.out.println("Keep trying!"); 
		} 
	} 
}
// Solution - 
// Why does this code not compile? --> Java has not allowed long, boolean, double, and float in Switch Statement.(Also Variable Is Not Allowed) 

// Ans - Great job!
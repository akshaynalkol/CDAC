public class Main26 { 
	public static void main(String[] args) { 
		int number = 5; 
		switch(number) { 
			case 5: 
				System.out.println("Number is 5"); 
				break; 
			case 5: 
				System.out.println("This is another case 5"); 
				break; 
			default: 
				System.out.println("This is the default case"); 
		} 
	} 
} 
// Error - duplicate case label
//         case 5:

// Solution- 
// Why does the compiler complain about duplicate case labels?
//--> This error occurs because each case label in a switch statement must be unique. 
//    Java relies on these unique labels to determine which block of code to execute based on the value of the expression being evaluated. 
//    Having duplicate labels would create ambiguity in the code, which is why the compiler prevents it.
// What happens when you have two identical case labels in the same switch block? 
// --> Java, having two identical case labels in the same switch block is a compile-time error. 
//     The Java compiler will detect this issue and refuse to compile the code, resulting in an error message indicating that a duplicate case label has been found.
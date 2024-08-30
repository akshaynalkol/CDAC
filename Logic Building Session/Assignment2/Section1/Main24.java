/*public class Main24{ 
	public static void main(String[] args) { 
		int level = 1; 
		switch(level) { 
			case 1: 
				System.out.println("Level 1"); 
			case 2: 
				System.out.println("Level 2"); 
			case 3: 
				System.out.println("Level 3"); 
			default: 
				System.out.println("Unknown level"); 
		} 
	} 
}*/
// Ans - Level 1
//       Level 2
//       Level 3
//       Unknown level

 
public class Main24{ 
	public static void main(String[] args) { 
		int level = 1; 
		switch(level) { 
			case 1: 
				System.out.println("Level 1"); 
				break;
			case 2: 
				System.out.println("Level 2"); 
				break;
			case 3: 
				System.out.println("Level 3"); 
				break;
			default: 
				System.out.println("Unknown level"); 
		} 
	} 
}
// Solution -
// When level is 1, why does it print "Level 1", "Level 2", "Level 3", and "Unknown level"? --> Because break keyword is not used.  
// What is the role of the break statement in this situation? 
//--> The break statement terminates the current loop or switch statement and transfers program control to the statement following the terminated statement.

// Ans - Level 1

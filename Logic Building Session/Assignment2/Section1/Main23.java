/*public class Main23 { 
	public static void main(String[] args) { 
		int value = 2; 
		switch(value) { 
			case 1: 
				System.out.println("Value is 1"); 
			case 2: 
				System.out.println("Value is 2"); 
			case 3: 
				System.out.println("Value is 3"); 
			default: 
				System.out.println("Default case"); 
		} 
	} 
}*/
// Ans- Value is 2
//      Value is 3
//      Default case



public class Main23 { 
	public static void main(String[] args) { 
		int value = 2; 
		switch(value) { 
			case 1: 
				System.out.println("Value is 1"); 
				break;
			case 2: 
				System.out.println("Value is 2"); 
				break;
			case 3: 
				System.out.println("Value is 3"); 
				break;
			default: 
				System.out.println("Default case"); 
		} 
	} 
} 
// Solution - Why does the default case print after "Value is 2"?              --> Because break keyword is not used.  
//            How can you prevent the program from executing the default case? --> Using break keyword.

// Ans- Value is 2
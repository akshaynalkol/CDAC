/*public class Main10 { 
    public void display() { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) { 
       System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
       display(); 
       display(5); 
    } 
}*/
// Error - non-static method display() cannot be referenced from a static context
//         display();
//         non-static method display(int) cannot be referenced from a static context
//         display(5);


public class Main10 { 
    public void display() { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) { 
       System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
	   Main obj = new Main();
       obj.display(); 
       obj.display(5); 
    } 
} 
// Solution - Is method overloading allowed?
// Yes
// If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

// Ans - No parameters
//       With parameter: 5

/*public class Main { 
    public static void main() { 
        System.out.println("Hello, World!"); 
    } 
}*/
// Error - can't find main(String[]) method in class: Main


public class Main4 { 
    public static void main(String arr[]) { 
        System.out.println("Hello, World!"); 
    } 
} 
// Solution - Why is String[] args needed?
//            It stores Java command-line arguments.
//            The String[] args parameter in the main method of Java and C# programs is used to pass command-line arguments to the application. 
//            It is an array of String objects, where each String represents a single command-line argument provided by the user when the program is executed.
//            Here, the name of the String array is args but it is not fixed and the user can use any name in place of it. 
//            public static void main(String arr[])
// Ans      - Hello, World!
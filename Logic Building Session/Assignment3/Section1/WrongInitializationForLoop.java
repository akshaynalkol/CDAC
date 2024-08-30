/*public class WrongInitializationForLoop { 
    public static void main(String[] args) { 
        for (int i = 10; i >= 0; i++) { 
            System.out.println(i); 
        } 
    } 
}*/
// Error    - Infinite Loop --> for (int i = 10; i >= 0; i++)


public class WrongInitializationForLoop { 
    public static void main(String[] args) { 
        for (int i = 10; i >= 0; i--) { 
            System.out.println(i); 
        } 
    } 
} 
// Solution - for (int i = 10; i >= 0; i--)
// Ans      - 10 9 8 7 6 5 4 3 2 1 0
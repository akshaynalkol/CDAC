/*public class InfiniteForLoop { 
    public static void main(String[] args) { 
        for (int i = 0; i < 10; i--) { 
            System.out.println(i); 
        } 
    } 
}*/
// Error    - Infinite Loop --> i--


public class InfiniteForLoop { 
    public static void main(String[] args) { 
        for (int i = 0; i < 10; i++) { 
            System.out.println(i); 
        } 
    } 
} 
// Solution - i++
// Ans      - 0 1 2 3 4 5 6 7 8 9
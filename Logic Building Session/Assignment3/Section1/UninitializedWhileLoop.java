/*public class UninitializedWhileLoop { 
    public static void main(String[] args) { 
        int count; 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
}*/
// Error    - variable count might not have been initialized
//            while (count < 10) {


public class UninitializedWhileLoop { 
    public static void main(String[] args) { 
        int count=0; 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
}	
// Solution - int count=0;
// Ans      - 0 1 2 3 4 5 6 7 8 9
/*public class InfiniteForLoopUpdate { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i += 2) { 
            System.out.println(i); 
        } 
    } 
}*/
// Error    - This may cause unexpected results in output. --> i+=2


public class InfiniteForLoopUpdate { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i ++) { 
            System.out.println(i); 
        } 
    } 
}
// Solution - i++
// Ans      - 0 1 2 3 4  
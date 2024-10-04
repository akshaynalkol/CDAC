import java.util.Scanner;

public class StringPalindrome{	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		String str=sc.nextLine();
		
		// 1
		int left = 0; 
        int right = str.length() - 1; 
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println(false);
				return;
            }
            left++;
            right--;
        }
        System.out.println(true);
		
		// 2
		String res="";
		char arr[]=str.toCharArray();
		for(int i=arr.length-1;i>=0;i--){
			res+=arr[i];
		}
		if(str.equals(res))
			System.out.println(true);
		else
			System.out.println(false);
	}
}

// Input: "hello"
// Output: "olleh"


// Time Complexity: O(n)
// Space Complexity: O(1)
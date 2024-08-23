class Pattern11{
	public static void main(String[] args){
		int no=5;
		
		for(int i=1;i<=no;i++){
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int k=i;k<=2*no-i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=no;i++){
			for(int j=1;j<=no-i;j++){
               System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
               System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
*/
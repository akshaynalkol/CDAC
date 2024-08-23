class Pattern7{
	public static void main(String[] args){
		int no=4;
		
		for(int i=1;i<=no;i++){
			for(int j=1;j<=no-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=no-1;i>=1;i--){
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
      *
     ***
    *****
   *******
  *********
   *******
    *****
     ***
      *
*/
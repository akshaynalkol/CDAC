class Pattern6{
	public static void main(String[] args){
		int no=5;
		
		for(int i=no;i>=0;i--){
			for(int j=1;j<=no-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

/*
  * * * * *
   * * * *
    * * *
     * *
      *
*/
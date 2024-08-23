class Pattern3{
	public static void main(String[] args){
		int no=10;
		
		for(int i=1;i<no;i++){
			if(i%2==0 && i>2){
				continue;
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
*
**
***
*****
*******
*********
*/
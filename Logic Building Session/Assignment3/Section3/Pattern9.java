class Pattern9{
	public static void main(String[] args){
		int no=5;
		
		for(int i=no;i>=1;i--){
			for(int j=no;j>=i;j--){
				if(i==j){
					System.out.print(j);
				}
				else{
					System.out.print(j+"*");
				}
			}
			System.out.println();
		}
	}
}

/*
5
5*4
5*4*3
5*4*3*2
5*4*3*2*1 
*/
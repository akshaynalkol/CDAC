class Pattern8{
	public static void main(String[] args){
		int no=5;
		
		for(int i=1;i<=no;i++){
			for(int j=1;j<=i;j++){
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
1
1*2
1*2*3
1*2*3*4
1*2*3*4*5 
*/
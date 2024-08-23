class Pattern10{
	public static void main(String[] args){
		int no=5;
		
		for(int i=1;i<=no;i++){
			int k=1;
			for(int j=1;j<=i;j++){
				if(i==j){
					System.out.print(k);
					k+=2;
				}
				else{
					System.out.print(k+"*");
					k+=2;
				}
			}
			System.out.println();
		}
	}
}

/*
1
1*3
1*3*5
1*3*5*7
1*3*5*7*9 
*/
class Pattern2{
	public static void main(String[] args){
		int no=5; 
		
		for(int i=1;i<=no;i++){
			for(int j=1;j<=i;j++){
				if(i==j){
					System.out.print(i);
				}
				else{
					System.out.print(i+"*");
				}
			}
			System.out.println();
		}
		
		for(int i=no;i>=1;i--){
			for(int j=1;j<=i;j++){
				if(i==j){
					System.out.print(i);
				}
				else{
					System.out.print(i+"*");
				}
			}
			System.out.println();
		}
	}
}

/*
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
5*5*5*5*5
4*4*4*4
3*3*3
2*2
1
*/
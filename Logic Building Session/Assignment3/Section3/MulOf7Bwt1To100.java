class MulOf7Bwt1To100{
	public static void main(String[] args){
		int no=7;
		
		for(int i=1;i<=100;i++){
            if(i%no==0){
				System.out.print(i+" ");
			}				
		}
	}
}
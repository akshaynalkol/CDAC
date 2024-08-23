class First5PrimeNo{
	public static void main(String[] args){
		int count=0;
		int no=2;		
		
		while(count<5){
			boolean isPrime=true;
			
			if(no<=1){
				isPrime=false;
			}
			else{
				for(int i=2;i*i<=no;i++){
					if(no%i==0){
						isPrime=false;
						break;
					}
				}
			}
			
			if(isPrime){
				System.out.print(no+" ");
				count++;
			}
			no++;
		}
	}
}
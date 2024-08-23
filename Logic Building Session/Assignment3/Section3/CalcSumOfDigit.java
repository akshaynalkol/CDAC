class CalcSumOfDigit{
	public static void main(String[] args){
		int no=9876;		
		int sum=0,temp;
		
		while(no>0){
			temp=no%10;
			no/=10;
			sum+=temp;
		}
		System.out.println(sum);
	}
}
class ReverseNo1234{
	public static void main(String[] args){
		int no=1234;
		int temp,rem=0;
		
		while(no>0){
			temp=no%10;
			no/=10;
			rem=rem*10+temp;
		}
		System.out.println(rem);
	}
}
class LargDigitInNo{
	public static void main(String[] args){
		int no=4825;
		int max=0,temp;
		
		while(no>0){
			temp=no%10;
			no/=10;
			max=Math.max(max,temp);
		}
		System.out.println(max);
	}
}
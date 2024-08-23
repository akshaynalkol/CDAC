class FiboSeriesUpTo21{
	public static void main(String[] args){
		int no=21;
		int no1 = 0, no2 = 1;
		int nextNum=1;
		
		System.out.print(no1+" "+no2);
		
        while (nextNum < 21) {
			nextNum=no1+no2;
            no1 = no2;
            no2 = nextNum;
			System.out.print(" " + nextNum);
        }
	}
}
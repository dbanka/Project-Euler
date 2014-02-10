
public  class Problem6 {
	
	public static void main(String[] args) {
		
		int i,sum=0,sumsquare=0;
		for (i =1; i<101; i++)
		{
			sumsquare += i*i;
			sum += i;
		}
		int squaresum = sum*sum;
		
		System.out.println(+squaresum-sumsquare);
	}
	
}

public  class Problem10 {

    public static boolean isPrime(int x) {
		if (x < 0)
			throw new IllegalArgumentException("Negative number");
		if (x == 0 || x == 1)
			return false;
		else if (x == 2)
			return true;
		else {
			if (x % 2 == 0)
				return false;
			double end = Math.sqrt(x);
			for (int i = 3; i <= end ; i += 2) {
				if (x % i == 0)
					return false;
			}
			return true;
		}
	}
	
	
	public static void main(String[] args) {
		
		long sum=0;
		for (int i = 2 ;i<2000000 ; i++) {
			if (isPrime(i))
			   sum += i;
			  }
		System.out.println(+sum);
		}
		
		
	}
	

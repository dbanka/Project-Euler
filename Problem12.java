public class Problem12 {


	public static void main(String[] args) {
		int triangle=0;
		for(int i=1; ;i++)
		{ triangle +=i;
		  if(factors(triangle) >= 500)
		   { System.out.println(+triangle);
		     return;
		   }	  
		}
	}
	
	public static int factors(int n)
	{  int count = 0;
	   double end = Math.sqrt(n);
	   for (int i = 1; i < end; i++) {
		if (n % i == 0)
			count += 2;
	}
	if (end * end == n)  // Perfect square
		count++;
	return count;
	}
}
	

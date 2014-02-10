
public class Problem9 {

	public static void main(String[] args) {
		int a=0,b=0,x;
		
		for(a=1;a<1000;a++)
		 for(b=1;b<1000;b++)
			{ x=a*a+b*b;
			double c=Math.sqrt(x);
			int abc= (int) (a*b*c);
			if((a+b+c)== 1000.0)
			  {
				System.out.println(+abc);
			    break;
			  }
			}
		 
		}

}

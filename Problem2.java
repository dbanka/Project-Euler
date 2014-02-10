class Problem2{

public static void main(String args[])
	{		
		int prev, next, sum, n, evensum;
		prev=1;
                next=2;
                evensum=2;
		for(n=1;next<4000000;n++)
		{
			sum=prev+next;
			prev=next;
			next=sum;
                        if(sum%2==0)
                        {evensum=evensum +sum;}
                        
		}
 System.out.println("sum is" + evensum);
             
	}
}

class Problem4 
{ 
  public static void main(String args[])
  {
   int i,j,product,palindromemax=0;
   
   for(i=999;i>99;i--)
    for(j=999;j>99;j--)
     { product= i*j;
	   if( checkpalindrome(product) && product > palindromemax)
	    palindromemax=product;
	 }
	 System.out.println(" " + palindromemax);
   }
  
   public static boolean checkpalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if (number == reverse) {
            return true;
        }
        return false;
    }

}

   
   
   
   
    

import java.util.*;

 class Prime17
{
  public static void main(String[] args)
 {
	int number = 100;
	 int i;
	   int j, n ; 
	     int isPrime;
	   System.out.println("All Prime Numbers Between 1 to 100 ");

	for( i = 2 ; i <= number ; i++)
  {
	for(j = 2 ; j <= i / 2 ; j++)
   {
	  if( i % j == 0 )
    {
		isPrime = 1;
		  break;
    }
   }
	   if ( isPrime == 0)
	      System.out.print( i + " , ");

  }
 }
}
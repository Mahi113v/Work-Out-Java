import java.util.*;

 class AEven22
{
  public static void main(String[] args)
 {
	int number = 20;
	 int i, j;
	   System.out.println("Print the Even number from 1 to 20 is : " + number + "  : " );

	for( i = 1 ; i <= number ; i++)
  {
	 if(i% 2 == 0)
	   System.out.print( i + " , ");
   }

	   System.out.println("\n Print the Odd number from 1 to 20 is : " + number + "  : " );
	for( j = 1 ; j <= number ; j++)
    {
	 if(j% 2 != 0)
	   System.out.print( j + " , ");
    }
  }
 }
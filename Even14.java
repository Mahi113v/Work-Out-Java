import java.util.*;

 class Even14
{
  public static void main(String[] args)
 {
	int number = 20;
	 int i;
	   System.out.println("Print the odd number from 1 to : " + number + "  : " );

	for( i = 1 ; i <= number ; i++)
  {
	 if(i% 2 == 0)
   {
	   System.out.print( i + " , ");
   }
  }
 }
}
import java.util.*;

 public class WrapperEx // AutoBox
{
  public static void main(String args[])
 {
	Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the integer value is : ");
	    int a = sc.nextInt();
	      //int a = 20;
	        Integer i = Integer.valueOf(a);
	          Integer j = a;

 	System.out.println(a + " " + i + " " + j);
 }
}
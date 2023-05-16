import java.util.*;

 class Second16
{
  public static void main(String[] args)
 {
	Scanner sc = new Scanner ( System.in );
	 System.out.println("Enter Seconds : ");
	   long a = sc.nextLong();
	long S = a % 60;
	 long H = a / 60;
	  long M = H % 60;
	   H = H / 60 ;

	  System.out.println( H + " : " + M + " : " + S);
	      //System.out.println("\n");
 }
}
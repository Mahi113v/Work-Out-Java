import java.util.*;

 class Palindrome19
{
  public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Number : ");
	int n = sc.nextInt();
	 int sum=0;
	  int temp;
	   int n = 454;
	    int r;
	temp=n;
	while(n > 0)
  {    
	  r = n%10;
	   sum = (sum*10) + r;
	     n = n/10;
  }
	if( temp == sum)
	  System.out.println("palindrome number ");
	    else
	  System.out.println("not palindrome");
 }
}
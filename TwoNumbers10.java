import java.util.*;

 class TwoNumbers10
{
  public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value A : ");
	long a = sc.nextLong();
    System.out.println("Enter the value B : ");
	long b = sc.nextLong();

    if(a > b)
  {
      System.out.println(a + " is Greater than " + b);
  }
    else if(a < b)
   {  
      System.out.println(a + " is Lesser than " + b);
   }
    else 
    {
      System.out.println(a + " is Equal to " + b);
    }
 }
}
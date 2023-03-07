import java.util.*;

 class MOverloading
{
  public void m1( int a, int b)
 {
   System.out.println(a+b);
 }
  public void m1( int c, String d)
 {
   System.out.println(c + " " + d);
 }
  public void m1( int e, String f, long g)
 {
   System.out.println(e + " , " + f + " , " + g);
 }

  public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Your Name : ");
	    String d = sc.nextLine();
	  System.out.println("Enter Your Name: ");
	    String f = sc.nextLine();
	  System.out.println("Enter Value A : ");
	    int a = sc.nextInt();
	  System.out.println("Enter Value B : ");
	    int b = sc.nextInt();
	  System.out.println("Enter Value C : ");
	    int c = sc.nextInt();
	  System.out.println("Enter Value E : ");
	    int e = sc.nextInt();
	  System.out.println("Enter Your Number : ");
	    long g = sc.nextLong();

   MOverloading obj = new MOverloading();
	obj.m1(a, b);
	 obj.m1(c, d);
	  obj.m1(e, f, g);
  }
}
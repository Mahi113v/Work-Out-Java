import java.util.*;

 class Anonm
{
   int a, b;

  public void addition (int a, int b)
 {
   System.out.println(a+b);
   System.out.println(a*b);
   System.out.println(a-b);
   System.out.println(a/b);
   System.out.println(a%b);
 }
  public static void main(String args[])
  {
	Anonm an = new Anonm();
	Scanner sc = new Scanner(System.in);
	  System.out.print("Enter value of A : ");
	   an.a = sc.nextInt();
	  System.out.print("Enter value of B : ");
	   an.b = sc.nextInt();

         an.addition();

  }

}

import java.util.*;

 class Arithmatic18
{
  public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter the value of A : ");
       int a = sc.nextInt();
     System.out.println("Enter the value of B : ");
       int b = sc.nextInt();
         int sum = a-~b-1;
	 System.out.println("Addition is : " + a + " " + b + " = " + sum);

 }
}
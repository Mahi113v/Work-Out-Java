import java.util.*;

 class TStudent
{
  int a, b;
 public void math(int a, int b)
 {
    System.out.println("Addition Value is : " + a + " + " + b + " = " + (a+b));
      System.out.println("Multification Value is : " + a + " * " + b + " = " + (a*b));
  }
   public static void main(String args[])
  {
    TStudent m = new TStudent ();
   Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of A : ");
        m.a = sc.nextInt();
      System.out.println("Enter the value of B : ");
        m.b = sc.nextInt();
     m.math(m.a, m.b);
  }
}
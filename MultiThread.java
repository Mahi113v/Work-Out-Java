import java.util.*;

 class A extends Thread
{
  public void run()
 {
   int a=50, b=113;
     System.out.println("Thread Addition is "+" = "+(a*b)+";");
 }
}
 class B extends Thread
{
  public void run()
 {
   int a=50, b=11;
     System.out.println("Thread Subtraction is "+" = "+(a-b)+";");
 }
}
  class C extends Thread
{
  public void run()
 {
   int a=22, b=13;
     System.out.println("Thread Multiplication is "+" = "+(a*b)+";");
 }
}
   class D extends Thread
{
  public void run()
 {
   int a=113, b=11;
     System.out.println("Thread Division is "+" = "+(a/b)+";");
 }
}
   class MultiThread
{
   public static void main(String args[])
  {
	A m = new A();
	B v = new B();
	C r = new C();
	D p = new D();

	 m.start();
	 v.start();
	 r.start();
	 p.start();
  }
}
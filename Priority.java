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

  class Priority
{
  public static void main(String args[])
 {
	A m = new A();
	  B v = new B();
	    C r = new C();

	 m.setPriority(Thread.MAX_PRIORITY);
	   v.setPriority(m.getPriority()+1);
	     r.setPriority(Thread.MIN_PRIORITY);

	 m.start();
	   v.start();
	     r.start();
 }
}
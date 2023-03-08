import java.util.*;

 class A extends Thread
{
  public void run()
 {
	int num = 5;
 	for (int i = 1; i <= 10; i++)
  {
 	  System.out.println(i + "*"+ 5 + " = " + (i * 5));
  }
 }
}

 class B extends Thread
{
  public void run()
 {
	int a = 0;
	  int b = 1;
	    int c;

	for(int i = 0; i < 5; ++i)
   {
     c = a + b;
      System.out.println(c);
	a = b;
	b = c;
	c = a;

      System.out.print("Fibonacci is = " + c);
  }
 }
}
  class C extends Thread
{
  public void run()
 {
	int i;
	int fact = 1;  
	  int num = 5;  
	for(i = 1; i <= num; i++)
  {
	fact=fact*i;    
  }
  System.out.println("Factorial " + num + " is : " + fact);    
 }  
}
   class D extends Thread
{
  public void run()
 {
        int [] array = new int [] {1, 2, 3, 4, 5};  
          int sum = 0;
        for (int i = 0; i < array.length; ++i)
  {  
           sum = sum + array[i];  
  }  
        System.out.println("Sum of Using Array is : " + sum);
 }
}
   class MultiThreadEx
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
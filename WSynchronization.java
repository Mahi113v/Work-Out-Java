import java.util.*;

class Mahi
{
 synchronized void printMahi(int n)
 {
	for(int i=1;i<=5;i++)
  {
	  System.out.println(i*n);
	try
   {
	  Thread.sleep(4000);
   } catch(Exception e) {
	System.out.println(e);
	}
  }
 }
}
class M extends Thread
{
  Mahi t;
    M(Mahi t)
 {
      this.t = t;
 }
	public void run()
 {
	   t.printMahi(6);
 }
}
class R extends Thread
{
  Mahi t;
    R(Mahi t)
 {
      this.t = t;
 }
	public void run()
 {
	   t.printMahi(200);
 }
}
class WSynchronization
{
  public static void main(String[] args)
 {
	Mahi t1 = new Mahi();
	  M obj1 = new M(t1);
	    R obj2 = new R(t1);

	obj1.start();
	   obj2.start();
 }
}

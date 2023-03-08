import java.util.*;

 class ThreadEx extends Thread
{
  public void run()
 {
   int a=50, b=113;
     System.out.println("Thread Addition is "+" = "+(a+b)+";");
 }
  static void Interrupted()
  {
	//System.out.println("Thread is Active");
  }
   public static void main(String args[])
  {
    ThreadEx m = new ThreadEx();
      m.start();
  }
}
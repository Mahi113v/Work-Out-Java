import java.util.*;

 class TRun implements Runnable //Thread Runnable
{
  public void run()
 {
   int a=50, b=113;
     System.out.println("Thread Addition is "+" = "+(a*b)+";");
 }
  static void Interrupt()
  {
	//System.out.println("Thread is Active");
  }
   public static void main(String args[])
  {
    TRun m = new TRun();
      Thread v = new Thread(m);
         v.start();
  }
}
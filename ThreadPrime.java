import java.util.*;

 class Prime extends Thread
{
   public void run()
 {
	Scanner sc = new Scanner(System.in);
	   System.out.println("Enterv the prime Number is : ");
	     int n = sc.nextInt();
	   boolean flag=false;

	for(int i=2;i<=n/2;++i)
  {
	if(n%2==0)
   {
	flag = true;
	   break;
   }
  }
	if(!flag)
    {
	    System.out.println("The given number is prime");
    } else {
	    System.out.println("The given number is not a prime");
      }
  }
}
 class ThreadPrime
{
   public static void main(String[] args)
 {
    Prime obj = new Prime();
      obj.start();
 }
}
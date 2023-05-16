import java.util.*;

 class Swap6
{
  public static void main(String[] args)
{
	int a;
         int b;
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of A");  
        a = sc.nextInt();
      System.out.println("Enter the value of B"); 
         b = sc.nextInt();

       a = b;
        b = a;
           System.out.println("before swapping numbers: "+a +"\t"+ b);
        b = a;
          System.out.println("After swapping: "+b +"\t" + a);  
             System.out.println( );  
    }    
}  
import java.util.*;

 class Swap5
{
  public static void main(String[] args)
{
	String t;
         String x;
          String y;
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of X");  
        x = sc.nextLine();
      System.out.println("Enter the value of Y"); 
         y = sc.nextLine();  

           System.out.println("before swapping numbers: "+x +"\t"+ y);
 
       t = x;  
        x = y;  
         y = t;

          System.out.println("After swapping: "+x +"\t" + y);  
             System.out.println( );  
    }    
}  
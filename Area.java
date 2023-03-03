import java.util.*;
class Area 
{
 public static void main(String args[]) 

{   

  Scanner input = new Scanner(System.in);
        
    System.out.println("Enter the first value:");
    double m = input.nextDouble();
    System.out.println("Enter the second value:");
    double b = input.nextDouble();
      double  area =(m*b)/2;
      System.out.println("Area: " + area);      
  }

}
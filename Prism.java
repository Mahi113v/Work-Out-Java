import java.util.*;
class Prism 
{
 public static void main(String args[]) 

{   

  Scanner input = new Scanner(System.in);
        
    System.out.println("Enter the first value:");
    double m = input.nextDouble();
    System.out.println("Enter the second value:");
    double b = input.nextDouble();
    System.out.println("Enter the third value");
    double c = input.nextDouble();

      double  prism = 2 * ((m * b) + (c * b) + (m * c));
      System.out.println("Prism: " + prism);      
  }

}